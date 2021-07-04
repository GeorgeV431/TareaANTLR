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
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); readSentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52); iteracion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53); pregunta();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54); operacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55); printSentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56); comentario();
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
			setState(59); match(COMENTARIOS);
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
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
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
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); tipo_dato();
				setState(62); nombre();
				setState(63); match(ES);
				setState(64); valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); tipo_dato();
				setState(67); nombre();
				setState(68); match(ES);
				setState(69); operacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); tipo_dato();
				setState(72); nombre();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74); tipo_dato();
				setState(75); nombre();
				setState(76); match(ES);
				setState(77); match(NUM);
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
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); nombre();
				setState(82); match(ES);
				setState(83); valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); valor();
				setState(86); match(ES);
				setState(87); operacion();
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
			setState(91); match(READ);
			setState(92); match(PARIZQ);
			setState(93); nombre();
			setState(94); match(PARDER);
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
			setState(96); match(PRINTLN);
			setState(97); match(PARIZQ);
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(98); match(COM);
				setState(99); match(ID);
				setState(100); match(COM);
				}
				break;
			case 2:
				{
				setState(101); valor();
				}
				break;
			case 3:
				{
				setState(102); match(COM);
				setState(103); match(ID);
				setState(104); match(COM);
				setState(105); match(COMA);
				setState(106); valor();
				}
				break;
			}
			setState(109); match(PARDER);
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
			setState(111); valor();
			setState(112); reformular();
			setState(113); valor();
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
			setState(115);
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
			setState(117); match(IF);
			setState(118); match(PARIZQ);
			setState(119); valor();
			setState(120); comparacion();
			setState(121); valor();
			setState(122); match(PARDER);
			setState(123); match(LLAVIZQ);
			setState(124); sinElse();
			setState(125); match(LLAVDER);
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
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127); statement();
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				setState(132); match(LLAVDER);
				setState(133); match(ELSE);
				setState(134); match(LLAVIZQ);
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135); statement();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				}
				break;
			case 2:
				{
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140); statement();
					}
					}
					setState(143); 
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
			setState(147);
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
			setState(151);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); iter_for();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); iter_while();
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
			setState(153); match(WHILE);
			setState(154); match(PARIZQ);
			setState(155); condition();
			setState(156); match(PARDER);
			setState(157); match(LLAVIZQ);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158); statement();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
			setState(163); match(LLAVDER);
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
			setState(165); match(FOR);
			setState(166); match(PARIZQ);
			setState(167); match(ID);
			setState(168); match(ES);
			setState(169); match(NUM);
			setState(170); match(SEMIC);
			setState(171); condition();
			setState(172); match(SEMIC);
			setState(173); recorrer();
			setState(174); match(PARDER);
			setState(175); match(LLAVIZQ);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176); statement();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
			setState(181); match(LLAVDER);
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
		public TerminalNode MAYOR() { return getToken(ParserDNDParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(ParserDNDParser.MENOR, 0); }
		public TerminalNode AND() { return getToken(ParserDNDParser.AND, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(ParserDNDParser.MAYORIGUAL, 0); }
		public TerminalNode OR() { return getToken(ParserDNDParser.OR, 0); }
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode NOTIGUAL() { return getToken(ParserDNDParser.NOTIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(ParserDNDParser.IGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(ParserDNDParser.MENORIGUAL, 0); }
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
		int _la;
		try {
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); valor();
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << NOTIGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(185); valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); valor();
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << NOTIGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(189); valor();
				setState(190); match(AND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); valor();
				setState(193);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << NOTIGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(194); valor();
				setState(195); match(OR);
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
			setState(199); match(ID);
			setState(200); match(ES);
			setState(201); match(ID);
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==SUMAR || _la==RESTAR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(203); match(NUM);
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
			setState(205);
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
			setState(207);
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
			setState(209); match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u0083\n\f"+
		"\r\f\16\f\u0084\3\f\3\f\3\f\3\f\6\f\u008b\n\f\r\f\16\f\u008c\3\f\6\f\u0090"+
		"\n\f\r\f\16\f\u0091\5\f\u0094\n\f\3\r\3\r\3\16\3\16\5\16\u009a\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\6\17\u00a2\n\17\r\17\16\17\u00a3\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00b4"+
		"\n\20\r\20\16\20\u00b5\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c8\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\7\3\2\27\33\3\2!&\3\2\27\30\3\2\7\n\4\2"+
		"\13\f\60\61\u00d8\2*\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\bQ\3\2\2\2\n[\3\2\2"+
		"\2\f]\3\2\2\2\16b\3\2\2\2\20q\3\2\2\2\22u\3\2\2\2\24w\3\2\2\2\26\u0093"+
		"\3\2\2\2\30\u0095\3\2\2\2\32\u0099\3\2\2\2\34\u009b\3\2\2\2\36\u00a7\3"+
		"\2\2\2 \u00c7\3\2\2\2\"\u00c9\3\2\2\2$\u00cf\3\2\2\2&\u00d1\3\2\2\2(\u00d3"+
		"\3\2\2\2*.\7\3\2\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\61\3\2\2\2\60.\3\2\2\2\61\62\7\4\2\2\62\3\3\2\2\2\63<\5\b\5\2\64<\5"+
		"\n\6\2\65<\5\f\7\2\66<\5\32\16\2\67<\5\24\13\28<\5\20\t\29<\5\16\b\2:"+
		"<\5\6\4\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2"+
		";8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\7\64\2\2>\7\3\2\2\2?@\5$\23"+
		"\2@A\5(\25\2AB\7 \2\2BC\5&\24\2CR\3\2\2\2DE\5$\23\2EF\5(\25\2FG\7 \2\2"+
		"GH\5\20\t\2HR\3\2\2\2IJ\5$\23\2JK\5(\25\2KR\3\2\2\2LM\5$\23\2MN\5(\25"+
		"\2NO\7 \2\2OP\7\60\2\2PR\3\2\2\2Q?\3\2\2\2QD\3\2\2\2QI\3\2\2\2QL\3\2\2"+
		"\2R\t\3\2\2\2ST\5(\25\2TU\7 \2\2UV\5&\24\2V\\\3\2\2\2WX\5&\24\2XY\7 \2"+
		"\2YZ\5\20\t\2Z\\\3\2\2\2[S\3\2\2\2[W\3\2\2\2\\\13\3\2\2\2]^\7\16\2\2^"+
		"_\7(\2\2_`\5(\25\2`a\7)\2\2a\r\3\2\2\2bc\7\r\2\2cm\7(\2\2de\7.\2\2ef\7"+
		"\61\2\2fn\7.\2\2gn\5&\24\2hi\7.\2\2ij\7\61\2\2jk\7.\2\2kl\7/\2\2ln\5&"+
		"\24\2md\3\2\2\2mg\3\2\2\2mh\3\2\2\2no\3\2\2\2op\7)\2\2p\17\3\2\2\2qr\5"+
		"&\24\2rs\5\22\n\2st\5&\24\2t\21\3\2\2\2uv\t\2\2\2v\23\3\2\2\2wx\7\17\2"+
		"\2xy\7(\2\2yz\5&\24\2z{\5\30\r\2{|\5&\24\2|}\7)\2\2}~\7*\2\2~\177\5\26"+
		"\f\2\177\u0080\7+\2\2\u0080\25\3\2\2\2\u0081\u0083\5\4\3\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\7+\2\2\u0087\u0088\7\21\2\2\u0088\u008a\7*"+
		"\2\2\u0089\u008b\5\4\3\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0094\3\2\2\2\u008e\u0090\5\4"+
		"\3\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0082\3\2\2\2\u0093\u008f\3\2"+
		"\2\2\u0094\27\3\2\2\2\u0095\u0096\t\3\2\2\u0096\31\3\2\2\2\u0097\u009a"+
		"\5\36\20\2\u0098\u009a\5\34\17\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2"+
		"\2\u009a\33\3\2\2\2\u009b\u009c\7\23\2\2\u009c\u009d\7(\2\2\u009d\u009e"+
		"\5 \21\2\u009e\u009f\7)\2\2\u009f\u00a1\7*\2\2\u00a0\u00a2\5\4\3\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\35\3\2\2\2\u00a7\u00a8"+
		"\7\22\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7 \2\2\u00ab"+
		"\u00ac\7\60\2\2\u00ac\u00ad\7\'\2\2\u00ad\u00ae\5 \21\2\u00ae\u00af\7"+
		"\'\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7)\2\2\u00b1\u00b3\7*\2\2\u00b2"+
		"\u00b4\5\4\3\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8"+
		"\37\3\2\2\2\u00b9\u00ba\5&\24\2\u00ba\u00bb\t\3\2\2\u00bb\u00bc\5&\24"+
		"\2\u00bc\u00c8\3\2\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\t\3\2\2\u00bf\u00c0"+
		"\5&\24\2\u00c0\u00c1\7\24\2\2\u00c1\u00c8\3\2\2\2\u00c2\u00c3\5&\24\2"+
		"\u00c3\u00c4\t\3\2\2\u00c4\u00c5\5&\24\2\u00c5\u00c6\7\25\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8"+
		"!\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\7\61\2\2"+
		"\u00cc\u00cd\t\4\2\2\u00cd\u00ce\7\60\2\2\u00ce#\3\2\2\2\u00cf\u00d0\t"+
		"\5\2\2\u00d0%\3\2\2\2\u00d1\u00d2\t\6\2\2\u00d2\'\3\2\2\2\u00d3\u00d4"+
		"\7\61\2\2\u00d4)\3\2\2\2\17.;Q[m\u0084\u008c\u0091\u0093\u0099\u00a3\u00b5"+
		"\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}