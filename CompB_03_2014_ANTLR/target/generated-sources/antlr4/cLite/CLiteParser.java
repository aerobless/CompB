// Generated from CLite.g4 by ANTLR 4.2.2
package cLite;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLiteParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, EquOp=19, RelOp=20, AddOp=21, MulOp=22, Unaryop=23, 
		Identifier=24, LETTER=25, DIGIT=26, LITERAL=27, IntegerType=28, BooleanType=29, 
		FloatType=30, CharType=31, CharacterLiteral=32, SingleCharacter=33, CharLiteral=34, 
		WS=35, COMMENT=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'char'", "'float'", "'||'", "'while'", "'['", 
		"';'", "'{'", "'&&'", "'='", "']'", "'}'", "'if'", "'bool'", "' '", "'int'", 
		"'('", "')'", "EquOp", "RelOp", "AddOp", "MulOp", "Unaryop", "Identifier", 
		"LETTER", "DIGIT", "LITERAL", "IntegerType", "BooleanType", "FloatType", 
		"CharType", "CharacterLiteral", "SingleCharacter", "CharLiteral", "WS", 
		"COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_block = 6, RULE_assignment = 7, 
		RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_expression = 10, RULE_conjunction = 11, 
		RULE_equality = 12, RULE_relation = 13, RULE_addition = 14, RULE_term = 15, 
		RULE_factor = 16, RULE_primary = 17;
	public static final String[] ruleNames = {
		"program", "declarations", "declaration", "type", "statements", "statement", 
		"block", "assignment", "ifStatement", "whileStatement", "expression", 
		"conjunction", "equality", "relation", "addition", "term", "factor", "primary"
	};

	@Override
	public String getGrammarFileName() { return "CLite.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> COMMENT() { return getTokens(CLiteParser.COMMENT); }
		public TerminalNode EOF() { return getToken(CLiteParser.EOF, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(CLiteParser.COMMENT, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(36); match(COMMENT);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42); match(16);
			setState(43); match(1);
			setState(44); match(17);
			setState(45); match(18);
			setState(46); match(8);
			setState(47); declarations();
			setState(48); statements();
			setState(49); match(12);
			setState(50); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 14) | (1L << 16))) != 0)) {
				{
				{
				setState(52); declaration();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CLiteParser.Identifier, 0); }
		public TerminalNode WS(int i) {
			return getToken(CLiteParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(CLiteParser.WS); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); type();
			setState(60); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(59); match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(64); match(Identifier);
			setState(65); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 14) | (1L << 16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 8) | (1L << 13) | (1L << Identifier))) != 0)) {
				{
				{
				setState(69); statement();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); match(7);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); block();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); assignment();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79); whileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(8);
			setState(83); statements();
			setState(84); match(12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CLiteParser.Identifier, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(Identifier);
			setState(91);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(87); match(6);
				setState(88); expression();
				setState(89); match(11);
				}
			}

			setState(93); match(10);
			setState(94); expression();
			setState(95); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(13);
			setState(99);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(98); match(15);
				}
			}

			setState(101); match(17);
			setState(102); expression();
			setState(103); match(18);
			setState(104); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(5);
			setState(108);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(107); match(15);
				}
			}

			setState(110); match(17);
			setState(111); expression();
			setState(112); match(18);
			setState(113); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); conjunction();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(116); match(4);
				setState(117); conjunction();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); equality();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(124); match(9);
				setState(125); equality();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode EquOp() { return getToken(CLiteParser.EquOp, 0); }
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); relation();
			setState(134);
			_la = _input.LA(1);
			if (_la==EquOp) {
				{
				setState(132); match(EquOp);
				setState(133); relation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode RelOp() { return getToken(CLiteParser.RelOp, 0); }
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); addition();
			setState(139);
			_la = _input.LA(1);
			if (_la==RelOp) {
				{
				setState(137); match(RelOp);
				setState(138); addition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AddOp() { return getTokens(CLiteParser.AddOp); }
		public TerminalNode AddOp(int i) {
			return getToken(CLiteParser.AddOp, i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); term();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AddOp) {
				{
				{
				setState(142); match(AddOp);
				setState(143); term();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public List<TerminalNode> MulOp() { return getTokens(CLiteParser.MulOp); }
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MulOp(int i) {
			return getToken(CLiteParser.MulOp, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); factor();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MulOp) {
				{
				{
				setState(150); match(MulOp);
				setState(151); factor();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Unaryop() { return getToken(CLiteParser.Unaryop, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if (_la==Unaryop) {
				{
				setState(157); match(Unaryop);
				}
			}

			setState(160); primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CLiteParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(CLiteParser.LITERAL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteListener ) ((CLiteListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteVisitor ) return ((CLiteVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primary);
		int _la;
		try {
			setState(179);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); match(Identifier);
				setState(167);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(163); match(6);
					setState(164); expression();
					setState(165); match(11);
					}
				}

				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(LITERAL);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); match(17);
				setState(171); expression();
				setState(172); match(17);
				}
				break;
			case 2:
			case 3:
			case 14:
			case 16:
				enterOuterAlt(_localctx, 4);
				{
				setState(174); type();
				setState(175); match(17);
				setState(176); expression();
				setState(177); match(18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\6\4?\n\4\r\4\16\4@\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\3\7\3\7\3\7\3\7\5\7S\n"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\5\nf\n\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13o\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\r\3\r\3\r\7\r\u0081\n\r"+
		"\f\r\16\r\u0084\13\r\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\5\17"+
		"\u008e\n\17\3\20\3\20\3\20\7\20\u0093\n\20\f\20\16\20\u0096\13\20\3\21"+
		"\3\21\3\21\7\21\u009b\n\21\f\21\16\21\u009e\13\21\3\22\5\22\u00a1\n\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00aa\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b6\n\23\3\23\4)@\2\24\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$\2\3\5\2\4\5\20\20\22\22\u00bb\2)\3\2"+
		"\2\2\49\3\2\2\2\6<\3\2\2\2\bE\3\2\2\2\nJ\3\2\2\2\fR\3\2\2\2\16T\3\2\2"+
		"\2\20X\3\2\2\2\22c\3\2\2\2\24l\3\2\2\2\26u\3\2\2\2\30}\3\2\2\2\32\u0085"+
		"\3\2\2\2\34\u008a\3\2\2\2\36\u008f\3\2\2\2 \u0097\3\2\2\2\"\u00a0\3\2"+
		"\2\2$\u00b5\3\2\2\2&(\7&\2\2\'&\3\2\2\2(+\3\2\2\2)*\3\2\2\2)\'\3\2\2\2"+
		"*,\3\2\2\2+)\3\2\2\2,-\7\22\2\2-.\7\3\2\2./\7\23\2\2/\60\7\24\2\2\60\61"+
		"\7\n\2\2\61\62\5\4\3\2\62\63\5\n\6\2\63\64\7\16\2\2\64\65\7\2\2\3\65\3"+
		"\3\2\2\2\668\5\6\4\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5"+
		"\3\2\2\2;9\3\2\2\2<>\5\b\5\2=?\7%\2\2>=\3\2\2\2?@\3\2\2\2@A\3\2\2\2@>"+
		"\3\2\2\2AB\3\2\2\2BC\7\32\2\2CD\7\t\2\2D\7\3\2\2\2EF\t\2\2\2F\t\3\2\2"+
		"\2GI\5\f\7\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LJ\3\2"+
		"\2\2MS\7\t\2\2NS\5\16\b\2OS\5\20\t\2PS\5\22\n\2QS\5\24\13\2RM\3\2\2\2"+
		"RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\r\3\2\2\2TU\7\n\2\2UV\5\n\6"+
		"\2VW\7\16\2\2W\17\3\2\2\2X]\7\32\2\2YZ\7\b\2\2Z[\5\26\f\2[\\\7\r\2\2\\"+
		"^\3\2\2\2]Y\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\f\2\2`a\5\26\f\2ab\7\t\2\2"+
		"b\21\3\2\2\2ce\7\17\2\2df\7\21\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\23"+
		"\2\2hi\5\26\f\2ij\7\24\2\2jk\5\f\7\2k\23\3\2\2\2ln\7\7\2\2mo\7\21\2\2"+
		"nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\23\2\2qr\5\26\f\2rs\7\24\2\2st\5\f"+
		"\7\2t\25\3\2\2\2uz\5\30\r\2vw\7\6\2\2wy\5\30\r\2xv\3\2\2\2y|\3\2\2\2z"+
		"x\3\2\2\2z{\3\2\2\2{\27\3\2\2\2|z\3\2\2\2}\u0082\5\32\16\2~\177\7\13\2"+
		"\2\177\u0081\5\32\16\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\31\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0088\5\34\17\2\u0086\u0087\7\25\2\2\u0087\u0089\5\34\17\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\33\3\2\2\2\u008a\u008d\5\36\20\2\u008b"+
		"\u008c\7\26\2\2\u008c\u008e\5\36\20\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\35\3\2\2\2\u008f\u0094\5 \21\2\u0090\u0091\7\27\2\2\u0091"+
		"\u0093\5 \21\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\37\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009c"+
		"\5\"\22\2\u0098\u0099\7\30\2\2\u0099\u009b\5\"\22\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d!"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7\31\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5$\23\2\u00a3#\3"+
		"\2\2\2\u00a4\u00a9\7\32\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\5\26\f\2\u00a7"+
		"\u00a8\7\r\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00b6\3\2\2\2\u00ab\u00b6\7\35\2\2\u00ac\u00ad\7\23\2\2\u00ad"+
		"\u00ae\5\26\f\2\u00ae\u00af\7\23\2\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\5"+
		"\b\5\2\u00b1\u00b2\7\23\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\7\24\2\2"+
		"\u00b4\u00b6\3\2\2\2\u00b5\u00a4\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00ac"+
		"\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6%\3\2\2\2\23)9@JR]enz\u0082\u0088\u008d"+
		"\u0094\u009c\u00a0\u00a9\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}