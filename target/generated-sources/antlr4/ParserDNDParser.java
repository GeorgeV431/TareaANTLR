// Generated from ParserDND.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, VAR=3, CONST=4, ENTERO=5, FLOTANTE=6, BOOLEAN=7, STRING=8, 
		TRUE=9, FALSE=10, PRINTLN=11, READ=12, IF=13, THEN=14, ELSE=15, FOR=16, 
		WHILE=17, AND=18, OR=19, NOT=20, SUMAR=21, RESTAR=22, MULTIPLICAR=23, 
		DIVIDIR=24, RESTO=25, COS=26, SIN=27, TAN=28, ABS=29, ES=30, MAYOR=31, 
		MENOR=32, IGUAL=33, NOIGUAL=34, MAYORAL=35, MENORAL=36, SC=37, PARIZQ=38, 
		PARDER=39, LLAVIZQ=40, LLAVDER=41, CORIZQ=42, CORDER=43, COM=44, COMA=45, 
		NUM=46, ID=47, IDS=48, WS=49, COMENTARIOS=50, INICIO=51, LLAV_A=52, LLAV_C=53, 
		LEER=54, PAR_A=55, PAR_C=56, BOOL=57, CHAR=58;
	public static final int
		RULE_program = 0, RULE_sentencias = 1, RULE_comentario = 2, RULE_declaracion = 3, 
		RULE_asignacion = 4, RULE_leer = 5, RULE_imprimir = 6, RULE_operacion = 7, 
		RULE_reformular = 8, RULE_pregunta = 9, RULE_sinElse = 10, RULE_comparacion = 11, 
		RULE_iteracion = 12, RULE_iter_while = 13, RULE_iter_for = 14, RULE_condicion = 15, 
		RULE_recorrer = 16, RULE_tipo_dato = 17, RULE_valor = 18, RULE_nombre = 19;
	public static final String[] ruleNames = {
		"program", "sentencias", "comentario", "declaracion", "asignacion", "leer", 
		"imprimir", "operacion", "reformular", "pregunta", "sinElse", "comparacion", 
		"iteracion", "iter_while", "iter_for", "condicion", "recorrer", "tipo_dato", 
		"valor", "nombre"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Fabricate'", "'Bane'", "'Symbol'", "'ImmovableObject'", "'StoneShape'", 
		"'Weird'", "'DetectGoodAndEvil'", "'Message'", "'Good'", "'Evil'", "'Sending'", 
		"'ComprehendLanguages'", "'Identify'", "'Command'", "'Nondetection'", 
		"'Initiative'", "'Haste'", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'ControlFlames'", "'ControlWater'", "'ControlWinds'", "'AbsorbElements'", 
		"'='", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "';'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "'\"'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "VAR", "CONST", "ENTERO", "FLOTANTE", "BOOLEAN", 
		"STRING", "TRUE", "FALSE", "PRINTLN", "READ", "IF", "THEN", "ELSE", "FOR", 
		"WHILE", "AND", "OR", "NOT", "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR", 
		"RESTO", "COS", "SIN", "TAN", "ABS", "ES", "MAYOR", "MENOR", "IGUAL", 
		"NOIGUAL", "MAYORAL", "MENORAL", "SC", "PARIZQ", "PARDER", "LLAVIZQ", 
		"LLAVDER", "CORIZQ", "CORDER", "COM", "COMA", "NUM", "ID", "IDS", "WS", 
		"COMENTARIOS", "INICIO", "LLAV_A", "LLAV_C", "LEER", "PAR_A", "PAR_C", 
		"BOOL", "CHAR"
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
	public String getGrammarFileName() { return "ParserDND.g4"; }

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
		public TerminalNode INICIO() { return getToken(ParserDNDParser.INICIO, 0); }
		public TerminalNode LLAV_A() { return getToken(ParserDNDParser.LLAV_A, 0); }
		public TerminalNode LLAV_C() { return getToken(ParserDNDParser.LLAV_C, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(40);
			match(INICIO);
			setState(41);
			match(LLAV_A);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULTIPLICAR) | (1L << DIVIDIR) | (1L << RESTO) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS) | (1L << LEER) | (1L << BOOL) | (1L << CHAR))) != 0)) {
				{
				{
				setState(42);
				sentencias();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(LLAV_C);
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

	public static class SentenciasContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public IteracionContext iteracion() {
			return getRuleContext(IteracionContext.class,0);
		}
		public PreguntaContext pregunta() {
			return getRuleContext(PreguntaContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				leer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				iteracion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				pregunta();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				operacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				imprimir();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				comentario();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(COMENTARIOS);
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
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				tipo_dato();
				setState(63);
				nombre();
				setState(64);
				match(ES);
				setState(65);
				valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				tipo_dato();
				setState(68);
				nombre();
				setState(69);
				match(ES);
				setState(70);
				operacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				tipo_dato();
				setState(73);
				nombre();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				tipo_dato();
				setState(76);
				nombre();
				setState(77);
				match(ES);
				setState(78);
				match(NUM);
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
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				nombre();
				setState(83);
				match(ES);
				setState(84);
				valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				valor();
				setState(87);
				match(ES);
				setState(88);
				valor();
				setState(89);
				operacion();
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(ParserDNDParser.LEER, 0); }
		public TerminalNode PAR_A() { return getToken(ParserDNDParser.PAR_A, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(ParserDNDParser.PAR_C, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LEER);
			setState(94);
			match(PAR_A);
			setState(95);
			nombre();
			setState(96);
			match(PAR_C);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(ParserDNDParser.PRINTLN, 0); }
		public TerminalNode PAR_A() { return getToken(ParserDNDParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(ParserDNDParser.PAR_C, 0); }
		public List<TerminalNode> COM() { return getTokens(ParserDNDParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(ParserDNDParser.COM, i);
		}
		public TerminalNode ID() { return getToken(ParserDNDParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ParserDNDParser.COMA, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PRINTLN);
			setState(99);
			match(PAR_A);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(100);
				match(COM);
				setState(101);
				match(ID);
				setState(102);
				match(COM);
				}
				break;
			case 2:
				{
				setState(103);
				valor();
				}
				break;
			case 3:
				{
				setState(104);
				match(COM);
				setState(105);
				match(ID);
				setState(106);
				match(COM);
				setState(107);
				match(COMA);
				setState(108);
				valor();
				}
				break;
			}
			setState(111);
			match(PAR_C);
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
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ReformularContext reformular() {
			return getRuleContext(ReformularContext.class,0);
		}
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case ID:
				{
				setState(113);
				valor();
				setState(114);
				reformular();
				setState(115);
				valor();
				setState(116);
				match(ES);
				setState(117);
				valor();
				}
				break;
			case SUMAR:
			case RESTAR:
			case MULTIPLICAR:
			case DIVIDIR:
			case RESTO:
				{
				setState(119);
				reformular();
				setState(120);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode SUMAR() { return getToken(ParserDNDParser.SUMAR, 0); }
		public TerminalNode RESTAR() { return getToken(ParserDNDParser.RESTAR, 0); }
		public TerminalNode DIVIDIR() { return getToken(ParserDNDParser.DIVIDIR, 0); }
		public TerminalNode MULTIPLICAR() { return getToken(ParserDNDParser.MULTIPLICAR, 0); }
		public TerminalNode RESTO() { return getToken(ParserDNDParser.RESTO, 0); }
		public ReformularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reformular; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitReformular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReformularContext reformular() throws RecognitionException {
		ReformularContext _localctx = new ReformularContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_reformular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMAR) | (1L << RESTAR) | (1L << MULTIPLICAR) | (1L << DIVIDIR) | (1L << RESTO))) != 0)) ) {
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

	public static class PreguntaContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserDNDParser.IF, 0); }
		public TerminalNode PAR_A() { return getToken(ParserDNDParser.PAR_A, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(ParserDNDParser.PAR_C, 0); }
		public TerminalNode LLAV_A() { return getToken(ParserDNDParser.LLAV_A, 0); }
		public SinElseContext sinElse() {
			return getRuleContext(SinElseContext.class,0);
		}
		public TerminalNode LLAV_C() { return getToken(ParserDNDParser.LLAV_C, 0); }
		public PreguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pregunta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitPregunta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreguntaContext pregunta() throws RecognitionException {
		PreguntaContext _localctx = new PreguntaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pregunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IF);
			setState(127);
			match(PAR_A);
			setState(128);
			valor();
			setState(129);
			comparacion();
			setState(130);
			valor();
			setState(131);
			match(PAR_C);
			setState(132);
			match(LLAV_A);
			setState(133);
			sinElse();
			setState(134);
			match(LLAV_C);
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
		public TerminalNode LLAV_C() { return getToken(ParserDNDParser.LLAV_C, 0); }
		public TerminalNode ELSE() { return getToken(ParserDNDParser.ELSE, 0); }
		public TerminalNode LLAV_A() { return getToken(ParserDNDParser.LLAV_A, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public SinElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitSinElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinElseContext sinElse() throws RecognitionException {
		SinElseContext _localctx = new SinElseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sinElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					sentencias();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULTIPLICAR) | (1L << DIVIDIR) | (1L << RESTO) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS) | (1L << LEER) | (1L << BOOL) | (1L << CHAR))) != 0) );
				setState(141);
				match(LLAV_C);
				setState(142);
				match(ELSE);
				setState(143);
				match(LLAV_A);
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					sentencias();
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULTIPLICAR) | (1L << DIVIDIR) | (1L << RESTO) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS) | (1L << LEER) | (1L << BOOL) | (1L << CHAR))) != 0) );
				}
				break;
			case 2:
				{
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149);
					sentencias();
					}
					}
					setState(152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULTIPLICAR) | (1L << DIVIDIR) | (1L << RESTO) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS) | (1L << LEER) | (1L << BOOL) | (1L << CHAR))) != 0) );
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
		public TerminalNode IGUAL() { return getToken(ParserDNDParser.IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(ParserDNDParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(ParserDNDParser.MENOR, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL))) != 0)) ) {
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

	public static class IteracionContext extends ParserRuleContext {
		public Iter_forContext iter_for() {
			return getRuleContext(Iter_forContext.class,0);
		}
		public Iter_whileContext iter_while() {
			return getRuleContext(Iter_whileContext.class,0);
		}
		public IteracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitIteracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteracionContext iteracion() throws RecognitionException {
		IteracionContext _localctx = new IteracionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iteracion);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				iter_for();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				iter_while();
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
		public TerminalNode WHILE() { return getToken(ParserDNDParser.WHILE, 0); }
		public TerminalNode PAR_A() { return getToken(ParserDNDParser.PAR_A, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(ParserDNDParser.PAR_C, 0); }
		public TerminalNode LLAV_A() { return getToken(ParserDNDParser.LLAV_A, 0); }
		public TerminalNode LLAV_C() { return getToken(ParserDNDParser.LLAV_C, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public Iter_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitIter_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iter_whileContext iter_while() throws RecognitionException {
		Iter_whileContext _localctx = new Iter_whileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iter_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WHILE);
			setState(163);
			match(PAR_A);
			setState(164);
			condicion();
			setState(165);
			match(PAR_C);
			setState(166);
			match(LLAV_A);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				sentencias();
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULTIPLICAR) | (1L << DIVIDIR) | (1L << RESTO) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS) | (1L << LEER) | (1L << BOOL) | (1L << CHAR))) != 0) );
			setState(172);
			match(LLAV_C);
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
		public TerminalNode FOR() { return getToken(ParserDNDParser.FOR, 0); }
		public TerminalNode PAR_A() { return getToken(ParserDNDParser.PAR_A, 0); }
		public TerminalNode ID() { return getToken(ParserDNDParser.ID, 0); }
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
		public List<TerminalNode> SC() { return getTokens(ParserDNDParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(ParserDNDParser.SC, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public RecorrerContext recorrer() {
			return getRuleContext(RecorrerContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(ParserDNDParser.PAR_C, 0); }
		public TerminalNode LLAV_A() { return getToken(ParserDNDParser.LLAV_A, 0); }
		public TerminalNode LLAV_C() { return getToken(ParserDNDParser.LLAV_C, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public Iter_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitIter_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iter_forContext iter_for() throws RecognitionException {
		Iter_forContext _localctx = new Iter_forContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iter_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(FOR);
			setState(175);
			match(PAR_A);
			setState(176);
			match(ID);
			setState(177);
			match(ES);
			setState(178);
			match(NUM);
			setState(179);
			match(SC);
			setState(180);
			condicion();
			setState(181);
			match(SC);
			setState(182);
			recorrer();
			setState(183);
			match(PAR_C);
			setState(184);
			match(LLAV_A);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				sentencias();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULTIPLICAR) | (1L << DIVIDIR) | (1L << RESTO) | (1L << NUM) | (1L << ID) | (1L << COMENTARIOS) | (1L << LEER) | (1L << BOOL) | (1L << CHAR))) != 0) );
			setState(190);
			match(LLAV_C);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(ParserDNDParser.IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(ParserDNDParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(ParserDNDParser.MENOR, 0); }
		public TerminalNode AND() { return getToken(ParserDNDParser.AND, 0); }
		public TerminalNode OR() { return getToken(ParserDNDParser.OR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condicion);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				valor();
				setState(193);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				valor();
				setState(197);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				valor();
				setState(199);
				match(AND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				valor();
				setState(202);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				valor();
				setState(204);
				match(OR);
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
		public TerminalNode ID(int i) {
			return getToken(ParserDNDParser.ID, i);
		}
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
		public TerminalNode SUMAR() { return getToken(ParserDNDParser.SUMAR, 0); }
		public TerminalNode RESTAR() { return getToken(ParserDNDParser.RESTAR, 0); }
		public RecorrerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recorrer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitRecorrer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecorrerContext recorrer() throws RecognitionException {
		RecorrerContext _localctx = new RecorrerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_recorrer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(ES);
			setState(210);
			match(ID);
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==SUMAR || _la==RESTAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			match(NUM);
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
		public TerminalNode ENTERO() { return getToken(ParserDNDParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(ParserDNDParser.FLOTANTE, 0); }
		public TerminalNode BOOL() { return getToken(ParserDNDParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(ParserDNDParser.CHAR, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitTipo_dato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOL) | (1L << CHAR))) != 0)) ) {
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(ParserDNDParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ParserDNDParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(ParserDNDParser.ID, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << ID))) != 0)) ) {
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

	public static class NombreContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserDNDParser.ID, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\6\f\u008c\n\f\r\f\16\f\u008d\3\f\3\f\3\f\3\f"+
		"\6\f\u0094\n\f\r\f\16\f\u0095\3\f\6\f\u0099\n\f\r\f\16\f\u009a\5\f\u009d"+
		"\n\f\3\r\3\r\3\16\3\16\5\16\u00a3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\6"+
		"\17\u00ab\n\17\r\17\16\17\u00ac\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00bd\n\20\r\20\16\20\u00be\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00d1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2"+
		"\7\3\2\27\33\3\2!#\3\2\27\30\4\2\7\b;<\4\2\13\f\60\61\2\u00e2\2*\3\2\2"+
		"\2\4<\3\2\2\2\6>\3\2\2\2\bR\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16d\3\2\2\2"+
		"\20|\3\2\2\2\22~\3\2\2\2\24\u0080\3\2\2\2\26\u009c\3\2\2\2\30\u009e\3"+
		"\2\2\2\32\u00a2\3\2\2\2\34\u00a4\3\2\2\2\36\u00b0\3\2\2\2 \u00d0\3\2\2"+
		"\2\"\u00d2\3\2\2\2$\u00d8\3\2\2\2&\u00da\3\2\2\2(\u00dc\3\2\2\2*+\7\65"+
		"\2\2+/\7\66\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2"+
		"\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\67\2\2\63\3\3\2\2\2\64=\5\b\5\2\65"+
		"=\5\n\6\2\66=\5\f\7\2\67=\5\32\16\28=\5\24\13\29=\5\20\t\2:=\5\16\b\2"+
		";=\5\6\4\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<"+
		"9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>?\7\64\2\2?\7\3\2\2\2@A\5$\23"+
		"\2AB\5(\25\2BC\7 \2\2CD\5&\24\2DS\3\2\2\2EF\5$\23\2FG\5(\25\2GH\7 \2\2"+
		"HI\5\20\t\2IS\3\2\2\2JK\5$\23\2KL\5(\25\2LS\3\2\2\2MN\5$\23\2NO\5(\25"+
		"\2OP\7 \2\2PQ\7\60\2\2QS\3\2\2\2R@\3\2\2\2RE\3\2\2\2RJ\3\2\2\2RM\3\2\2"+
		"\2S\t\3\2\2\2TU\5(\25\2UV\7 \2\2VW\5&\24\2W^\3\2\2\2XY\5&\24\2YZ\7 \2"+
		"\2Z[\5&\24\2[\\\5\20\t\2\\^\3\2\2\2]T\3\2\2\2]X\3\2\2\2^\13\3\2\2\2_`"+
		"\78\2\2`a\79\2\2ab\5(\25\2bc\7:\2\2c\r\3\2\2\2de\7\r\2\2eo\79\2\2fg\7"+
		".\2\2gh\7\61\2\2hp\7.\2\2ip\5&\24\2jk\7.\2\2kl\7\61\2\2lm\7.\2\2mn\7/"+
		"\2\2np\5&\24\2of\3\2\2\2oi\3\2\2\2oj\3\2\2\2pq\3\2\2\2qr\7:\2\2r\17\3"+
		"\2\2\2st\5&\24\2tu\5\22\n\2uv\5&\24\2vw\7 \2\2wx\5&\24\2x}\3\2\2\2yz\5"+
		"\22\n\2z{\5&\24\2{}\3\2\2\2|s\3\2\2\2|y\3\2\2\2}\21\3\2\2\2~\177\t\2\2"+
		"\2\177\23\3\2\2\2\u0080\u0081\7\17\2\2\u0081\u0082\79\2\2\u0082\u0083"+
		"\5&\24\2\u0083\u0084\5\30\r\2\u0084\u0085\5&\24\2\u0085\u0086\7:\2\2\u0086"+
		"\u0087\7\66\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7\67\2\2\u0089\25\3\2"+
		"\2\2\u008a\u008c\5\4\3\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\67"+
		"\2\2\u0090\u0091\7\21\2\2\u0091\u0093\7\66\2\2\u0092\u0094\5\4\3\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u009d\3\2\2\2\u0097\u0099\5\4\3\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u008b\3\2\2\2\u009c\u0098\3\2\2\2\u009d\27\3\2\2\2\u009e\u009f"+
		"\t\3\2\2\u009f\31\3\2\2\2\u00a0\u00a3\5\36\20\2\u00a1\u00a3\5\34\17\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\33\3\2\2\2\u00a4\u00a5"+
		"\7\23\2\2\u00a5\u00a6\79\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\7:\2\2\u00a8"+
		"\u00aa\7\66\2\2\u00a9\u00ab\5\4\3\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\7\67\2\2\u00af\35\3\2\2\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2\79\2"+
		"\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7 \2\2\u00b4\u00b5\7\60\2\2\u00b5"+
		"\u00b6\7\'\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\'\2\2\u00b8\u00b9\5\""+
		"\22\2\u00b9\u00ba\7:\2\2\u00ba\u00bc\7\66\2\2\u00bb\u00bd\5\4\3\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\67\2\2\u00c1\37\3\2\2\2\u00c2\u00c3"+
		"\5&\24\2\u00c3\u00c4\t\3\2\2\u00c4\u00c5\5&\24\2\u00c5\u00d1\3\2\2\2\u00c6"+
		"\u00c7\5&\24\2\u00c7\u00c8\t\3\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\7\24"+
		"\2\2\u00ca\u00d1\3\2\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\t\3\2\2\u00cd"+
		"\u00ce\5&\24\2\u00ce\u00cf\7\25\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c2\3"+
		"\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3"+
		"\7\61\2\2\u00d3\u00d4\7 \2\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\t\4\2\2"+
		"\u00d6\u00d7\7\60\2\2\u00d7#\3\2\2\2\u00d8\u00d9\t\5\2\2\u00d9%\3\2\2"+
		"\2\u00da\u00db\t\6\2\2\u00db\'\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd)\3\2"+
		"\2\2\20/<R]o|\u008d\u0095\u009a\u009c\u00a2\u00ac\u00be\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}