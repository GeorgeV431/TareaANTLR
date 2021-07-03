// Generated from Lexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, ENTERO=2, FLOTANTE=3, BOOLEAN=4, STRING=5, TRUE=6, FALSE=7, PRINTLN=8, 
		READ=9, IF=10, THEN=11, ELSE=12, FOR=13, WHILE=14, END=15, SUMAR=16, RESTAR=17, 
		MULTIPLICAR=18, DIVIDIR=19, RESTO=20, AND=21, OR=22, NOT=23, ES=24, MAYOR=25, 
		MENOR=26, IGUAL=27, NOIGUAL=28, MAYORAL=29, MENORAL=30, SC=31, PARIZQ=32, 
		PARDER=33, LLAVIZQ=34, LLAVDER=35, CORIZQ=36, CORDER=37, COM=38, COMA=39, 
		NUM=40, ID=41, IDS=42, WS=43, COMENTARIOS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "ENTERO", "FLOTANTE", "BOOLEAN", "STRING", "TRUE", "FALSE", "PRINTLN", 
		"READ", "IF", "THEN", "ELSE", "FOR", "WHILE", "END", "SUMAR", "RESTAR", 
		"MULTIPLICAR", "DIVIDIR", "RESTO", "AND", "OR", "NOT", "ES", "MAYOR", 
		"MENOR", "IGUAL", "NOIGUAL", "MAYORAL", "MENORAL", "SC", "PARIZQ", "PARDER", 
		"LLAVIZQ", "LLAVDER", "CORIZQ", "CORDER", "COM", "COMA", "NUM", "ID", 
		"IDS", "WS", "COMENTARIOS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Fabricate'", "'Symbol'", "'Weird'", "'DetectGoodAndEvil'", "'Message'", 
		"'Good'", "'Evil'", "'Sending'", "'ComprehendLanguages'", "'Identify'", 
		"'Command'", "'Nondetection'", "'Initiative'", "'romantizar'", "'BANE'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'='", "'>'", 
		"'<'", "'=='", "'!='", "'>='", "'<='", "';'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "'\"'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "ENTERO", "FLOTANTE", "BOOLEAN", "STRING", "TRUE", "FALSE", 
		"PRINTLN", "READ", "IF", "THEN", "ELSE", "FOR", "WHILE", "END", "SUMAR", 
		"RESTAR", "MULTIPLICAR", "DIVIDIR", "RESTO", "AND", "OR", "NOT", "ES", 
		"MAYOR", "MENOR", "IGUAL", "NOIGUAL", "MAYORAL", "MENORAL", "SC", "PARIZQ", 
		"PARDER", "LLAVIZQ", "LLAVDER", "CORIZQ", "CORDER", "COM", "COMA", "NUM", 
		"ID", "IDS", "WS", "COMENTARIOS"
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


	public Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\6)\u0123\n)\r)\16)\u0124\3*\6*\u0128\n*\r*\16"+
		"*\u0129\3+\3+\7+\u012e\n+\f+\16+\u0131\13+\3,\6,\u0134\n,\r,\16,\u0135"+
		"\3,\3,\3-\3-\3-\3-\7-\u013e\n-\f-\16-\u0141\13-\3-\3-\2\2.\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.\3\2\b\3\2\62;\4\2C\\c|\5\2C\\aac|\5\2\62;C\\c|\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0148\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\3[\3\2\2\2\5e\3\2\2\2\7l\3\2\2\2\tr\3\2\2\2\13\u0084\3\2\2\2\r\u008c"+
		"\3\2\2\2\17\u0091\3\2\2\2\21\u0096\3\2\2\2\23\u009e\3\2\2\2\25\u00b2\3"+
		"\2\2\2\27\u00bb\3\2\2\2\31\u00c3\3\2\2\2\33\u00d0\3\2\2\2\35\u00db\3\2"+
		"\2\2\37\u00e6\3\2\2\2!\u00eb\3\2\2\2#\u00ed\3\2\2\2%\u00ef\3\2\2\2\'\u00f1"+
		"\3\2\2\2)\u00f3\3\2\2\2+\u00f5\3\2\2\2-\u00f8\3\2\2\2/\u00fb\3\2\2\2\61"+
		"\u00fd\3\2\2\2\63\u00ff\3\2\2\2\65\u0101\3\2\2\2\67\u0103\3\2\2\29\u0106"+
		"\3\2\2\2;\u0109\3\2\2\2=\u010c\3\2\2\2?\u010f\3\2\2\2A\u0111\3\2\2\2C"+
		"\u0113\3\2\2\2E\u0115\3\2\2\2G\u0117\3\2\2\2I\u0119\3\2\2\2K\u011b\3\2"+
		"\2\2M\u011d\3\2\2\2O\u011f\3\2\2\2Q\u0122\3\2\2\2S\u0127\3\2\2\2U\u012b"+
		"\3\2\2\2W\u0133\3\2\2\2Y\u0139\3\2\2\2[\\\7H\2\2\\]\7c\2\2]^\7d\2\2^_"+
		"\7t\2\2_`\7k\2\2`a\7e\2\2ab\7c\2\2bc\7v\2\2cd\7g\2\2d\4\3\2\2\2ef\7U\2"+
		"\2fg\7{\2\2gh\7o\2\2hi\7d\2\2ij\7q\2\2jk\7n\2\2k\6\3\2\2\2lm\7Y\2\2mn"+
		"\7g\2\2no\7k\2\2op\7t\2\2pq\7f\2\2q\b\3\2\2\2rs\7F\2\2st\7g\2\2tu\7v\2"+
		"\2uv\7g\2\2vw\7e\2\2wx\7v\2\2xy\7I\2\2yz\7q\2\2z{\7q\2\2{|\7f\2\2|}\7"+
		"C\2\2}~\7p\2\2~\177\7f\2\2\177\u0080\7G\2\2\u0080\u0081\7x\2\2\u0081\u0082"+
		"\7k\2\2\u0082\u0083\7n\2\2\u0083\n\3\2\2\2\u0084\u0085\7O\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7u\2\2\u0087\u0088\7u\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7i\2\2\u008a\u008b\7g\2\2\u008b\f\3\2\2\2\u008c\u008d\7I\2\2\u008d"+
		"\u008e\7q\2\2\u008e\u008f\7q\2\2\u008f\u0090\7f\2\2\u0090\16\3\2\2\2\u0091"+
		"\u0092\7G\2\2\u0092\u0093\7x\2\2\u0093\u0094\7k\2\2\u0094\u0095\7n\2\2"+
		"\u0095\20\3\2\2\2\u0096\u0097\7U\2\2\u0097\u0098\7g\2\2\u0098\u0099\7"+
		"p\2\2\u0099\u009a\7f\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7i\2\2\u009d\22\3\2\2\2\u009e\u009f\7E\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1"+
		"\7o\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7j\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7f\2\2"+
		"\u00a8\u00a9\7N\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac"+
		"\7i\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7i\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7u\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7K\2\2\u00b3"+
		"\u00b4\7f\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2"+
		"\u00b7\u00b8\7k\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7{\2\2\u00ba\26\3\2"+
		"\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7o\2\2\u00be\u00bf"+
		"\7o\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7f\2\2\u00c2"+
		"\30\3\2\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\u00c7\7f\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7g\2\2"+
		"\u00ca\u00cb\7e\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\32\3\2\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2"+
		"\7p\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7c\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7x\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\34\3\2\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7"+
		"q\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7|\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\7D\2\2\u00e7\u00e8\7C\2\2\u00e8"+
		"\u00e9\7P\2\2\u00e9\u00ea\7G\2\2\u00ea \3\2\2\2\u00eb\u00ec\7-\2\2\u00ec"+
		"\"\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0"+
		"&\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2(\3\2\2\2\u00f3\u00f4\7\'\2\2\u00f4"+
		"*\3\2\2\2\u00f5\u00f6\7(\2\2\u00f6\u00f7\7(\2\2\u00f7,\3\2\2\2\u00f8\u00f9"+
		"\7~\2\2\u00f9\u00fa\7~\2\2\u00fa.\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\60"+
		"\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe\62\3\2\2\2\u00ff\u0100\7@\2\2\u0100"+
		"\64\3\2\2\2\u0101\u0102\7>\2\2\u0102\66\3\2\2\2\u0103\u0104\7?\2\2\u0104"+
		"\u0105\7?\2\2\u01058\3\2\2\2\u0106\u0107\7#\2\2\u0107\u0108\7?\2\2\u0108"+
		":\3\2\2\2\u0109\u010a\7@\2\2\u010a\u010b\7?\2\2\u010b<\3\2\2\2\u010c\u010d"+
		"\7>\2\2\u010d\u010e\7?\2\2\u010e>\3\2\2\2\u010f\u0110\7=\2\2\u0110@\3"+
		"\2\2\2\u0111\u0112\7*\2\2\u0112B\3\2\2\2\u0113\u0114\7+\2\2\u0114D\3\2"+
		"\2\2\u0115\u0116\7}\2\2\u0116F\3\2\2\2\u0117\u0118\7\177\2\2\u0118H\3"+
		"\2\2\2\u0119\u011a\7]\2\2\u011aJ\3\2\2\2\u011b\u011c\7_\2\2\u011cL\3\2"+
		"\2\2\u011d\u011e\7$\2\2\u011eN\3\2\2\2\u011f\u0120\7.\2\2\u0120P\3\2\2"+
		"\2\u0121\u0123\t\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125R\3\2\2\2\u0126\u0128\t\3\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012aT\3\2\2\2\u012b\u012f\t\4\2\2\u012c\u012e\t\5\2\2\u012d\u012c"+
		"\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"V\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\t\6\2\2\u0133\u0132\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0138\b,\2\2\u0138X\3\2\2\2\u0139\u013a\7\61\2\2\u013a"+
		"\u013b\7\61\2\2\u013b\u013f\3\2\2\2\u013c\u013e\n\7\2\2\u013d\u013c\3"+
		"\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\b-\2\2\u0143Z\3\2\2\2\b"+
		"\2\u0124\u0129\u012f\u0135\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}