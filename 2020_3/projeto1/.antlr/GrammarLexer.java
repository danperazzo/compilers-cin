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
		INTEGER=10, FLOAT=11, STRING=12, ID=13, WS=14, SPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"INTEGER", "FLOAT", "STRING", "ID", "WS", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'string'", "'float'", "'('", "','", "')'", "'o'", "';'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "INTEGER", 
			"FLOAT", "STRING", "ID", "WS", "SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13@\n\13\r\13\16\13A\3\f\6\fE\n\f\r"+
		"\f\16\fF\3\f\3\f\6\fK\n\f\r\f\16\fL\3\r\3\r\6\rQ\n\r\r\r\16\rR\3\r\3\r"+
		"\3\16\5\16X\n\16\3\16\7\16[\n\16\f\16\16\16^\13\16\3\17\6\17a\n\17\r\17"+
		"\16\17b\3\17\3\17\3\20\6\20h\n\20\r\20\16\20i\3\20\3\20\2\2\21\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3"+
		"\2\7\3\2\62;\5\2\62;C\\c|\4\2C\\c|\4\2\13\f\17\17\4\2\13\13\"\"\2s\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5%\3\2\2\2"+
		"\7,\3\2\2\2\t\62\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3"+
		"\2\2\2\23<\3\2\2\2\25?\3\2\2\2\27D\3\2\2\2\31N\3\2\2\2\33W\3\2\2\2\35"+
		"`\3\2\2\2\37g\3\2\2\2!\"\7k\2\2\"#\7p\2\2#$\7v\2\2$\4\3\2\2\2%&\7u\2\2"+
		"&\'\7v\2\2\'(\7t\2\2()\7k\2\2)*\7p\2\2*+\7i\2\2+\6\3\2\2\2,-\7h\2\2-."+
		"\7n\2\2./\7q\2\2/\60\7c\2\2\60\61\7v\2\2\61\b\3\2\2\2\62\63\7*\2\2\63"+
		"\n\3\2\2\2\64\65\7.\2\2\65\f\3\2\2\2\66\67\7+\2\2\67\16\3\2\2\289\7q\2"+
		"\29\20\3\2\2\2:;\7=\2\2;\22\3\2\2\2<=\7?\2\2=\24\3\2\2\2>@\t\2\2\2?>\3"+
		"\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\26\3\2\2\2CE\t\2\2\2DC\3\2\2\2E"+
		"F\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\7\60\2\2IK\t\2\2\2JI\3\2\2\2"+
		"KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\30\3\2\2\2NP\7$\2\2OQ\t\3\2\2PO\3\2\2"+
		"\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7$\2\2U\32\3\2\2\2VX\t\4"+
		"\2\2WV\3\2\2\2X\\\3\2\2\2Y[\t\3\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]"+
		"\3\2\2\2]\34\3\2\2\2^\\\3\2\2\2_a\t\5\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2cd\3\2\2\2de\b\17\2\2e\36\3\2\2\2fh\t\6\2\2gf\3\2\2\2hi\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\20\2\2l \3\2\2\2\r\2AFLPRWZ\\"+
		"bi\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}