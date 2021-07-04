package ANTLR;
// Generated from ParserTest.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IF=3, ELSE=4, EQUAL=5, LBRACE=6, RBRACE=7, LPAR=8, RPAR=9, 
		TRUE=10, FALSE=11, NUMBER_=12, STRING_=13, BOOLEAN_=14, PRINT=15, SUMA=16, 
		WHILE=17, STRING=18, LINECOMMENT=19, ID=20, NUMBER=21, WS=22;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign = 2, RULE_print = 3, 
		RULE_add = 4, RULE_operation = 5, RULE_if_block = 6, RULE_condition_block = 7, 
		RULE_else_block = 8, RULE_while_block = 9, RULE_block = 10;
	public static final String[] ruleNames = {
		"program", "statement", "assign", "print", "add", "operation", "if_block", 
		"condition_block", "else_block", "while_block", "block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'be'", "'to'", "'if'", "'else'", "'=='", "'{'", "'}'", "'('", "')'", 
		"'true'", "'false'", "'number '", "'string '", "'boolean '", "'print'", 
		"'add'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "IF", "ELSE", "EQUAL", "LBRACE", "RBRACE", "LPAR", "RPAR", 
		"TRUE", "FALSE", "NUMBER_", "STRING_", "BOOLEAN_", "PRINT", "SUMA", "WHILE", 
		"STRING", "LINECOMMENT", "ID", "NUMBER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserTest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserTestParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << NUMBER_) | (1L << STRING_) | (1L << BOOLEAN_) | (1L << PRINT) | (1L << SUMA) | (1L << WHILE))) != 0) );
			setState(27);
			match(EOF);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_:
			case STRING_:
			case BOOLEAN_:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				assign();
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				add();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				print();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				if_block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				while_block();
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserTestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserTestParser.ID, i);
		}
		public TerminalNode NUMBER_() { return getToken(ParserTestParser.NUMBER_, 0); }
		public TerminalNode STRING_() { return getToken(ParserTestParser.STRING_, 0); }
		public TerminalNode BOOLEAN_() { return getToken(ParserTestParser.BOOLEAN_, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTestParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(ParserTestParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ParserTestParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(ParserTestParser.STRING, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_) | (1L << STRING_) | (1L << BOOLEAN_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(37);
			match(ID);
			setState(38);
			match(T__0);
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTestParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(ParserTestParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ParserTestParser.RPAR, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTestParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(ParserTestParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ParserTestParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(PRINT);
			setState(42);
			match(LPAR);
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			match(RPAR);
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(ParserTestParser.SUMA, 0); }
		public TerminalNode LPAR() { return getToken(ParserTestParser.LPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserTestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserTestParser.ID, i);
		}
		public TerminalNode RPAR() { return getToken(ParserTestParser.RPAR, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTestParser.NUMBER, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SUMA);
			setState(47);
			match(LPAR);
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(49);
			match(T__1);
			setState(50);
			match(ID);
			setState(51);
			match(RPAR);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserTestParser.ID, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ParserTestParser.EQUAL, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operation);
					setState(56);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(57);
					match(EQUAL);
					setState(58);
					operation(2);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTestParser.IF, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(ParserTestParser.ELSE, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			condition_block();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(66);
				match(ELSE);
				setState(67);
				else_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ParserTestParser.LPAR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ParserTestParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ParserTestParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ParserTestParser.RBRACE, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LPAR);
			setState(71);
			operation(0);
			setState(72);
			match(RPAR);
			setState(73);
			match(LBRACE);
			setState(74);
			block();
			setState(75);
			match(RBRACE);
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ParserTestParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ParserTestParser.RBRACE, 0); }
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LBRACE);
			setState(78);
			block();
			setState(79);
			match(RBRACE);
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserTestParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(WHILE);
			setState(82);
			condition_block();
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTestVisitor ) return ((ParserTestVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << NUMBER_) | (1L << STRING_) | (1L << BOOLEAN_) | (1L << PRINT) | (1L << SUMA) | (1L << WHILE))) != 0) );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\3\b\3\b\5\bG"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\6"+
		"\fX\n\f\r\f\16\fY\3\f\2\3\f\r\2\4\6\b\n\f\16\20\22\24\26\2\6\3\2\16\20"+
		"\5\2\f\r\24\24\26\27\4\2\24\24\26\27\3\2\26\27\2X\2\31\3\2\2\2\4$\3\2"+
		"\2\2\6&\3\2\2\2\b+\3\2\2\2\n\60\3\2\2\2\f\67\3\2\2\2\16B\3\2\2\2\20H\3"+
		"\2\2\2\22O\3\2\2\2\24S\3\2\2\2\26W\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2"+
		"\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\2\2\3"+
		"\36\3\3\2\2\2\37%\5\6\4\2 %\5\n\6\2!%\5\b\5\2\"%\5\16\b\2#%\5\24\13\2"+
		"$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\t"+
		"\2\2\2\'(\7\26\2\2()\7\3\2\2)*\t\3\2\2*\7\3\2\2\2+,\7\21\2\2,-\7\n\2\2"+
		"-.\t\4\2\2./\7\13\2\2/\t\3\2\2\2\60\61\7\22\2\2\61\62\7\n\2\2\62\63\t"+
		"\5\2\2\63\64\7\4\2\2\64\65\7\26\2\2\65\66\7\13\2\2\66\13\3\2\2\2\678\b"+
		"\7\1\289\7\26\2\29?\3\2\2\2:;\f\3\2\2;<\7\7\2\2<>\5\f\7\4=:\3\2\2\2>A"+
		"\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r\3\2\2\2A?\3\2\2\2BC\7\5\2\2CF\5\20\t\2"+
		"DE\7\6\2\2EG\5\22\n\2FD\3\2\2\2FG\3\2\2\2G\17\3\2\2\2HI\7\n\2\2IJ\5\f"+
		"\7\2JK\7\13\2\2KL\7\b\2\2LM\5\26\f\2MN\7\t\2\2N\21\3\2\2\2OP\7\b\2\2P"+
		"Q\5\26\f\2QR\7\t\2\2R\23\3\2\2\2ST\7\23\2\2TU\5\20\t\2U\25\3\2\2\2VX\5"+
		"\4\3\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\27\3\2\2\2\7\33$?FY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}