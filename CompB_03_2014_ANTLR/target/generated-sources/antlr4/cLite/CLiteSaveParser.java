// Generated from CLiteSave.g4 by ANTLR 4.2.2
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
public class CLiteSaveParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, EquOp=19, RelOp=20, AddOp=21, MulOp=22, Unaryop=23, 
		LETTER=24, DIGIT=25, IntegerType=26, BooleanType=27, FloatType=28, CharType=29, 
		CharacterLiteral=30, SingleCharacter=31, CharLiteral=32, WS=33, COMMENT=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'char'", "'float'", "'||'", "'while'", "'['", 
		"';'", "'{'", "'&&'", "'='", "']'", "'}'", "'if'", "'bool'", "' '", "'int'", 
		"'('", "')'", "EquOp", "RelOp", "AddOp", "MulOp", "Unaryop", "LETTER", 
		"DIGIT", "IntegerType", "BooleanType", "FloatType", "CharType", "CharacterLiteral", 
		"SingleCharacter", "CharLiteral", "WS", "COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_block = 6, RULE_assignment = 7, 
		RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_expression = 10, RULE_conjunction = 11, 
		RULE_equality = 12, RULE_relation = 13, RULE_addition = 14, RULE_term = 15, 
		RULE_factor = 16, RULE_primary = 17, RULE_identifier = 18, RULE_literal = 19;
	public static final String[] ruleNames = {
		"program", "declarations", "declaration", "type", "statements", "statement", 
		"block", "assignment", "ifStatement", "whileStatement", "expression", 
		"conjunction", "equality", "relation", "addition", "term", "factor", "primary", 
		"identifier", "literal"
	};

	@Override
	public String getGrammarFileName() { return "CLiteSave.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLiteSaveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> COMMENT() { return getTokens(CLiteSaveParser.COMMENT); }
		public TerminalNode WS(int i) {
			return getToken(CLiteSaveParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(CLiteSaveParser.WS); }
		public TerminalNode EOF() { return getToken(CLiteSaveParser.EOF, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(CLiteSaveParser.COMMENT, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(40); match(COMMENT);
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(46); match(16);
			setState(47); match(WS);
			setState(48); match(1);
			setState(49); match(WS);
			setState(50); match(17);
			setState(51); match(WS);
			setState(52); match(18);
			setState(53); match(WS);
			setState(54); match(8);
			setState(55); match(WS);
			setState(56); declarations();
			setState(57); statements();
			setState(58); match(WS);
			setState(59); match(12);
			setState(60); match(WS);
			setState(61); match(EOF);
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitDeclarations(this);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 14) | (1L << 16))) != 0)) {
				{
				{
				setState(63); declaration();
				}
				}
				setState(68);
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
		public TerminalNode WS(int i) {
			return getToken(CLiteSaveParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(CLiteSaveParser.WS); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitDeclaration(this);
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
			setState(69); type();
			setState(71); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(70); match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(75); identifier();
			setState(76); match(7);
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitType(this);
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
			setState(78);
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitStatements(this);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 8) | (1L << 13) | (1L << LETTER))) != 0)) {
				{
				{
				setState(80); statement();
				}
				}
				setState(85);
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(7);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); block();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); assignment();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 4);
				{
				setState(89); ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90); whileStatement();
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(8);
			setState(94); statements();
			setState(95); match(12);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitAssignment(this);
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
			setState(97); identifier();
			setState(102);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(98); match(6);
				setState(99); expression();
				setState(100); match(11);
				}
			}

			setState(104); match(10);
			setState(105); expression();
			setState(106); match(7);
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitIfStatement(this);
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
			setState(108); match(13);
			setState(110);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(109); match(15);
				}
			}

			setState(112); match(17);
			setState(113); expression();
			setState(114); match(18);
			setState(115); statement();
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitWhileStatement(this);
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
			setState(117); match(5);
			setState(119);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(118); match(15);
				}
			}

			setState(121); match(17);
			setState(122); expression();
			setState(123); match(18);
			setState(124); statement();
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(126); conjunction();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(127); match(4);
				setState(128); conjunction();
				}
				}
				setState(133);
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitConjunction(this);
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
			setState(134); equality();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(135); match(9);
				setState(136); equality();
				}
				}
				setState(141);
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
		public TerminalNode EquOp() { return getToken(CLiteSaveParser.EquOp, 0); }
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitEquality(this);
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
			setState(142); relation();
			setState(145);
			_la = _input.LA(1);
			if (_la==EquOp) {
				{
				setState(143); match(EquOp);
				setState(144); relation();
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
		public TerminalNode RelOp() { return getToken(CLiteSaveParser.RelOp, 0); }
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
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitRelation(this);
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
			setState(147); addition();
			setState(150);
			_la = _input.LA(1);
			if (_la==RelOp) {
				{
				setState(148); match(RelOp);
				setState(149); addition();
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
		public List<TerminalNode> AddOp() { return getTokens(CLiteSaveParser.AddOp); }
		public TerminalNode AddOp(int i) {
			return getToken(CLiteSaveParser.AddOp, i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitAddition(this);
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
			setState(152); term();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AddOp) {
				{
				{
				setState(153); match(AddOp);
				setState(154); term();
				}
				}
				setState(159);
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
		public List<TerminalNode> MulOp() { return getTokens(CLiteSaveParser.MulOp); }
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MulOp(int i) {
			return getToken(CLiteSaveParser.MulOp, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitTerm(this);
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
			setState(160); factor();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MulOp) {
				{
				{
				setState(161); match(MulOp);
				setState(162); factor();
				}
				}
				setState(167);
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
		public TerminalNode Unaryop() { return getToken(CLiteSaveParser.Unaryop, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitFactor(this);
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
			setState(169);
			_la = _input.LA(1);
			if (_la==Unaryop) {
				{
				setState(168); match(Unaryop);
				}
			}

			setState(171); primary();
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primary);
		int _la;
		try {
			setState(190);
			switch (_input.LA(1)) {
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); identifier();
				setState(178);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(174); match(6);
					setState(175); expression();
					setState(176); match(11);
					}
				}

				}
				break;
			case IntegerType:
			case BooleanType:
			case FloatType:
			case CharType:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); literal();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 3);
				{
				setState(181); match(17);
				setState(182); expression();
				setState(183); match(17);
				}
				break;
			case 2:
			case 3:
			case 14:
			case 16:
				enterOuterAlt(_localctx, 4);
				{
				setState(185); type();
				setState(186); match(17);
				setState(187); expression();
				setState(188); match(18);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(CLiteSaveParser.LETTER); }
		public TerminalNode DIGIT(int i) {
			return getToken(CLiteSaveParser.DIGIT, i);
		}
		public TerminalNode LETTER(int i) {
			return getToken(CLiteSaveParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(CLiteSaveParser.DIGIT); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(LETTER);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(198);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CharType() { return getToken(CLiteSaveParser.CharType, 0); }
		public TerminalNode FloatType() { return getToken(CLiteSaveParser.FloatType, 0); }
		public TerminalNode IntegerType() { return getToken(CLiteSaveParser.IntegerType, 0); }
		public TerminalNode BooleanType() { return getToken(CLiteSaveParser.BooleanType, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLiteSaveListener ) ((CLiteSaveListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLiteSaveVisitor ) return ((CLiteSaveVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerType) | (1L << BooleanType) | (1L << FloatType) | (1L << CharType))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3C\n\3"+
		"\f\3\16\3F\13\3\3\4\3\4\6\4J\n\4\r\4\16\4K\3\4\3\4\3\4\3\5\3\5\3\6\7\6"+
		"T\n\6\f\6\16\6W\13\6\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\ti\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5\nq\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\5\13z\n\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f"+
		"\u0084\n\f\f\f\16\f\u0087\13\f\3\r\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f"+
		"\13\r\3\16\3\16\3\16\5\16\u0094\n\16\3\17\3\17\3\17\5\17\u0099\n\17\3"+
		"\20\3\20\3\20\7\20\u009e\n\20\f\20\16\20\u00a1\13\20\3\21\3\21\3\21\7"+
		"\21\u00a6\n\21\f\21\16\21\u00a9\13\21\3\22\5\22\u00ac\n\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00b5\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00c1\n\23\3\24\3\24\7\24\u00c5\n\24\f\24\16"+
		"\24\u00c8\13\24\3\25\3\25\3\25\4-K\2\26\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(\2\5\5\2\4\5\20\20\22\22\3\2\32\33\3\2\34\37\u00ce\2-\3"+
		"\2\2\2\4D\3\2\2\2\6G\3\2\2\2\bP\3\2\2\2\nU\3\2\2\2\f]\3\2\2\2\16_\3\2"+
		"\2\2\20c\3\2\2\2\22n\3\2\2\2\24w\3\2\2\2\26\u0080\3\2\2\2\30\u0088\3\2"+
		"\2\2\32\u0090\3\2\2\2\34\u0095\3\2\2\2\36\u009a\3\2\2\2 \u00a2\3\2\2\2"+
		"\"\u00ab\3\2\2\2$\u00c0\3\2\2\2&\u00c2\3\2\2\2(\u00c9\3\2\2\2*,\7$\2\2"+
		"+*\3\2\2\2,/\3\2\2\2-.\3\2\2\2-+\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7"+
		"\22\2\2\61\62\7#\2\2\62\63\7\3\2\2\63\64\7#\2\2\64\65\7\23\2\2\65\66\7"+
		"#\2\2\66\67\7\24\2\2\678\7#\2\289\7\n\2\29:\7#\2\2:;\5\4\3\2;<\5\n\6\2"+
		"<=\7#\2\2=>\7\16\2\2>?\7#\2\2?@\7\2\2\3@\3\3\2\2\2AC\5\6\4\2BA\3\2\2\2"+
		"CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FD\3\2\2\2GI\5\b\5\2HJ\7#\2\2"+
		"IH\3\2\2\2JK\3\2\2\2KL\3\2\2\2KI\3\2\2\2LM\3\2\2\2MN\5&\24\2NO\7\t\2\2"+
		"O\7\3\2\2\2PQ\t\2\2\2Q\t\3\2\2\2RT\5\f\7\2SR\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2V\13\3\2\2\2WU\3\2\2\2X^\7\t\2\2Y^\5\16\b\2Z^\5\20\t\2[^\5"+
		"\22\n\2\\^\5\24\13\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2"+
		"\2^\r\3\2\2\2_`\7\n\2\2`a\5\n\6\2ab\7\16\2\2b\17\3\2\2\2ch\5&\24\2de\7"+
		"\b\2\2ef\5\26\f\2fg\7\r\2\2gi\3\2\2\2hd\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk"+
		"\7\f\2\2kl\5\26\f\2lm\7\t\2\2m\21\3\2\2\2np\7\17\2\2oq\7\21\2\2po\3\2"+
		"\2\2pq\3\2\2\2qr\3\2\2\2rs\7\23\2\2st\5\26\f\2tu\7\24\2\2uv\5\f\7\2v\23"+
		"\3\2\2\2wy\7\7\2\2xz\7\21\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\23\2\2"+
		"|}\5\26\f\2}~\7\24\2\2~\177\5\f\7\2\177\25\3\2\2\2\u0080\u0085\5\30\r"+
		"\2\u0081\u0082\7\6\2\2\u0082\u0084\5\30\r\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\27\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0088\u008d\5\32\16\2\u0089\u008a\7\13\2\2\u008a"+
		"\u008c\5\32\16\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\31\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0093\5\34\17\2\u0091\u0092\7\25\2\2\u0092\u0094\5\34\17\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\33\3\2\2\2\u0095\u0098\5\36\20\2\u0096"+
		"\u0097\7\26\2\2\u0097\u0099\5\36\20\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\35\3\2\2\2\u009a\u009f\5 \21\2\u009b\u009c\7\27\2\2\u009c"+
		"\u009e\5 \21\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\37\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a7"+
		"\5\"\22\2\u00a3\u00a4\7\30\2\2\u00a4\u00a6\5\"\22\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8!"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\7\31\2\2\u00ab\u00aa\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5$\23\2\u00ae#\3"+
		"\2\2\2\u00af\u00b4\5&\24\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2\5\26\f\2\u00b2"+
		"\u00b3\7\r\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00c1\3\2\2\2\u00b6\u00c1\5(\25\2\u00b7\u00b8\7\23\2\2\u00b8"+
		"\u00b9\5\26\f\2\u00b9\u00ba\7\23\2\2\u00ba\u00c1\3\2\2\2\u00bb\u00bc\5"+
		"\b\5\2\u00bc\u00bd\7\23\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7\24\2\2"+
		"\u00bf\u00c1\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00b7"+
		"\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00c6\7\32\2\2\u00c3"+
		"\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\'\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca"+
		"\t\4\2\2\u00ca)\3\2\2\2\24-DKU]hpy\u0085\u008d\u0093\u0098\u009f\u00a7"+
		"\u00ab\u00b4\u00c0\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}