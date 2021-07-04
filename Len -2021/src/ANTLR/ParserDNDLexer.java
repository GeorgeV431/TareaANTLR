package ANTLR;

// Generated from ParserDND.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserDNDLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "VAR", "CONST", "ENTERO", "BOOLEAN", "STRING", "TRUE", 
		"FALSE", "PRINTLN", "READ", "IF", "THEN", "ELSE", "FOR", "WHILE", "AND", 
		"OR", "NOT", "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR", "RESTO", "COS", 
		"SIN", "TAN", "ABS", "ES", "MAYOR", "MENOR", "IGUAL", "NOTIGUAL", "MAYORIGUAL", 
		"MENORIGUAL", "SEMIC", "PARIZQ", "PARDER", "LLAVIZQ", "LLAVDER", "CORIZQ", 
		"CORDER", "COM", "COMA", "NUM", "STRING_LITERAL", "ID", "IDS", "WS", "COMENTARIOS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Fabricate'", "'Bane'", "'Symbol'", "'ImmovableObject'", "'StoneShape'", 
		"'DetectGoodAndEvil'", "'Message'", "'GOOD'", "'EVIL'", "'Sending'", "'ComprehendLanguages'", 
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


	public ParserDNDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserDND.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\6.\u0176\n.\r.\16"+
		".\u0177\3/\3/\7/\u017c\n/\f/\16/\u017f\13/\3/\3/\3\60\6\60\u0184\n\60"+
		"\r\60\16\60\u0185\3\61\3\61\7\61\u018a\n\61\f\61\16\61\u018d\13\61\3\62"+
		"\6\62\u0190\n\62\r\62\16\62\u0191\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u019a"+
		"\n\63\f\63\16\63\u019d\13\63\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\t\3\2\62;\5\2\f\f\17\17$$\5\2\62;C\\"+
		"c|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u01a5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5q\3\2\2\2\7v\3\2\2\2\t}\3\2\2"+
		"\2\13\u008d\3\2\2\2\r\u0098\3\2\2\2\17\u00aa\3\2\2\2\21\u00b2\3\2\2\2"+
		"\23\u00b7\3\2\2\2\25\u00bc\3\2\2\2\27\u00c4\3\2\2\2\31\u00d8\3\2\2\2\33"+
		"\u00e1\3\2\2\2\35\u00e9\3\2\2\2\37\u00f6\3\2\2\2!\u0101\3\2\2\2#\u0107"+
		"\3\2\2\2%\u010a\3\2\2\2\'\u010d\3\2\2\2)\u010f\3\2\2\2+\u0111\3\2\2\2"+
		"-\u0113\3\2\2\2/\u0115\3\2\2\2\61\u0117\3\2\2\2\63\u0119\3\2\2\2\65\u0127"+
		"\3\2\2\2\67\u0134\3\2\2\29\u0141\3\2\2\2;\u0150\3\2\2\2=\u0152\3\2\2\2"+
		"?\u0154\3\2\2\2A\u0156\3\2\2\2C\u0159\3\2\2\2E\u015c\3\2\2\2G\u015f\3"+
		"\2\2\2I\u0162\3\2\2\2K\u0164\3\2\2\2M\u0166\3\2\2\2O\u0168\3\2\2\2Q\u016a"+
		"\3\2\2\2S\u016c\3\2\2\2U\u016e\3\2\2\2W\u0170\3\2\2\2Y\u0172\3\2\2\2["+
		"\u0175\3\2\2\2]\u0179\3\2\2\2_\u0183\3\2\2\2a\u0187\3\2\2\2c\u018f\3\2"+
		"\2\2e\u0195\3\2\2\2gh\7H\2\2hi\7c\2\2ij\7d\2\2jk\7t\2\2kl\7k\2\2lm\7e"+
		"\2\2mn\7c\2\2no\7v\2\2op\7g\2\2p\4\3\2\2\2qr\7D\2\2rs\7c\2\2st\7p\2\2"+
		"tu\7g\2\2u\6\3\2\2\2vw\7U\2\2wx\7{\2\2xy\7o\2\2yz\7d\2\2z{\7q\2\2{|\7"+
		"n\2\2|\b\3\2\2\2}~\7K\2\2~\177\7o\2\2\177\u0080\7o\2\2\u0080\u0081\7q"+
		"\2\2\u0081\u0082\7x\2\2\u0082\u0083\7c\2\2\u0083\u0084\7d\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7g\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7d\2\2\u0088"+
		"\u0089\7l\2\2\u0089\u008a\7g\2\2\u008a\u008b\7e\2\2\u008b\u008c\7v\2\2"+
		"\u008c\n\3\2\2\2\u008d\u008e\7U\2\2\u008e\u008f\7v\2\2\u008f\u0090\7q"+
		"\2\2\u0090\u0091\7p\2\2\u0091\u0092\7g\2\2\u0092\u0093\7U\2\2\u0093\u0094"+
		"\7j\2\2\u0094\u0095\7c\2\2\u0095\u0096\7r\2\2\u0096\u0097\7g\2\2\u0097"+
		"\f\3\2\2\2\u0098\u0099\7F\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7e\2\2\u009d\u009e\7v\2\2\u009e\u009f\7I\2\2"+
		"\u009f\u00a0\7q\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3"+
		"\7C\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7G\2\2\u00a6"+
		"\u00a7\7x\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a9\16\3\2\2\2\u00aa"+
		"\u00ab\7O\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7u\2\2"+
		"\u00ae\u00af\7c\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7g\2\2\u00b1\20\3\2"+
		"\2\2\u00b2\u00b3\7I\2\2\u00b3\u00b4\7Q\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00b6"+
		"\7F\2\2\u00b6\22\3\2\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7X\2\2\u00b9\u00ba"+
		"\7K\2\2\u00ba\u00bb\7N\2\2\u00bb\24\3\2\2\2\u00bc\u00bd\7U\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7i\2\2\u00c3\26\3\2\2\2\u00c4\u00c5\7E\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2"+
		"\u00c9\u00ca\7g\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7N\2\2\u00cf\u00d0\7c\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7i\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7c\2\2"+
		"\u00d4\u00d5\7i\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7u\2\2\u00d7\30\3\2"+
		"\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7h\2\2\u00df"+
		"\u00e0\7{\2\2\u00e0\32\3\2\2\2\u00e1\u00e2\7E\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7o\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7p\2\2"+
		"\u00e7\u00e8\7f\2\2\u00e8\34\3\2\2\2\u00e9\u00ea\7P\2\2\u00ea\u00eb\7"+
		"q\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7k\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7p\2\2\u00f5\36\3\2\2\2\u00f6"+
		"\u00f7\7K\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7v\2\2"+
		"\u00fa\u00fb\7k\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe"+
		"\7k\2\2\u00fe\u00ff\7x\2\2\u00ff\u0100\7g\2\2\u0100 \3\2\2\2\u0101\u0102"+
		"\7J\2\2\u0102\u0103\7c\2\2\u0103\u0104\7u\2\2\u0104\u0105\7v\2\2\u0105"+
		"\u0106\7g\2\2\u0106\"\3\2\2\2\u0107\u0108\7(\2\2\u0108\u0109\7(\2\2\u0109"+
		"$\3\2\2\2\u010a\u010b\7~\2\2\u010b\u010c\7~\2\2\u010c&\3\2\2\2\u010d\u010e"+
		"\7#\2\2\u010e(\3\2\2\2\u010f\u0110\7-\2\2\u0110*\3\2\2\2\u0111\u0112\7"+
		"/\2\2\u0112,\3\2\2\2\u0113\u0114\7,\2\2\u0114.\3\2\2\2\u0115\u0116\7\61"+
		"\2\2\u0116\60\3\2\2\2\u0117\u0118\7\'\2\2\u0118\62\3\2\2\2\u0119\u011a"+
		"\7E\2\2\u011a\u011b\7q\2\2\u011b\u011c\7p\2\2\u011c\u011d\7v\2\2\u011d"+
		"\u011e\7t\2\2\u011e\u011f\7q\2\2\u011f\u0120\7n\2\2\u0120\u0121\7H\2\2"+
		"\u0121\u0122\7n\2\2\u0122\u0123\7c\2\2\u0123\u0124\7o\2\2\u0124\u0125"+
		"\7g\2\2\u0125\u0126\7u\2\2\u0126\64\3\2\2\2\u0127\u0128\7E\2\2\u0128\u0129"+
		"\7q\2\2\u0129\u012a\7p\2\2\u012a\u012b\7v\2\2\u012b\u012c\7t\2\2\u012c"+
		"\u012d\7q\2\2\u012d\u012e\7n\2\2\u012e\u012f\7Y\2\2\u012f\u0130\7c\2\2"+
		"\u0130\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132\u0133\7t\2\2\u0133\66\3\2"+
		"\2\2\u0134\u0135\7E\2\2\u0135\u0136\7q\2\2\u0136\u0137\7p\2\2\u0137\u0138"+
		"\7v\2\2\u0138\u0139\7t\2\2\u0139\u013a\7q\2\2\u013a\u013b\7n\2\2\u013b"+
		"\u013c\7Y\2\2\u013c\u013d\7k\2\2\u013d\u013e\7p\2\2\u013e\u013f\7f\2\2"+
		"\u013f\u0140\7u\2\2\u01408\3\2\2\2\u0141\u0142\7C\2\2\u0142\u0143\7d\2"+
		"\2\u0143\u0144\7u\2\2\u0144\u0145\7q\2\2\u0145\u0146\7t\2\2\u0146\u0147"+
		"\7d\2\2\u0147\u0148\7G\2\2\u0148\u0149\7n\2\2\u0149\u014a\7g\2\2\u014a"+
		"\u014b\7o\2\2\u014b\u014c\7g\2\2\u014c\u014d\7p\2\2\u014d\u014e\7v\2\2"+
		"\u014e\u014f\7u\2\2\u014f:\3\2\2\2\u0150\u0151\7?\2\2\u0151<\3\2\2\2\u0152"+
		"\u0153\7@\2\2\u0153>\3\2\2\2\u0154\u0155\7>\2\2\u0155@\3\2\2\2\u0156\u0157"+
		"\7?\2\2\u0157\u0158\7?\2\2\u0158B\3\2\2\2\u0159\u015a\7#\2\2\u015a\u015b"+
		"\7?\2\2\u015bD\3\2\2\2\u015c\u015d\7@\2\2\u015d\u015e\7?\2\2\u015eF\3"+
		"\2\2\2\u015f\u0160\7>\2\2\u0160\u0161\7?\2\2\u0161H\3\2\2\2\u0162\u0163"+
		"\7=\2\2\u0163J\3\2\2\2\u0164\u0165\7*\2\2\u0165L\3\2\2\2\u0166\u0167\7"+
		"+\2\2\u0167N\3\2\2\2\u0168\u0169\7}\2\2\u0169P\3\2\2\2\u016a\u016b\7\177"+
		"\2\2\u016bR\3\2\2\2\u016c\u016d\7]\2\2\u016dT\3\2\2\2\u016e\u016f\7_\2"+
		"\2\u016fV\3\2\2\2\u0170\u0171\7$\2\2\u0171X\3\2\2\2\u0172\u0173\7.\2\2"+
		"\u0173Z\3\2\2\2\u0174\u0176\t\2\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\\\3\2\2\2\u0179\u017d"+
		"\7$\2\2\u017a\u017c\n\3\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u0180\u0181\7$\2\2\u0181^\3\2\2\2\u0182\u0184\t\4\2\2\u0183\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"`\3\2\2\2\u0187\u018b\t\5\2\2\u0188\u018a\t\6\2\2\u0189\u0188\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cb\3"+
		"\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\t\7\2\2\u018f\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\b\62\2\2\u0194d\3\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197"+
		"\7\61\2\2\u0197\u019b\3\2\2\2\u0198\u019a\n\b\2\2\u0199\u0198\3\2\2\2"+
		"\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\b\63\2\2\u019ff\3\2\2\2\t\2\u0177"+
		"\u017d\u0185\u018b\u0191\u019b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}