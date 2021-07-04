// Generated from ParserDND.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserDNDParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, VAR=3, CONST=4, ENTERO=5, FLOTANTE=6, BOOLEAN=7, STRING=8, 
		TRUE=9, FALSE=10, PRINTLN=11, READ=12, IF=13, THEN=14, ELSE=15, FOR=16, 
		WHILE=17, AND=18, OR=19, NOT=20, SUMAR=21, RESTAR=22, MULTIPLICAR=23, 
		DIVIDIR=24, RESTO=25, COS=26, SIN=27, TAN=28, ABS=29, ES=30, MAYOR=31, 
		MENOR=32, IGUAL=33, NOTIGUAL=34, MAYORIGUAL=35, MENORIGUAL=36, SEMIC=37, 
		PARIZQ=38, PARDER=39, LLAVIZQ=40, LLAVDER=41, CORIZQ=42, CORDER=43, COM=44, 
		COMA=45, NUM=46, ID=47, IDS=48, WS=49, COMENTARIOS=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'Fabricate'", "'Bane'", "'Symbol'", "'ImmovableObject'", 
		"'StoneShape'", "'Weird'", "'DetectGoodAndEvil'", "'Message'", "'Good'", 
		"'Evil'", "'Sending'", "'ComprehendLanguages'", "'Identify'", "'Command'", 
		"'Nondetection'", "'Initiative'", "'Haste'", "'&&'", "'||'", "'!'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'ControlFlames'", "'ControlWater'", "'ControlWinds'", 
		"'AbsorbElements'", "'='", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", 
		"';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", "','", "NUM", 
		"ID", "IDS", "WS", "COMENTARIOS"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_comentario = 2, RULE_declaracion = 3, 
		RULE_asignacion = 4, RULE_readSentence = 5, RULE_printSentence = 6, RULE_operacion = 7, 
		RULE_reformular = 8, RULE_pregunta = 9, RULE_sinElse = 10, RULE_comparacion = 11, 
		RULE_iteracion = 12, RULE_iter_while = 13, RULE_iter_for = 14, RULE_condition = 15, 
		RULE_recorrer = 16, RULE_tipo_dato = 17, RULE_valor = 18, RULE_nombre = 19;
	public static final String[] ruleNames = {
		"program", "statement", "comentario", "declaracion", "asignacion", "readSentence", 
		"printSentence", "operacion", "reformular", "pregunta", "sinElse", "comparacion", 
		"iteracion", "iter_while", "iter_for", "condition", "recorrer", "tipo_dato", 
		"valor", "nombre"
	};

	@Override
	public String getGrammarFileName() { return "ParserDND.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserDNDParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserDNDParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserDNDParser.END, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(BEGIN);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0)) {
				{
				{
				setState(41); statement();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47); match(END);
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
		public PrintSentenceContext printSentence() {
			return getRuleContext(PrintSentenceContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(ParserDNDParser.SEMIC, 0); }
		public ReadSentenceContext readSentence() {
			return getRuleContext(ReadSentenceContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IteracionContext iteracion() {
			return getRuleContext(IteracionContext.class,0);
		}
		public PreguntaContext pregunta() {
			return getRuleContext(PreguntaContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); declaracion();
				setState(50); match(SEMIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); asignacion();
				setState(53); match(SEMIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); readSentence();
				setState(56); match(SEMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); iteracion();
				setState(59); match(SEMIC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); pregunta();
				setState(62); match(SEMIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64); operacion();
				setState(65); match(SEMIC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67); printSentence();
				setState(68); match(SEMIC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70); comentario();
				}
				break;
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOS() { return getToken(ParserDNDParser.COMENTARIOS, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(COMENTARIOS);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); tipo_dato();
				setState(76); nombre();
				setState(77); match(ES);
				setState(78); valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); tipo_dato();
				setState(81); nombre();
				setState(82); match(ES);
				setState(83); operacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); tipo_dato();
				setState(86); nombre();
				}
				break;
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

	public static class AsignacionContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); nombre();
				setState(91); match(ES);
				setState(92); valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); nombre();
				setState(95); match(ES);
				setState(96); operacion();
				}
				break;
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

	public static class ReadSentenceContext extends ParserRuleContext {
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode READ() { return getToken(ParserDNDParser.READ, 0); }
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public ReadSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterReadSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitReadSentence(this);
		}
	}

	public final ReadSentenceContext readSentence() throws RecognitionException {
		ReadSentenceContext _localctx = new ReadSentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_readSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(READ);
			setState(101); match(PARIZQ);
			setState(102); nombre();
			setState(103); match(PARDER);
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

	public static class PrintSentenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserDNDParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public List<TerminalNode> COM() { return getTokens(ParserDNDParser.COM); }
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public TerminalNode PRINTLN() { return getToken(ParserDNDParser.PRINTLN, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode COM(int i) {
			return getToken(ParserDNDParser.COM, i);
		}
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public TerminalNode COMA() { return getToken(ParserDNDParser.COMA, 0); }
		public PrintSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterPrintSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitPrintSentence(this);
		}
	}

	public final PrintSentenceContext printSentence() throws RecognitionException {
		PrintSentenceContext _localctx = new PrintSentenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(PRINTLN);
			setState(106); match(PARIZQ);
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(107); match(COM);
				setState(108); valor();
				setState(109); match(COM);
				}
				break;
			case 2:
				{
				setState(111); nombre();
				}
				break;
			case 3:
				{
				setState(112); match(COM);
				setState(113); match(ID);
				setState(114); match(COM);
				setState(115); match(COMA);
				setState(116); valor();
				}
				break;
			}
			setState(119); match(PARDER);
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

	public static class OperacionContext extends ParserRuleContext {
		public ReformularContext reformular() {
			return getRuleContext(ReformularContext.class,0);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121); valor();
			setState(122); reformular();
			setState(123); valor();
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

	public static class ReformularContext extends ParserRuleContext {
		public TerminalNode DIVIDIR() { return getToken(ParserDNDParser.DIVIDIR, 0); }
		public TerminalNode MULTIPLICAR() { return getToken(ParserDNDParser.MULTIPLICAR, 0); }
		public TerminalNode RESTO() { return getToken(ParserDNDParser.RESTO, 0); }
		public TerminalNode SUMAR() { return getToken(ParserDNDParser.SUMAR, 0); }
		public TerminalNode RESTAR() { return getToken(ParserDNDParser.RESTAR, 0); }
		public ReformularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reformular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterReformular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitReformular(this);
		}
	}

	public final ReformularContext reformular() throws RecognitionException {
		ReformularContext _localctx = new ReformularContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_reformular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMAR) | (1L << RESTAR) | (1L << MULTIPLICAR) | (1L << DIVIDIR) | (1L << RESTO))) != 0)) ) {
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

	public static class PreguntaContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserDNDParser.IF, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public TerminalNode LLAVDER() { return getToken(ParserDNDParser.LLAVDER, 0); }
		public SinElseContext sinElse() {
			return getRuleContext(SinElseContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode LLAVIZQ() { return getToken(ParserDNDParser.LLAVIZQ, 0); }
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public PreguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pregunta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterPregunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitPregunta(this);
		}
	}

	public final PreguntaContext pregunta() throws RecognitionException {
		PreguntaContext _localctx = new PreguntaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pregunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(IF);
			setState(128); match(PARIZQ);
			setState(129); valor();
			setState(130); comparacion();
			setState(131); valor();
			setState(132); match(PARDER);
			setState(133); match(LLAVIZQ);
			setState(134); sinElse();
			setState(135); match(LLAVDER);
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

	public static class SinElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ParserDNDParser.ELSE, 0); }
		public TerminalNode LLAVDER() { return getToken(ParserDNDParser.LLAVDER, 0); }
		public TerminalNode LLAVIZQ() { return getToken(ParserDNDParser.LLAVIZQ, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public SinElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterSinElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitSinElse(this);
		}
	}

	public final SinElseContext sinElse() throws RecognitionException {
		SinElseContext _localctx = new SinElseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sinElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137); statement();
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				setState(142); match(LLAVDER);
				setState(143); match(ELSE);
				setState(144); match(LLAVIZQ);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145); statement();
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				}
				break;
			case 2:
				{
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150); statement();
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				}
				break;
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ParserDNDParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(ParserDNDParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(ParserDNDParser.MAYORIGUAL, 0); }
		public TerminalNode NOTIGUAL() { return getToken(ParserDNDParser.NOTIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(ParserDNDParser.IGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(ParserDNDParser.MENORIGUAL, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitComparacion(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << NOTIGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
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

	public static class IteracionContext extends ParserRuleContext {
		public Iter_whileContext iter_while() {
			return getRuleContext(Iter_whileContext.class,0);
		}
		public Iter_forContext iter_for() {
			return getRuleContext(Iter_forContext.class,0);
		}
		public IteracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterIteracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitIteracion(this);
		}
	}

	public final IteracionContext iteracion() throws RecognitionException {
		IteracionContext _localctx = new IteracionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iteracion);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); iter_for();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); iter_while();
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

	public static class Iter_whileContext extends ParserRuleContext {
		public TerminalNode LLAVDER() { return getToken(ParserDNDParser.LLAVDER, 0); }
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public TerminalNode LLAVIZQ() { return getToken(ParserDNDParser.LLAVIZQ, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode WHILE() { return getToken(ParserDNDParser.WHILE, 0); }
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Iter_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterIter_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitIter_while(this);
		}
	}

	public final Iter_whileContext iter_while() throws RecognitionException {
		Iter_whileContext _localctx = new Iter_whileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iter_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(WHILE);
			setState(164); match(PARIZQ);
			setState(165); condition();
			setState(166); match(PARDER);
			setState(167); match(LLAVIZQ);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168); statement();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
			setState(173); match(LLAVDER);
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

	public static class Iter_forContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public TerminalNode LLAVIZQ() { return getToken(ParserDNDParser.LLAVIZQ, 0); }
		public TerminalNode FOR() { return getToken(ParserDNDParser.FOR, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ID() { return getToken(ParserDNDParser.ID, 0); }
		public List<TerminalNode> SEMIC() { return getTokens(ParserDNDParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(ParserDNDParser.SEMIC, i);
		}
		public TerminalNode LLAVDER() { return getToken(ParserDNDParser.LLAVDER, 0); }
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public RecorrerContext recorrer() {
			return getRuleContext(RecorrerContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Iter_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterIter_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitIter_for(this);
		}
	}

	public final Iter_forContext iter_for() throws RecognitionException {
		Iter_forContext _localctx = new Iter_forContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iter_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(FOR);
			setState(176); match(PARIZQ);
			setState(177); match(ID);
			setState(178); match(ES);
			setState(179); match(NUM);
			setState(180); match(SEMIC);
			setState(181); condition();
			setState(182); match(SEMIC);
			setState(183); recorrer();
			setState(184); match(PARDER);
			setState(185); match(LLAVIZQ);
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186); statement();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
			setState(191); match(LLAVDER);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode AND() { return getToken(ParserDNDParser.AND, 0); }
		public TerminalNode OR() { return getToken(ParserDNDParser.OR, 0); }
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); valor();
				setState(194); comparacion();
				setState(195); valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197); valor();
				setState(198); comparacion();
				setState(199); valor();
				setState(200); match(AND);
				setState(201); condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203); valor();
				setState(204); comparacion();
				setState(205); valor();
				setState(206); match(OR);
				setState(207); condition();
				}
				break;
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

	public static class RecorrerContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserDNDParser.ID); }
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public TerminalNode ID(int i) {
			return getToken(ParserDNDParser.ID, i);
		}
		public TerminalNode SUMAR() { return getToken(ParserDNDParser.SUMAR, 0); }
		public TerminalNode RESTAR() { return getToken(ParserDNDParser.RESTAR, 0); }
		public RecorrerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recorrer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterRecorrer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitRecorrer(this);
		}
	}

	public final RecorrerContext recorrer() throws RecognitionException {
		RecorrerContext _localctx = new RecorrerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_recorrer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(ID);
			setState(212); match(ES);
			setState(213); match(ID);
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==SUMAR || _la==RESTAR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(215); match(NUM);
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

	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode FLOTANTE() { return getToken(ParserDNDParser.FLOTANTE, 0); }
		public TerminalNode STRING() { return getToken(ParserDNDParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParserDNDParser.BOOLEAN, 0); }
		public TerminalNode ENTERO() { return getToken(ParserDNDParser.ENTERO, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitTipo_dato(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserDNDParser.ID, 0); }
		public TerminalNode FALSE() { return getToken(ParserDNDParser.FALSE, 0); }
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(ParserDNDParser.TRUE, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << ID))) != 0)) ) {
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

	public static class NombreContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserDNDParser.ID, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).enterNombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserDNDListener ) ((ParserDNDListener)listener).exitNombre(this);
		}
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00e2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bx\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\6\f\u008d\n\f\r\f\16\f\u008e\3\f\3\f\3\f\3\f"+
		"\6\f\u0095\n\f\r\f\16\f\u0096\3\f\6\f\u009a\n\f\r\f\16\f\u009b\5\f\u009e"+
		"\n\f\3\r\3\r\3\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\6"+
		"\17\u00ac\n\17\r\17\16\17\u00ad\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00be\n\20\r\20\16\20\u00bf\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(\2\7\3\2\27\33\3\2!&\3\2\27\30\3\2\7\n\4\2\13\f\60\61\u00e3\2*\3"+
		"\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bZ\3\2\2\2\nd\3\2\2\2\ff\3\2\2\2\16k\3\2"+
		"\2\2\20{\3\2\2\2\22\177\3\2\2\2\24\u0081\3\2\2\2\26\u009d\3\2\2\2\30\u009f"+
		"\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00b1\3\2\2\2 \u00d3\3\2"+
		"\2\2\"\u00d5\3\2\2\2$\u00db\3\2\2\2&\u00dd\3\2\2\2(\u00df\3\2\2\2*.\7"+
		"\3\2\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2"+
		"\60.\3\2\2\2\61\62\7\4\2\2\62\3\3\2\2\2\63\64\5\b\5\2\64\65\7\'\2\2\65"+
		"J\3\2\2\2\66\67\5\n\6\2\678\7\'\2\28J\3\2\2\29:\5\f\7\2:;\7\'\2\2;J\3"+
		"\2\2\2<=\5\32\16\2=>\7\'\2\2>J\3\2\2\2?@\5\24\13\2@A\7\'\2\2AJ\3\2\2\2"+
		"BC\5\20\t\2CD\7\'\2\2DJ\3\2\2\2EF\5\16\b\2FG\7\'\2\2GJ\3\2\2\2HJ\5\6\4"+
		"\2I\63\3\2\2\2I\66\3\2\2\2I9\3\2\2\2I<\3\2\2\2I?\3\2\2\2IB\3\2\2\2IE\3"+
		"\2\2\2IH\3\2\2\2J\5\3\2\2\2KL\7\64\2\2L\7\3\2\2\2MN\5$\23\2NO\5(\25\2"+
		"OP\7 \2\2PQ\5&\24\2Q[\3\2\2\2RS\5$\23\2ST\5(\25\2TU\7 \2\2UV\5\20\t\2"+
		"V[\3\2\2\2WX\5$\23\2XY\5(\25\2Y[\3\2\2\2ZM\3\2\2\2ZR\3\2\2\2ZW\3\2\2\2"+
		"[\t\3\2\2\2\\]\5(\25\2]^\7 \2\2^_\5&\24\2_e\3\2\2\2`a\5(\25\2ab\7 \2\2"+
		"bc\5\20\t\2ce\3\2\2\2d\\\3\2\2\2d`\3\2\2\2e\13\3\2\2\2fg\7\16\2\2gh\7"+
		"(\2\2hi\5(\25\2ij\7)\2\2j\r\3\2\2\2kl\7\r\2\2lw\7(\2\2mn\7.\2\2no\5&\24"+
		"\2op\7.\2\2px\3\2\2\2qx\5(\25\2rs\7.\2\2st\7\61\2\2tu\7.\2\2uv\7/\2\2"+
		"vx\5&\24\2wm\3\2\2\2wq\3\2\2\2wr\3\2\2\2xy\3\2\2\2yz\7)\2\2z\17\3\2\2"+
		"\2{|\5&\24\2|}\5\22\n\2}~\5&\24\2~\21\3\2\2\2\177\u0080\t\2\2\2\u0080"+
		"\23\3\2\2\2\u0081\u0082\7\17\2\2\u0082\u0083\7(\2\2\u0083\u0084\5&\24"+
		"\2\u0084\u0085\5\30\r\2\u0085\u0086\5&\24\2\u0086\u0087\7)\2\2\u0087\u0088"+
		"\7*\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7+\2\2\u008a\25\3\2\2\2\u008b"+
		"\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7+\2\2\u0091"+
		"\u0092\7\21\2\2\u0092\u0094\7*\2\2\u0093\u0095\5\4\3\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u009e\3\2\2\2\u0098\u009a\5\4\3\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u008c\3\2\2\2\u009d\u0099\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0\t\3\2"+
		"\2\u00a0\31\3\2\2\2\u00a1\u00a4\5\36\20\2\u00a2\u00a4\5\34\17\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\23\2"+
		"\2\u00a6\u00a7\7(\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7)\2\2\u00a9\u00ab"+
		"\7*\2\2\u00aa\u00ac\5\4\3\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7+"+
		"\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\7(\2\2\u00b3\u00b4"+
		"\7\61\2\2\u00b4\u00b5\7 \2\2\u00b5\u00b6\7\60\2\2\u00b6\u00b7\7\'\2\2"+
		"\u00b7\u00b8\5 \21\2\u00b8\u00b9\7\'\2\2\u00b9\u00ba\5\"\22\2\u00ba\u00bb"+
		"\7)\2\2\u00bb\u00bd\7*\2\2\u00bc\u00be\5\4\3\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\7+\2\2\u00c2\37\3\2\2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5"+
		"\5\30\r\2\u00c5\u00c6\5&\24\2\u00c6\u00d4\3\2\2\2\u00c7\u00c8\5&\24\2"+
		"\u00c8\u00c9\5\30\r\2\u00c9\u00ca\5&\24\2\u00ca\u00cb\7\24\2\2\u00cb\u00cc"+
		"\5 \21\2\u00cc\u00d4\3\2\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\5\30\r\2"+
		"\u00cf\u00d0\5&\24\2\u00d0\u00d1\7\25\2\2\u00d1\u00d2\5 \21\2\u00d2\u00d4"+
		"\3\2\2\2\u00d3\u00c3\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d4"+
		"!\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\7\61\2\2"+
		"\u00d8\u00d9\t\4\2\2\u00d9\u00da\7\60\2\2\u00da#\3\2\2\2\u00db\u00dc\t"+
		"\5\2\2\u00dc%\3\2\2\2\u00dd\u00de\t\6\2\2\u00de\'\3\2\2\2\u00df\u00e0"+
		"\7\61\2\2\u00e0)\3\2\2\2\17.IZdw\u008e\u0096\u009b\u009d\u00a3\u00ad\u00bf"+
		"\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}