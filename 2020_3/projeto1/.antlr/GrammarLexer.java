// Generated from /home/daniel/Desktop/compilers-cin/2020_3/projeto1/Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INTEGER=12, FLOAT=13, STRING=14, ID=15, WS=16, SPACE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "INTEGER", "FLOAT", "STRING", "ID", "WS", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'string'", "'float'", "'('", "','", "')'", "'{'", "'}'", 
			"'u'", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INTEGER", "FLOAT", "STRING", "ID", "WS", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6"+
		"\rH\n\r\r\r\16\rI\3\16\6\16M\n\16\r\16\16\16N\3\16\3\16\6\16S\n\16\r\16"+
		"\16\16T\3\17\3\17\6\17Y\n\17\r\17\16\17Z\3\17\3\17\3\20\5\20`\n\20\3\20"+
		"\7\20c\n\20\f\20\16\20f\13\20\3\21\6\21i\n\21\r\21\16\21j\3\21\3\21\3"+
		"\22\6\22p\n\22\r\22\16\22q\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\7\3\2\62;"+
		"\5\2\62;C\\c|\4\2C\\c|\4\2\13\f\17\17\4\2\13\13\"\"\2{\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5"+
		")\3\2\2\2\7\60\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2"+
		"\21>\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31G\3\2\2\2\33L\3\2\2"+
		"\2\35V\3\2\2\2\37_\3\2\2\2!h\3\2\2\2#o\3\2\2\2%&\7k\2\2&\'\7p\2\2\'(\7"+
		"v\2\2(\4\3\2\2\2)*\7u\2\2*+\7v\2\2+,\7t\2\2,-\7k\2\2-.\7p\2\2./\7i\2\2"+
		"/\6\3\2\2\2\60\61\7h\2\2\61\62\7n\2\2\62\63\7q\2\2\63\64\7c\2\2\64\65"+
		"\7v\2\2\65\b\3\2\2\2\66\67\7*\2\2\67\n\3\2\2\289\7.\2\29\f\3\2\2\2:;\7"+
		"+\2\2;\16\3\2\2\2<=\7}\2\2=\20\3\2\2\2>?\7\177\2\2?\22\3\2\2\2@A\7w\2"+
		"\2A\24\3\2\2\2BC\7=\2\2C\26\3\2\2\2DE\7?\2\2E\30\3\2\2\2FH\t\2\2\2GF\3"+
		"\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\32\3\2\2\2KM\t\2\2\2LK\3\2\2\2M"+
		"N\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\7\60\2\2QS\t\2\2\2RQ\3\2\2\2"+
		"ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\34\3\2\2\2VX\7$\2\2WY\t\3\2\2XW\3\2\2"+
		"\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7$\2\2]\36\3\2\2\2^`\t"+
		"\4\2\2_^\3\2\2\2`d\3\2\2\2ac\t\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2e \3\2\2\2fd\3\2\2\2gi\t\5\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2kl\3\2\2\2lm\b\21\2\2m\"\3\2\2\2np\t\6\2\2on\3\2\2\2pq\3\2\2\2q"+
		"o\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\22\2\2t$\3\2\2\2\r\2INTXZ_bdjq\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}