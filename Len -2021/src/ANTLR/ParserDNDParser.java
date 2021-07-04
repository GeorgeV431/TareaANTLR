package ANTLR;// Generated from ParserDND.g4 by ANTLR 4.7.1
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
		BEGIN=1, END=2, VAR=3, CONST=4, ENTERO=5, BOOLEAN=6, STRING=7, TRUE=8, 
		FALSE=9, PRINTLN=10, READ=11, IF=12, THEN=13, ELSE=14, FOR=15, WHILE=16, 
		AND=17, OR=18, NOT=19, SUMAR=20, RESTAR=21, MULTIPLICAR=22, DIVIDIR=23, 
		RESTO=24, COS=25, SIN=26, TAN=27, ABS=28, ES=29, MAYOR=30, MENOR=31, IGUAL=32, 
		NOTIGUAL=33, MAYORIGUAL=34, MENORIGUAL=35, SEMIC=36, PARIZQ=37, PARDER=38, 
		LLAVIZQ=39, LLAVDER=40, CORIZQ=41, CORDER=42, COM=43, COMA=44, NUM=45, 
		STRING_LITERAL=46, ID=47, IDS=48, WS=49, COMENTARIOS=50;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_comentario = 2, RULE_declaracion = 3, 
		RULE_asignacion = 4, RULE_funcion = 5, RULE_readSentence = 6, RULE_printSentence = 7, 
		RULE_operacion = 8, RULE_reformular = 9, RULE_pregunta = 10, RULE_sinElse = 11, 
		RULE_comparacion = 12, RULE_iter_while = 13, RULE_iter_for = 14, RULE_condition = 15, 
		RULE_recorrer = 16, RULE_tipo_dato = 17, RULE_valor = 18, RULE_nombre = 19;
	public static final String[] ruleNames = {
		"program", "statement", "comentario", "declaracion", "asignacion", "funcion", 
		"readSentence", "printSentence", "operacion", "reformular", "pregunta", 
		"sinElse", "comparacion", "iter_while", "iter_for", "condition", "recorrer", 
		"tipo_dato", "valor", "nombre"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Fabricate'", "'Bane'", "'Symbol'", "'ImmovableObject'", "'StoneShape'", 
		"'DetectGoodAndEvil'", "'Message'", "'Good'", "'Evil'", "'Sending'", "'ComprehendLanguages'", 
		"'Identify'", "'Command'", "'Nondetection'", "'Initiative'", "'Haste'", 
		"'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'ControlFlames'", 
		"'ControlWater'", "'ControlWinds'", "'AbsorbElements'", "'='", "'>'", 
		"'<'", "'=='", "'!='", "'>='", "'<='", "';'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "'\"'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "VAR", "CONST", "ENTERO", "BOOLEAN", "STRING", "TRUE", 
		"FALSE", "PRINTLN", "READ", "IF", "THEN", "ELSE", "FOR", "WHILE", "AND", 
		"OR", "NOT", "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR", "RESTO", "COS", 
		"SIN", "TAN", "ABS", "ES", "MAYOR", "MENOR", "IGUAL", "NOTIGUAL", "MAYORIGUAL", 
		"MENORIGUAL", "SEMIC", "PARIZQ", "PARDER", "LLAVIZQ", "LLAVDER", "CORIZQ", 
		"CORDER", "COM", "COMA", "NUM", "STRING_LITERAL", "ID", "IDS", "WS", "COMENTARIOS"
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
		public TerminalNode BEGIN() { return getToken(ParserDNDParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserDNDParser.END, 0); }
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
			match(BEGIN);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << COMENTARIOS))) != 0)) {
				{
				{
				setState(41);
				statement();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(END);
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
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(ParserDNDParser.SEMIC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ReadSentenceContext readSentence() {
			return getRuleContext(ReadSentenceContext.class,0);
		}
		public PreguntaContext pregunta() {
			return getRuleContext(PreguntaContext.class,0);
		}
		public PrintSentenceContext printSentence() {
			return getRuleContext(PrintSentenceContext.class,0);
		}
		public Iter_whileContext iter_while() {
			return getRuleContext(Iter_whileContext.class,0);
		}
		public Iter_forContext iter_for() {
			return getRuleContext(Iter_forContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				declaracion();
				setState(50);
				match(SEMIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				asignacion();
				setState(53);
				match(SEMIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				readSentence();
				setState(56);
				match(SEMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				pregunta();
				setState(59);
				match(SEMIC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				printSentence();
				setState(62);
				match(SEMIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				iter_while();
				setState(65);
				match(SEMIC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				iter_for();
				setState(68);
				match(SEMIC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				printSentence();
				setState(71);
				match(SEMIC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
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
			setState(76);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				tipo_dato();
				setState(79);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				tipo_dato();
				setState(82);
				nombre();
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
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				nombre();
				setState(87);
				match(ES);
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(88);
					valor();
					}
					break;
				case ID:
					{
					setState(89);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				nombre();
				setState(93);
				match(ES);
				setState(94);
				operacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				nombre();
				setState(97);
				match(ES);
				setState(98);
				funcion();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public TerminalNode COS() { return getToken(ParserDNDParser.COS, 0); }
		public TerminalNode SIN() { return getToken(ParserDNDParser.SIN, 0); }
		public TerminalNode TAN() { return getToken(ParserDNDParser.TAN, 0); }
		public TerminalNode ABS() { return getToken(ParserDNDParser.ABS, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COS) | (1L << SIN) | (1L << TAN) | (1L << ABS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(103);
			match(PARIZQ);
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(104);
				valor();
				}
				break;
			case ID:
				{
				setState(105);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			match(PARDER);
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
		public TerminalNode READ() { return getToken(ParserDNDParser.READ, 0); }
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public ReadSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitReadSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadSentenceContext readSentence() throws RecognitionException {
		ReadSentenceContext _localctx = new ReadSentenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_readSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(READ);
			setState(111);
			match(PARIZQ);
			setState(112);
			nombre();
			setState(113);
			match(PARDER);
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
		public TerminalNode PRINTLN() { return getToken(ParserDNDParser.PRINTLN, 0); }
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ParserDNDParser.COMA, 0); }
		public PrintSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitPrintSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSentenceContext printSentence() throws RecognitionException {
		PrintSentenceContext _localctx = new PrintSentenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PRINTLN);
			setState(116);
			match(PARIZQ);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(117);
				valor();
				}
				break;
			case 2:
				{
				setState(118);
				nombre();
				}
				break;
			case 3:
				{
				setState(119);
				valor();
				setState(120);
				match(COMA);
				setState(121);
				nombre();
				}
				break;
			}
			setState(125);
			match(PARDER);
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
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
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
		enterRule(_localctx, 16, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(127);
				valor();
				}
				break;
			case ID:
				{
				setState(128);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			reformular();
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(132);
				valor();
				}
				break;
			case ID:
				{
				setState(133);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 18, RULE_reformular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public TerminalNode LLAVIZQ() { return getToken(ParserDNDParser.LLAVIZQ, 0); }
		public SinElseContext sinElse() {
			return getRuleContext(SinElseContext.class,0);
		}
		public TerminalNode LLAVDER() { return getToken(ParserDNDParser.LLAVDER, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_pregunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			match(PARIZQ);
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(140);
				valor();
				}
				break;
			case ID:
				{
				setState(141);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(144);
			condition();
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(145);
				valor();
				}
				break;
			case ID:
				{
				setState(146);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(149);
			match(PARDER);
			setState(150);
			match(LLAVIZQ);
			setState(151);
			sinElse();
			setState(152);
			match(LLAVDER);
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
		public TerminalNode LLAVDER() { return getToken(ParserDNDParser.LLAVDER, 0); }
		public TerminalNode ELSE() { return getToken(ParserDNDParser.ELSE, 0); }
		public TerminalNode LLAVIZQ() { return getToken(ParserDNDParser.LLAVIZQ, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 22, RULE_sinElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					statement();
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				setState(159);
				match(LLAVDER);
				setState(160);
				match(ELSE);
				setState(161);
				match(LLAVIZQ);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					statement();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				}
				break;
			case 2:
				{
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					statement();
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
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
		public TerminalNode NOTIGUAL() { return getToken(ParserDNDParser.NOTIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(ParserDNDParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(ParserDNDParser.MENORIGUAL, 0); }
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
		enterRule(_localctx, 24, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << NOTIGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
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

	public static class Iter_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserDNDParser.WHILE, 0); }
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public TerminalNode LLAVIZQ() { return getToken(ParserDNDParser.LLAVIZQ, 0); }
		public TerminalNode LLAVDER() { return getToken(ParserDNDParser.LLAVDER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(176);
			match(WHILE);
			setState(177);
			match(PARIZQ);
			setState(178);
			condition();
			setState(179);
			match(PARDER);
			setState(180);
			match(LLAVIZQ);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				statement();
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
			setState(186);
			match(LLAVDER);
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
		public TerminalNode PARIZQ() { return getToken(ParserDNDParser.PARIZQ, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode ES() { return getToken(ParserDNDParser.ES, 0); }
		public TerminalNode NUM() { return getToken(ParserDNDParser.NUM, 0); }
		public List<TerminalNode> SEMIC() { return getTokens(ParserDNDParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(ParserDNDParser.SEMIC, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RecorrerContext recorrer() {
			return getRuleContext(RecorrerContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ParserDNDParser.PARDER, 0); }
		public TerminalNode LLAVIZQ() { return getToken(ParserDNDParser.LLAVIZQ, 0); }
		public TerminalNode LLAVDER() { return getToken(ParserDNDParser.LLAVDER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(188);
			match(FOR);
			setState(189);
			match(PARIZQ);
			setState(190);
			nombre();
			setState(191);
			match(ES);
			setState(192);
			match(NUM);
			setState(193);
			match(SEMIC);
			setState(194);
			condition();
			setState(195);
			match(SEMIC);
			setState(196);
			recorrer();
			setState(197);
			match(PARDER);
			setState(198);
			match(LLAVIZQ);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				statement();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
			setState(204);
			match(LLAVDER);
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
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public TerminalNode AND() { return getToken(ParserDNDParser.AND, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode OR() { return getToken(ParserDNDParser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserDNDVisitor ) return ((ParserDNDVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(206);
					valor();
					}
					break;
				case ID:
					{
					setState(207);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210);
				comparacion();
				setState(213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(211);
					valor();
					}
					break;
				case ID:
					{
					setState(212);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(215);
					valor();
					}
					break;
				case ID:
					{
					setState(216);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219);
				comparacion();
				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(220);
					valor();
					}
					break;
				case ID:
					{
					setState(221);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224);
				match(AND);
				setState(225);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(227);
					valor();
					}
					break;
				case ID:
					{
					setState(228);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231);
				comparacion();
				setState(234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(232);
					valor();
					}
					break;
				case ID:
					{
					setState(233);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236);
				match(OR);
				setState(237);
				condition();
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
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
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
			setState(241);
			nombre();
			setState(242);
			match(ES);
			setState(243);
			nombre();
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==SUMAR || _la==RESTAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(245);
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
		public TerminalNode BOOLEAN() { return getToken(ParserDNDParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(ParserDNDParser.STRING, 0); }
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
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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
		public TerminalNode STRING_LITERAL() { return getToken(ParserDNDParser.STRING_LITERAL, 0); }
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
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << STRING_LITERAL))) != 0)) ) {
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
			setState(251);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0100\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6g\n\6\3\7\3\7\3\7\3\7\5\7m\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\n\3\n\5\n\u0084\n\n\3\n\3"+
		"\n\3\n\5\n\u0089\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0091\n\f\3\f\3\f\3"+
		"\f\5\f\u0096\n\f\3\f\3\f\3\f\3\f\3\f\3\r\6\r\u009e\n\r\r\r\16\r\u009f"+
		"\3\r\3\r\3\r\3\r\6\r\u00a6\n\r\r\r\16\r\u00a7\3\r\6\r\u00ab\n\r\r\r\16"+
		"\r\u00ac\5\r\u00af\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00b9"+
		"\n\17\r\17\16\17\u00ba\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\6\20\u00cb\n\20\r\20\16\20\u00cc\3\20\3\20\3\21"+
		"\3\21\5\21\u00d3\n\21\3\21\3\21\3\21\5\21\u00d8\n\21\3\21\3\21\5\21\u00dc"+
		"\n\21\3\21\3\21\3\21\5\21\u00e1\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e8"+
		"\n\21\3\21\3\21\3\21\5\21\u00ed\n\21\3\21\3\21\3\21\5\21\u00f2\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\2\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\3\2\33\36\3\2\26\32"+
		"\3\2 %\3\2\26\27\3\2\7\t\4\2\n\13/\60\2\u010d\2*\3\2\2\2\4L\3\2\2\2\6"+
		"N\3\2\2\2\bV\3\2\2\2\nf\3\2\2\2\fh\3\2\2\2\16p\3\2\2\2\20u\3\2\2\2\22"+
		"\u0083\3\2\2\2\24\u008a\3\2\2\2\26\u008c\3\2\2\2\30\u00ae\3\2\2\2\32\u00b0"+
		"\3\2\2\2\34\u00b2\3\2\2\2\36\u00be\3\2\2\2 \u00f1\3\2\2\2\"\u00f3\3\2"+
		"\2\2$\u00f9\3\2\2\2&\u00fb\3\2\2\2(\u00fd\3\2\2\2*.\7\3\2\2+-\5\4\3\2"+
		",+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61"+
		"\62\7\4\2\2\62\3\3\2\2\2\63\64\5\b\5\2\64\65\7&\2\2\65M\3\2\2\2\66\67"+
		"\5\n\6\2\678\7&\2\28M\3\2\2\29:\5\16\b\2:;\7&\2\2;M\3\2\2\2<=\5\26\f\2"+
		"=>\7&\2\2>M\3\2\2\2?@\5\20\t\2@A\7&\2\2AM\3\2\2\2BC\5\34\17\2CD\7&\2\2"+
		"DM\3\2\2\2EF\5\36\20\2FG\7&\2\2GM\3\2\2\2HI\5\20\t\2IJ\7&\2\2JM\3\2\2"+
		"\2KM\5\6\4\2L\63\3\2\2\2L\66\3\2\2\2L9\3\2\2\2L<\3\2\2\2L?\3\2\2\2LB\3"+
		"\2\2\2LE\3\2\2\2LH\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NO\7\64\2\2O\7\3\2\2\2"+
		"PQ\5$\23\2QR\5\n\6\2RW\3\2\2\2ST\5$\23\2TU\5(\25\2UW\3\2\2\2VP\3\2\2\2"+
		"VS\3\2\2\2W\t\3\2\2\2XY\5(\25\2Y\\\7\37\2\2Z]\5&\24\2[]\5(\25\2\\Z\3\2"+
		"\2\2\\[\3\2\2\2]g\3\2\2\2^_\5(\25\2_`\7\37\2\2`a\5\22\n\2ag\3\2\2\2bc"+
		"\5(\25\2cd\7\37\2\2de\5\f\7\2eg\3\2\2\2fX\3\2\2\2f^\3\2\2\2fb\3\2\2\2"+
		"g\13\3\2\2\2hi\t\2\2\2il\7\'\2\2jm\5&\24\2km\5(\25\2lj\3\2\2\2lk\3\2\2"+
		"\2mn\3\2\2\2no\7(\2\2o\r\3\2\2\2pq\7\r\2\2qr\7\'\2\2rs\5(\25\2st\7(\2"+
		"\2t\17\3\2\2\2uv\7\f\2\2v}\7\'\2\2w~\5&\24\2x~\5(\25\2yz\5&\24\2z{\7."+
		"\2\2{|\5(\25\2|~\3\2\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\7(\2\2\u0080\21\3\2\2\2\u0081\u0084\5&\24\2\u0082\u0084\5(\25\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088"+
		"\5\24\13\2\u0086\u0089\5&\24\2\u0087\u0089\5(\25\2\u0088\u0086\3\2\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\t\3\2\2\u008b\25\3\2"+
		"\2\2\u008c\u008d\7\16\2\2\u008d\u0090\7\'\2\2\u008e\u0091\5&\24\2\u008f"+
		"\u0091\5(\25\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0095\5 \21\2\u0093\u0096\5&\24\2\u0094\u0096\5(\25\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7("+
		"\2\2\u0098\u0099\7)\2\2\u0099\u009a\5\30\r\2\u009a\u009b\7*\2\2\u009b"+
		"\27\3\2\2\2\u009c\u009e\5\4\3\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\7*\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a5\7)\2\2\u00a4\u00a6\5\4\3\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00af\3\2\2\2\u00a9\u00ab\5\4\3\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u009d\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1"+
		"\t\4\2\2\u00b1\33\3\2\2\2\u00b2\u00b3\7\22\2\2\u00b3\u00b4\7\'\2\2\u00b4"+
		"\u00b5\5 \21\2\u00b5\u00b6\7(\2\2\u00b6\u00b8\7)\2\2\u00b7\u00b9\5\4\3"+
		"\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd\35\3\2\2\2\u00be"+
		"\u00bf\7\21\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c1\5(\25\2\u00c1\u00c2\7"+
		"\37\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c4\7&\2\2\u00c4\u00c5\5 \21\2\u00c5"+
		"\u00c6\7&\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8\7(\2\2\u00c8\u00ca\7)\2"+
		"\2\u00c9\u00cb\5\4\3\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7*\2\2\u00cf"+
		"\37\3\2\2\2\u00d0\u00d3\5&\24\2\u00d1\u00d3\5(\25\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\5\32\16\2\u00d5"+
		"\u00d8\5&\24\2\u00d6\u00d8\5(\25\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00f2\3\2\2\2\u00d9\u00dc\5&\24\2\u00da\u00dc\5(\25\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\5\32"+
		"\16\2\u00de\u00e1\5&\24\2\u00df\u00e1\5(\25\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\23\2\2\u00e3\u00e4\5"+
		" \21\2\u00e4\u00f2\3\2\2\2\u00e5\u00e8\5&\24\2\u00e6\u00e8\5(\25\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\5\32"+
		"\16\2\u00ea\u00ed\5&\24\2\u00eb\u00ed\5(\25\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\24\2\2\u00ef\u00f0\5"+
		" \21\2\u00f0\u00f2\3\2\2\2\u00f1\u00d2\3\2\2\2\u00f1\u00db\3\2\2\2\u00f1"+
		"\u00e7\3\2\2\2\u00f2!\3\2\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\7\37\2\2"+
		"\u00f5\u00f6\5(\25\2\u00f6\u00f7\t\5\2\2\u00f7\u00f8\7/\2\2\u00f8#\3\2"+
		"\2\2\u00f9\u00fa\t\6\2\2\u00fa%\3\2\2\2\u00fb\u00fc\t\7\2\2\u00fc\'\3"+
		"\2\2\2\u00fd\u00fe\7\61\2\2\u00fe)\3\2\2\2\32.LV\\fl}\u0083\u0088\u0090"+
		"\u0095\u009f\u00a7\u00ac\u00ae\u00ba\u00cc\u00d2\u00d7\u00db\u00e0\u00e7"+
		"\u00ec\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}