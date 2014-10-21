package parser;

import lexer.Lexer;
import symbolTabelle.Token;
import symbolTabelle.TokenType;

// Parser.java
// Recursive descent parser für Clite

public class Parser {

	Token token; // Token vom input stream
	Lexer lexer;
	String funcId = "main";

	public Parser(Lexer ts) { // Open Clite Source Programm
		lexer = ts; // als Tokenstream
		token = lexer.next(); // lesen des ersten Tokens.
	}

	private String match(TokenType t) {
		String value = token.value();
		if (token.type().equals(t))
			token = lexer.next();
		else
			error(t);
		return value;
	}

	private void error(TokenType tok) {
		System.err.println("Syntax error: erwartet wurde: " + tok
				+ "; gesehen wird: " + token);
		System.exit(1);
	}

	private void error(String tok) {
		System.err.println("Syntax error: erwartet wurde: " + tok
				+ "; gesehen wird: " + token);
		System.exit(1);
	}

	public Program program() {
		// Program --> void main ( ) '{' Declarations Statements '}'
		TokenType[] header = { TokenType.Int, TokenType.Main,
				TokenType.LeftParen, TokenType.RightParen };
		for (int i = 0; i < header.length; i++)
			// bypass "int main ( )"
			match(header[i]);
		match(TokenType.LeftBrace);
		Declarations decpart = declarations();
		Block body = statements();
		match(TokenType.RightBrace);
		return new Program(decpart, body);
	}

	private Declarations declarations() {
		// Declarations --> { Declaration }
		Declarations ds = new Declarations();
		while (isType()) {
			declaration(ds);
		}
		return ds;
	}

	private void declaration(Declarations ds) {
		// Declaration --> Type Identifier { , Identifier } ;
		Type t = type();
		while (!token.type().equals(TokenType.Semicolon)) {
			String id = match(TokenType.Identifier);
			ds.add(new Declaration(id, t));
			if (token.type().equals(TokenType.Comma))
				match(TokenType.Comma);
		}
		match(TokenType.Semicolon);
	}

	private Type type() {
		// Type --> int | bool | float | char
		Type t = null;
		
		if (token.type().equals(TokenType.Int))
			t = Type.INT;
		else if (token.type().equals(TokenType.Bool))
			t = Type.BOOL;
		else if (token.type().equals(TokenType.Float))
			t = Type.FLOAT;
		else if (token.type().equals(TokenType.Char))
			t = Type.CHAR;
		else
			error("int | bool | float | char");
		token = lexer.next(); // pass over the type
		return t;
	}

	private Statement statement() {
		// Statement --> ; | Block | Assignment | IfStatement | WhileStatement
		Statement s = new Skip();
		if (token.type().equals(TokenType.Semicolon)) // Skip
			token = lexer.next();
		else if (token.type().equals(TokenType.LeftBrace)) { // Block
			token = lexer.next();
			s = statements();
			match(TokenType.RightBrace);
		} 
		// TODO 
		/*
		 * IfStatement 1-2 Zeilen
		 */
		
		
		
		/*
		 * WhileStatement 1-2 Zeilen
		 */

		
		
		/*
		 * Assignment 1-2 Zeilen
		 */

		else
			error("Illegal statement");
		return s;
	}

	private Block statements() {
		// Block --> '{' Statements '}'
		Block b = new Block();
		while (!token.type().equals(TokenType.RightBrace)) {
			b.members.add(statement());
		}
		return b;
	}

	private Assignment assignment() {
		// Assignment --> Identifier = Expression ;
		Variable target = new Variable(match(TokenType.Identifier));
		match(TokenType.Assign);
		Expression source = expression();
		match(TokenType.Semicolon);
		return new Assignment(target, source);
	}

	private Conditional ifStatement() {
		// IfStatement --> if ( Expression ) Statement [ else Statement ]
		match(TokenType.If);
		Expression test = expression();
		Statement thenbranch = statement();
		Statement elsebranch = new Skip();
		if (token.type().equals(TokenType.Else)) {
			token = lexer.next();
			elsebranch = statement();
		}
		return new Conditional(test, thenbranch, elsebranch);
	}

	private Loop whileStatement() {
		// WhileStatement --> while ( Expression ) Statement
		match(TokenType.While);
		match(TokenType.LeftParen);
		Expression test = expression();
		match(TokenType.RightParen);
		Statement body = statement();
		return new Loop(test, body);
	}

	private Expression expression() {
		// Expression --> Conjunction { || Conjunction }
		Expression e = conjunction();
		while (token.type().equals(TokenType.Or)) {
			Operator op = new Operator(token.value());
			token = lexer.next();
			Expression term2 = conjunction();
			e = new Binary(op, e, term2);
		}
		return e;
	}

	private Expression conjunction() {
		// Conjunction --> Equality { && Equality }
		Expression e = equality();
		while (token.type().equals(TokenType.And)) {
			Operator op = new Operator(token.value());
			token = lexer.next();
			Expression term2 = equality();
			e = new Binary(op, e, term2);
		}
		return e;
	}

	private Expression equality() {
		// Equality --> Relation [ EquOp Relation ]
		Expression e = relation();
		while (isEqualityOp()) {
			Operator op = new Operator(token.value());
			token = lexer.next();
			Expression term2 = relation();
			e = new Binary(op, e, term2);
		}
		return e;
	}

	private Expression relation() {
		// Relation --> Addition [RelOp Addition]
		Expression e = addition();
		while (isRelationalOp()) {
			Operator op = new Operator(token.value());
			token = lexer.next();
			Expression term2 = addition();
			e = new Binary(op, e, term2);
		}
		return e;
	}

	private Expression addition() {
		// Addition --> Term { AddOp Term }
		Expression e = term();
		while (isAddOp()) {
			Operator op = new Operator(match(token.type()));
			Expression term2 = term();
			e = new Binary(op, e, term2);
		}
		return e;
	}

	private Expression term() {
		// Term --> Factor { MultiplyOp Factor }
		Expression e = factor();
		while (isMultiplyOp()) {
			Operator op = new Operator(match(token.type()));
			Expression term2 = factor();
			e = new Binary(op, e, term2);
		}
		return e;
	}

	private Expression factor() {
		// Factor --> [ UnaryOp ] Primary
		if (isUnaryOp()) {
			Operator op = new Operator(match(token.type()));
			Expression term = primary();
			return new Unary(op, term);
		} else
			return primary();
	}

	private Expression primary() {
		// Primary --> Identifier | Literal | ( Expression )
		// | Type ( Expression )
		Expression e = null;
		if (token.type().equals(TokenType.Identifier)) {
			Variable v = new Variable(match(TokenType.Identifier));
			e = v;
		} else if (isLiteral()) {
			e = literal();
		} else if (token.type().equals(TokenType.LeftParen)) {
			token = lexer.next();
			e = expression();
			match(TokenType.RightParen);
		} else if (isType()) {
			Operator op = new Operator(match(token.type()));
			match(TokenType.LeftParen);
			Expression term = expression();
			match(TokenType.RightParen);
			e = new Unary(op, term);
		} else
			error("Identifier | Literal | ( | Type");
		return e;
	}

	@SuppressWarnings("incomplete-switch")
	private Value literal() {
		String s = null;
		switch (token.type()) {
		case IntLiteral:
			s = match(TokenType.IntLiteral);
			return new IntValue(Integer.parseInt(s));
		case CharLiteral:
			s = match(TokenType.CharLiteral);
			return new CharValue(s.charAt(0));
		case True:
			s = match(TokenType.True);
			return new BoolValue(true);
		case False:
			s = match(TokenType.False);
			return new BoolValue(false);
		case FloatLiteral:
			s = match(TokenType.FloatLiteral);
			return new FloatValue(Float.parseFloat(s));
		}
		throw new IllegalArgumentException("should not reach here");
	}

	private boolean isAddOp() {
		return token.type().equals(TokenType.Plus)
				|| token.type().equals(TokenType.Minus);
	}

	private boolean isMultiplyOp() {
		return token.type().equals(TokenType.Multiply)
				|| token.type().equals(TokenType.Divide);
	}

	private boolean isUnaryOp() {
		return token.type().equals(TokenType.Not)
				|| token.type().equals(TokenType.Minus);
	}

	private boolean isEqualityOp() {
		return token.type().equals(TokenType.Equals)
				|| token.type().equals(TokenType.NotEqual);
	}

	private boolean isRelationalOp() {
		return token.type().equals(TokenType.Less)
				|| token.type().equals(TokenType.LessEqual)
				|| token.type().equals(TokenType.Greater)
				|| token.type().equals(TokenType.GreaterEqual);
	}

	private boolean isType() {
		return token.type().equals(TokenType.Int)
				|| token.type().equals(TokenType.Bool)
				|| token.type().equals(TokenType.Float)
				|| token.type().equals(TokenType.Char);
	}

	private boolean isLiteral() {
		return token.type().equals(TokenType.IntLiteral) || isBooleanLiteral()
				|| token.type().equals(TokenType.FloatLiteral)
				|| token.type().equals(TokenType.CharLiteral);
	}

	private boolean isBooleanLiteral() {
		return token.type().equals(TokenType.True)
				|| token.type().equals(TokenType.False);
	}

	public static void main(String args[]) {
		System.out.println("Begin parsing... " + args[0]);
		Parser parser = new Parser(new Lexer(args[0]));
		Program prog = parser.program();
		prog.display(); // display abstract syntax tree
	} // main

} // Parser
