package ANTLR;
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
		RULE_comparacion = 12, RULE_iteracion = 13, RULE_iter_while = 14, RULE_iter_for = 15, 
		RULE_condition = 16, RULE_recorrer = 17, RULE_tipo_dato = 18, RULE_valor = 19, 
		RULE_nombre = 20;
	public static final String[] ruleNames = {
		"program", "statement", "comentario", "declaracion", "asignacion", "funcion", 
		"readSentence", "printSentence", "operacion", "reformular", "pregunta", 
		"sinElse", "comparacion", "iteracion", "iter_while", "iter_for", "condition", 
		"recorrer", "tipo_dato", "valor", "nombre"
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
			setState(42);
			match(BEGIN);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << STRING_LITERAL) | (1L << ID) | (1L << COMENTARIOS))) != 0)) {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
		public IteracionContext iteracion() {
			return getRuleContext(IteracionContext.class,0);
		}
		public PreguntaContext pregunta() {
			return getRuleContext(PreguntaContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public PrintSentenceContext printSentence() {
			return getRuleContext(PrintSentenceContext.class,0);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				declaracion();
				setState(52);
				match(SEMIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				asignacion();
				setState(55);
				match(SEMIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				readSentence();
				setState(58);
				match(SEMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				iteracion();
				setState(61);
				match(SEMIC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				pregunta();
				setState(64);
				match(SEMIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				operacion();
				setState(67);
				match(SEMIC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				printSentence();
				setState(70);
				match(SEMIC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
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
			setState(75);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				tipo_dato();
				setState(78);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				tipo_dato();
				setState(81);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				nombre();
				setState(86);
				match(ES);
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(87);
					valor();
					}
					break;
				case ID:
					{
					setState(88);
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
				setState(91);
				nombre();
				setState(92);
				match(ES);
				setState(93);
				operacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				nombre();
				setState(96);
				match(ES);
				setState(97);
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
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COS) | (1L << SIN) | (1L << TAN) | (1L << ABS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(PARIZQ);
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(103);
				valor();
				}
				break;
			case ID:
				{
				setState(104);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
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
			setState(109);
			match(READ);
			setState(110);
			match(PARIZQ);
			setState(111);
			nombre();
			setState(112);
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
			setState(114);
			match(PRINTLN);
			setState(115);
			match(PARIZQ);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(116);
				valor();
				}
				break;
			case 2:
				{
				setState(117);
				nombre();
				}
				break;
			case 3:
				{
				setState(118);
				valor();
				setState(119);
				match(COMA);
				setState(120);
				nombre();
				}
				break;
			}
			setState(124);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(126);
				valor();
				}
				break;
			case ID:
				{
				setState(127);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
			reformular();
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(131);
				valor();
				}
				break;
			case ID:
				{
				setState(132);
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
			setState(135);
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
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
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
			setState(137);
			match(IF);
			setState(138);
			match(PARIZQ);
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(139);
				valor();
				}
				break;
			case ID:
				{
				setState(140);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143);
			comparacion();
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUM:
			case STRING_LITERAL:
				{
				setState(144);
				valor();
				}
				break;
			case ID:
				{
				setState(145);
				nombre();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
			match(PARDER);
			setState(149);
			match(LLAVIZQ);
			setState(150);
			sinElse();
			setState(151);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					statement();
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << STRING_LITERAL) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				setState(158);
				match(LLAVDER);
				setState(159);
				match(ELSE);
				setState(160);
				match(LLAVIZQ);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					statement();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << STRING_LITERAL) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
				}
				break;
			case 2:
				{
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					statement();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << STRING_LITERAL) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
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
			setState(173);
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
		enterRule(_localctx, 26, RULE_iteracion);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				iter_for();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
		enterRule(_localctx, 28, RULE_iter_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(WHILE);
			setState(180);
			match(PARIZQ);
			setState(181);
			condition();
			setState(182);
			match(PARDER);
			setState(183);
			match(LLAVIZQ);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				statement();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << STRING_LITERAL) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
			setState(189);
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
		enterRule(_localctx, 30, RULE_iter_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FOR);
			setState(192);
			match(PARIZQ);
			setState(193);
			nombre();
			setState(194);
			match(ES);
			setState(195);
			match(NUM);
			setState(196);
			match(SEMIC);
			setState(197);
			condition();
			setState(198);
			match(SEMIC);
			setState(199);
			recorrer();
			setState(200);
			match(PARDER);
			setState(201);
			match(LLAVIZQ);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				statement();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << BOOLEAN) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << PRINTLN) | (1L << READ) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUM) | (1L << STRING_LITERAL) | (1L << ID) | (1L << COMENTARIOS))) != 0) );
			setState(207);
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
		enterRule(_localctx, 32, RULE_condition);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(209);
					valor();
					}
					break;
				case ID:
					{
					setState(210);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(213);
				comparacion();
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(214);
					valor();
					}
					break;
				case ID:
					{
					setState(215);
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
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(218);
					valor();
					}
					break;
				case ID:
					{
					setState(219);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222);
				comparacion();
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(223);
					valor();
					}
					break;
				case ID:
					{
					setState(224);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227);
				match(AND);
				setState(228);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(230);
					valor();
					}
					break;
				case ID:
					{
					setState(231);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234);
				comparacion();
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
				case STRING_LITERAL:
					{
					setState(235);
					valor();
					}
					break;
				case ID:
					{
					setState(236);
					nombre();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239);
				match(OR);
				setState(240);
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
		enterRule(_localctx, 34, RULE_recorrer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			nombre();
			setState(245);
			match(ES);
			setState(246);
			nombre();
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==SUMAR || _la==RESTAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(248);
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
		enterRule(_localctx, 36, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		enterRule(_localctx, 38, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 40, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0103\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6f\n\6\3\7\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\t\3\t\3\n\3\n\5\n\u0083\n\n\3\n"+
		"\3\n\3\n\5\n\u0088\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\f\3\f"+
		"\3\f\5\f\u0095\n\f\3\f\3\f\3\f\3\f\3\f\3\r\6\r\u009d\n\r\r\r\16\r\u009e"+
		"\3\r\3\r\3\r\3\r\6\r\u00a5\n\r\r\r\16\r\u00a6\3\r\6\r\u00aa\n\r\r\r\16"+
		"\r\u00ab\5\r\u00ae\n\r\3\16\3\16\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\6\20\u00bc\n\20\r\20\16\20\u00bd\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00ce\n\21\r\21"+
		"\16\21\u00cf\3\21\3\21\3\22\3\22\5\22\u00d6\n\22\3\22\3\22\3\22\5\22\u00db"+
		"\n\22\3\22\3\22\5\22\u00df\n\22\3\22\3\22\3\22\5\22\u00e4\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00eb\n\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\22"+
		"\3\22\3\22\5\22\u00f5\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*\2\b\3\2\33\36\3\2\26\32\3\2 %\3\2\26\27\3\2\7\t\4\2\n\13/\60\2\u010f"+
		"\2,\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bU\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16"+
		"o\3\2\2\2\20t\3\2\2\2\22\u0082\3\2\2\2\24\u0089\3\2\2\2\26\u008b\3\2\2"+
		"\2\30\u00ad\3\2\2\2\32\u00af\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5\3\2\2\2"+
		" \u00c1\3\2\2\2\"\u00f4\3\2\2\2$\u00f6\3\2\2\2&\u00fc\3\2\2\2(\u00fe\3"+
		"\2\2\2*\u0100\3\2\2\2,\60\7\3\2\2-/\5\4\3\2.-\3\2\2\2/\62\3\2\2\2\60."+
		"\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\4\2\2\64\3"+
		"\3\2\2\2\65\66\5\b\5\2\66\67\7&\2\2\67L\3\2\2\289\5\n\6\29:\7&\2\2:L\3"+
		"\2\2\2;<\5\16\b\2<=\7&\2\2=L\3\2\2\2>?\5\34\17\2?@\7&\2\2@L\3\2\2\2AB"+
		"\5\26\f\2BC\7&\2\2CL\3\2\2\2DE\5\22\n\2EF\7&\2\2FL\3\2\2\2GH\5\20\t\2"+
		"HI\7&\2\2IL\3\2\2\2JL\5\6\4\2K\65\3\2\2\2K8\3\2\2\2K;\3\2\2\2K>\3\2\2"+
		"\2KA\3\2\2\2KD\3\2\2\2KG\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7\64\2\2N\7\3"+
		"\2\2\2OP\5&\24\2PQ\5\n\6\2QV\3\2\2\2RS\5&\24\2ST\5*\26\2TV\3\2\2\2UO\3"+
		"\2\2\2UR\3\2\2\2V\t\3\2\2\2WX\5*\26\2X[\7\37\2\2Y\\\5(\25\2Z\\\5*\26\2"+
		"[Y\3\2\2\2[Z\3\2\2\2\\f\3\2\2\2]^\5*\26\2^_\7\37\2\2_`\5\22\n\2`f\3\2"+
		"\2\2ab\5*\26\2bc\7\37\2\2cd\5\f\7\2df\3\2\2\2eW\3\2\2\2e]\3\2\2\2ea\3"+
		"\2\2\2f\13\3\2\2\2gh\t\2\2\2hk\7\'\2\2il\5(\25\2jl\5*\26\2ki\3\2\2\2k"+
		"j\3\2\2\2lm\3\2\2\2mn\7(\2\2n\r\3\2\2\2op\7\r\2\2pq\7\'\2\2qr\5*\26\2"+
		"rs\7(\2\2s\17\3\2\2\2tu\7\f\2\2u|\7\'\2\2v}\5(\25\2w}\5*\26\2xy\5(\25"+
		"\2yz\7.\2\2z{\5*\26\2{}\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2}~\3\2\2"+
		"\2~\177\7(\2\2\177\21\3\2\2\2\u0080\u0083\5(\25\2\u0081\u0083\5*\26\2"+
		"\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087"+
		"\5\24\13\2\u0085\u0088\5(\25\2\u0086\u0088\5*\26\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\23\3\2\2\2\u0089\u008a\t\3\2\2\u008a\25\3\2"+
		"\2\2\u008b\u008c\7\16\2\2\u008c\u008f\7\'\2\2\u008d\u0090\5(\25\2\u008e"+
		"\u0090\5*\26\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0094\5\32\16\2\u0092\u0095\5(\25\2\u0093\u0095\5*\26\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7("+
		"\2\2\u0097\u0098\7)\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7*\2\2\u009a"+
		"\27\3\2\2\2\u009b\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\7*\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a4\7)\2\2\u00a3\u00a5\5\4\3\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00ae\3\2\2\2\u00a8\u00aa\5\4\3\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u009c\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0"+
		"\t\4\2\2\u00b0\33\3\2\2\2\u00b1\u00b4\5 \21\2\u00b2\u00b4\5\36\20\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\22\2"+
		"\2\u00b6\u00b7\7\'\2\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9\7(\2\2\u00b9\u00bb"+
		"\7)\2\2\u00ba\u00bc\5\4\3\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7*"+
		"\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\7\'\2\2\u00c3\u00c4"+
		"\5*\26\2\u00c4\u00c5\7\37\2\2\u00c5\u00c6\7/\2\2\u00c6\u00c7\7&\2\2\u00c7"+
		"\u00c8\5\"\22\2\u00c8\u00c9\7&\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\7("+
		"\2\2\u00cb\u00cd\7)\2\2\u00cc\u00ce\5\4\3\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\7*\2\2\u00d2!\3\2\2\2\u00d3\u00d6\5(\25\2\u00d4\u00d6"+
		"\5*\26\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00da\5\32\16\2\u00d8\u00db\5(\25\2\u00d9\u00db\5*\26\2\u00da\u00d8\3"+
		"\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00f5\3\2\2\2\u00dc\u00df\5(\25\2\u00dd"+
		"\u00df\5*\26\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e3\5\32\16\2\u00e1\u00e4\5(\25\2\u00e2\u00e4\5*\26\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\23"+
		"\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00f5\3\2\2\2\u00e8\u00eb\5(\25\2\u00e9"+
		"\u00eb\5*\26\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ef\5\32\16\2\u00ed\u00f0\5(\25\2\u00ee\u00f0\5*\26\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\24"+
		"\2\2\u00f2\u00f3\5\"\22\2\u00f3\u00f5\3\2\2\2\u00f4\u00d5\3\2\2\2\u00f4"+
		"\u00de\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f5#\3\2\2\2\u00f6\u00f7\5*\26\2"+
		"\u00f7\u00f8\7\37\2\2\u00f8\u00f9\5*\26\2\u00f9\u00fa\t\5\2\2\u00fa\u00fb"+
		"\7/\2\2\u00fb%\3\2\2\2\u00fc\u00fd\t\6\2\2\u00fd\'\3\2\2\2\u00fe\u00ff"+
		"\t\7\2\2\u00ff)\3\2\2\2\u0100\u0101\7\61\2\2\u0101+\3\2\2\2\33\60KU[e"+
		"k|\u0082\u0087\u008f\u0094\u009e\u00a6\u00ab\u00ad\u00b3\u00bd\u00cf\u00d5"+
		"\u00da\u00de\u00e3\u00ea\u00ef\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}