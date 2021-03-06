package ANTLR;



// Generated from LexerDND.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerDND extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, ENTERO=3, BOOLEAN=4, STRING=5, TRUE=6, FALSE=7, PRINTLN=8, 
		READ=9, IF=10, THEN=11, ELSE=12, FOR=13, WHILE=14, AND=15, OR=16, CRITICO=17, 
		FALLO=18, SUMAR=19, RESTAR=20, MULTIPLICAR=21, DIVIDIR=22, RESTO=23, COS=24, 
		SIN=25, TAN=26, ABS=27, ES=28, MAYOR=29, MENOR=30, IGUAL=31, NOTIGUAL=32, 
		MAYORIGUAL=33, MENORIGUAL=34, SEMIC=35, PARIZQ=36, PARDER=37, LLAVIZQ=38, 
		LLAVDER=39, CORIZQ=40, CORDER=41, COM=42, COMA=43, NUM=44, STRING_LITERAL=45, 
		ID=46, IDS=47, WS=48, COMENTARIOS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "ENTERO", "BOOLEAN", "STRING", "TRUE", "FALSE", "PRINTLN", 
		"READ", "IF", "THEN", "ELSE", "FOR", "WHILE", "AND", "OR", "CRITICO", 
		"FALLO", "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR", "RESTO", "COS", 
		"SIN", "TAN", "ABS", "ES", "MAYOR", "MENOR", "IGUAL", "NOTIGUAL", "MAYORIGUAL", 
		"MENORIGUAL", "SEMIC", "PARIZQ", "PARDER", "LLAVIZQ", "LLAVDER", "CORIZQ", 
		"CORDER", "COM", "COMA", "NUM", "STRING_LITERAL", "ID", "IDS", "WS", "COMENTARIOS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Fabricate'", "'Bane'", "'StoneShape'", "'DetectGoodAndEvil'", 
		"'Message'", "'GOOD'", "'EVIL'", "'Sending'", "'ComprehendLanguages'", 
		"'Identify'", "'Command'", "'Nondetection'", "'Initiative'", "'Haste'", 
		"'&&'", "'||'", "'20'", "'1'", "'+'", "'-'", "'*'", "'/'", "'%'", "'ControlFlames'", 
		"'ControlWater'", "'ControlWinds'", "'AbsorbElements'", "'='", "'>'", 
		"'<'", "'=='", "'!='", "'>='", "'<='", "';'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "'\"'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "ENTERO", "BOOLEAN", "STRING", "TRUE", "FALSE", 
		"PRINTLN", "READ", "IF", "THEN", "ELSE", "FOR", "WHILE", "AND", "OR", 
		"CRITICO", "FALLO", "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR", "RESTO", 
		"COS", "SIN", "TAN", "ABS", "ES", "MAYOR", "MENOR", "IGUAL", "NOTIGUAL", 
		"MAYORIGUAL", "MENORIGUAL", "SEMIC", "PARIZQ", "PARDER", "LLAVIZQ", "LLAVDER", 
		"CORIZQ", "CORDER", "COM", "COMA", "NUM", "STRING_LITERAL", "ID", "IDS", 
		"WS", "COMENTARIOS"
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


	public LexerDND(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerDND.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u018a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\6-\u0160\n-\r-\16-\u0161\3.\3.\7.\u0166\n.\f.\16."+
		"\u0169\13.\3.\3.\3/\6/\u016e\n/\r/\16/\u016f\3\60\3\60\7\60\u0174\n\60"+
		"\f\60\16\60\u0177\13\60\3\61\6\61\u017a\n\61\r\61\16\61\u017b\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\7\62\u0184\n\62\f\62\16\62\u0187\13\62\3\62\3\62"+
		"\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\t\3\2\62"+
		";\5\2\f\f\17\17$$\5\2\62;C\\c|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\2\u018f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5o\3\2\2\2\7t\3\2"+
		"\2\2\t\177\3\2\2\2\13\u0091\3\2\2\2\r\u0099\3\2\2\2\17\u009e\3\2\2\2\21"+
		"\u00a3\3\2\2\2\23\u00ab\3\2\2\2\25\u00bf\3\2\2\2\27\u00c8\3\2\2\2\31\u00d0"+
		"\3\2\2\2\33\u00dd\3\2\2\2\35\u00e8\3\2\2\2\37\u00ee\3\2\2\2!\u00f1\3\2"+
		"\2\2#\u00f4\3\2\2\2%\u00f7\3\2\2\2\'\u00f9\3\2\2\2)\u00fb\3\2\2\2+\u00fd"+
		"\3\2\2\2-\u00ff\3\2\2\2/\u0101\3\2\2\2\61\u0103\3\2\2\2\63\u0111\3\2\2"+
		"\2\65\u011e\3\2\2\2\67\u012b\3\2\2\29\u013a\3\2\2\2;\u013c\3\2\2\2=\u013e"+
		"\3\2\2\2?\u0140\3\2\2\2A\u0143\3\2\2\2C\u0146\3\2\2\2E\u0149\3\2\2\2G"+
		"\u014c\3\2\2\2I\u014e\3\2\2\2K\u0150\3\2\2\2M\u0152\3\2\2\2O\u0154\3\2"+
		"\2\2Q\u0156\3\2\2\2S\u0158\3\2\2\2U\u015a\3\2\2\2W\u015c\3\2\2\2Y\u015f"+
		"\3\2\2\2[\u0163\3\2\2\2]\u016d\3\2\2\2_\u0171\3\2\2\2a\u0179\3\2\2\2c"+
		"\u017f\3\2\2\2ef\7H\2\2fg\7c\2\2gh\7d\2\2hi\7t\2\2ij\7k\2\2jk\7e\2\2k"+
		"l\7c\2\2lm\7v\2\2mn\7g\2\2n\4\3\2\2\2op\7D\2\2pq\7c\2\2qr\7p\2\2rs\7g"+
		"\2\2s\6\3\2\2\2tu\7U\2\2uv\7v\2\2vw\7q\2\2wx\7p\2\2xy\7g\2\2yz\7U\2\2"+
		"z{\7j\2\2{|\7c\2\2|}\7r\2\2}~\7g\2\2~\b\3\2\2\2\177\u0080\7F\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084\7e\2\2"+
		"\u0084\u0085\7v\2\2\u0085\u0086\7I\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7f\2\2\u0089\u008a\7C\2\2\u008a\u008b\7p\2\2\u008b"+
		"\u008c\7f\2\2\u008c\u008d\7G\2\2\u008d\u008e\7x\2\2\u008e\u008f\7k\2\2"+
		"\u008f\u0090\7n\2\2\u0090\n\3\2\2\2\u0091\u0092\7O\2\2\u0092\u0093\7g"+
		"\2\2\u0093\u0094\7u\2\2\u0094\u0095\7u\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7i\2\2\u0097\u0098\7g\2\2\u0098\f\3\2\2\2\u0099\u009a\7I\2\2\u009a\u009b"+
		"\7Q\2\2\u009b\u009c\7Q\2\2\u009c\u009d\7F\2\2\u009d\16\3\2\2\2\u009e\u009f"+
		"\7G\2\2\u009f\u00a0\7X\2\2\u00a0\u00a1\7K\2\2\u00a1\u00a2\7N\2\2\u00a2"+
		"\20\3\2\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7f\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7i\2\2"+
		"\u00aa\22\3\2\2\2\u00ab\u00ac\7E\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7"+
		"o\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7j\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7f\2\2\u00b5"+
		"\u00b6\7N\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7i\2\2"+
		"\u00b9\u00ba\7w\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7i\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd\u00be\7u\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1"+
		"\7f\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7k\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7{\2\2\u00c7\26\3\2\2\2\u00c8"+
		"\u00c9\7E\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7o\2\2"+
		"\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7f\2\2\u00cf\30\3\2"+
		"\2\2\u00d0\u00d1\7P\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4"+
		"\7f\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7e\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7q\2\2"+
		"\u00db\u00dc\7p\2\2\u00dc\32\3\2\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7"+
		"p\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7x\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\34\3\2\2\2\u00e8\u00e9\7J\2\2\u00e9\u00ea\7c\2\2\u00ea"+
		"\u00eb\7u\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\36\3\2\2\2\u00ee"+
		"\u00ef\7(\2\2\u00ef\u00f0\7(\2\2\u00f0 \3\2\2\2\u00f1\u00f2\7~\2\2\u00f2"+
		"\u00f3\7~\2\2\u00f3\"\3\2\2\2\u00f4\u00f5\7\64\2\2\u00f5\u00f6\7\62\2"+
		"\2\u00f6$\3\2\2\2\u00f7\u00f8\7\63\2\2\u00f8&\3\2\2\2\u00f9\u00fa\7-\2"+
		"\2\u00fa(\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc*\3\2\2\2\u00fd\u00fe\7,\2\2"+
		"\u00fe,\3\2\2\2\u00ff\u0100\7\61\2\2\u0100.\3\2\2\2\u0101\u0102\7\'\2"+
		"\2\u0102\60\3\2\2\2\u0103\u0104\7E\2\2\u0104\u0105\7q\2\2\u0105\u0106"+
		"\7p\2\2\u0106\u0107\7v\2\2\u0107\u0108\7t\2\2\u0108\u0109\7q\2\2\u0109"+
		"\u010a\7n\2\2\u010a\u010b\7H\2\2\u010b\u010c\7n\2\2\u010c\u010d\7c\2\2"+
		"\u010d\u010e\7o\2\2\u010e\u010f\7g\2\2\u010f\u0110\7u\2\2\u0110\62\3\2"+
		"\2\2\u0111\u0112\7E\2\2\u0112\u0113\7q\2\2\u0113\u0114\7p\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7t\2\2\u0116\u0117\7q\2\2\u0117\u0118\7n\2\2\u0118"+
		"\u0119\7Y\2\2\u0119\u011a\7c\2\2\u011a\u011b\7v\2\2\u011b\u011c\7g\2\2"+
		"\u011c\u011d\7t\2\2\u011d\64\3\2\2\2\u011e\u011f\7E\2\2\u011f\u0120\7"+
		"q\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124"+
		"\7q\2\2\u0124\u0125\7n\2\2\u0125\u0126\7Y\2\2\u0126\u0127\7k\2\2\u0127"+
		"\u0128\7p\2\2\u0128\u0129\7f\2\2\u0129\u012a\7u\2\2\u012a\66\3\2\2\2\u012b"+
		"\u012c\7C\2\2\u012c\u012d\7d\2\2\u012d\u012e\7u\2\2\u012e\u012f\7q\2\2"+
		"\u012f\u0130\7t\2\2\u0130\u0131\7d\2\2\u0131\u0132\7G\2\2\u0132\u0133"+
		"\7n\2\2\u0133\u0134\7g\2\2\u0134\u0135\7o\2\2\u0135\u0136\7g\2\2\u0136"+
		"\u0137\7p\2\2\u0137\u0138\7v\2\2\u0138\u0139\7u\2\2\u01398\3\2\2\2\u013a"+
		"\u013b\7?\2\2\u013b:\3\2\2\2\u013c\u013d\7@\2\2\u013d<\3\2\2\2\u013e\u013f"+
		"\7>\2\2\u013f>\3\2\2\2\u0140\u0141\7?\2\2\u0141\u0142\7?\2\2\u0142@\3"+
		"\2\2\2\u0143\u0144\7#\2\2\u0144\u0145\7?\2\2\u0145B\3\2\2\2\u0146\u0147"+
		"\7@\2\2\u0147\u0148\7?\2\2\u0148D\3\2\2\2\u0149\u014a\7>\2\2\u014a\u014b"+
		"\7?\2\2\u014bF\3\2\2\2\u014c\u014d\7=\2\2\u014dH\3\2\2\2\u014e\u014f\7"+
		"*\2\2\u014fJ\3\2\2\2\u0150\u0151\7+\2\2\u0151L\3\2\2\2\u0152\u0153\7}"+
		"\2\2\u0153N\3\2\2\2\u0154\u0155\7\177\2\2\u0155P\3\2\2\2\u0156\u0157\7"+
		"]\2\2\u0157R\3\2\2\2\u0158\u0159\7_\2\2\u0159T\3\2\2\2\u015a\u015b\7$"+
		"\2\2\u015bV\3\2\2\2\u015c\u015d\7.\2\2\u015dX\3\2\2\2\u015e\u0160\t\2"+
		"\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162Z\3\2\2\2\u0163\u0167\7$\2\2\u0164\u0166\n\3\2\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7$\2\2\u016b"+
		"\\\3\2\2\2\u016c\u016e\t\4\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170^\3\2\2\2\u0171\u0175\t"+
		"\5\2\2\u0172\u0174\t\6\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176`\3\2\2\2\u0177\u0175\3\2\2\2"+
		"\u0178\u017a\t\7\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\b\61\2\2"+
		"\u017eb\3\2\2\2\u017f\u0180\7\61\2\2\u0180\u0181\7\61\2\2\u0181\u0185"+
		"\3\2\2\2\u0182\u0184\n\b\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0188\u0189\b\62\2\2\u0189d\3\2\2\2\t\2\u0161\u0167\u016f\u0175\u017b"+
		"\u0185\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}