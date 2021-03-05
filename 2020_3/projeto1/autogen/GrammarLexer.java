// Generated from autogen/Grammar.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INTEGER=12, FLOAT=13, STRING=14, ID=15, WS=16, SPACE=17, 
		COMMENT=18, LINE_COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "INTEGER", "FLOAT", "STRING", "ID", "WS", "SPACE", "COMMENT", 
			"LINE_COMMENT"
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
			"INTEGER", "FLOAT", "STRING", "ID", "WS", "SPACE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\6\rL\n\r\r\r\16\rM\3\16\6\16Q\n\16\r\16\16\16"+
		"R\3\16\3\16\6\16W\n\16\r\16\16\16X\3\17\3\17\6\17]\n\17\r\17\16\17^\3"+
		"\17\3\17\3\20\5\20d\n\20\3\20\7\20g\n\20\f\20\16\20j\13\20\3\21\6\21m"+
		"\n\21\r\21\16\21n\3\21\3\21\3\22\6\22t\n\22\r\22\16\22u\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\7\23~\n\23\f\23\16\23\u0081\13\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\7\24\u008c\n\24\f\24\16\24\u008f\13\24\3\24"+
		"\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\b\3\2\62;\5\2\62;C\\c|\4\2C\\"+
		"c|\4\2\13\f\17\17\4\2\13\13\"\"\4\2\f\f\17\17\2\u009a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r"+
		">\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2"+
		"\31K\3\2\2\2\33P\3\2\2\2\35Z\3\2\2\2\37c\3\2\2\2!l\3\2\2\2#s\3\2\2\2%"+
		"y\3\2\2\2\'\u0087\3\2\2\2)*\7k\2\2*+\7p\2\2+,\7v\2\2,\4\3\2\2\2-.\7u\2"+
		"\2./\7v\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7i\2\2\63\6\3\2"+
		"\2\2\64\65\7h\2\2\65\66\7n\2\2\66\67\7q\2\2\678\7c\2\289\7v\2\29\b\3\2"+
		"\2\2:;\7*\2\2;\n\3\2\2\2<=\7.\2\2=\f\3\2\2\2>?\7+\2\2?\16\3\2\2\2@A\7"+
		"}\2\2A\20\3\2\2\2BC\7\177\2\2C\22\3\2\2\2DE\7w\2\2E\24\3\2\2\2FG\7=\2"+
		"\2G\26\3\2\2\2HI\7?\2\2I\30\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3"+
		"\2\2\2MN\3\2\2\2N\32\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2R"+
		"S\3\2\2\2ST\3\2\2\2TV\7\60\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y\34\3\2\2\2Z\\\7$\2\2[]\t\3\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_`\3\2\2\2`a\7$\2\2a\36\3\2\2\2bd\t\4\2\2cb\3\2\2\2dh\3"+
		"\2\2\2eg\t\3\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i \3\2\2\2jh\3"+
		"\2\2\2km\t\5\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b"+
		"\21\2\2q\"\3\2\2\2rt\t\6\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v"+
		"w\3\2\2\2wx\b\22\2\2x$\3\2\2\2yz\7\61\2\2z{\7,\2\2{\177\3\2\2\2|~\13\2"+
		"\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7,\2\2\u0083\u0084\7\61\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\b\23\2\2\u0086&\3\2\2\2\u0087\u0088\7\61\2"+
		"\2\u0088\u0089\7\61\2\2\u0089\u008d\3\2\2\2\u008a\u008c\t\7\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\b\24\2\2\u0091"+
		"(\3\2\2\2\17\2MRX\\^cfhnu\177\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}