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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INTEGER=7, FLOAT=8, STRING=9, 
		ID=10, WS=11, SPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INTEGER", "FLOAT", "STRING", 
			"ID", "WS", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'string'", "'float'", "';'", "'='", "'u\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INTEGER", "FLOAT", "STRING", 
			"ID", "WS", "SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\6\b\65\n\b\r\b\16\b"+
		"\66\3\t\6\t:\n\t\r\t\16\t;\3\t\3\t\6\t@\n\t\r\t\16\tA\3\n\3\n\6\nF\n\n"+
		"\r\n\16\nG\3\n\3\n\3\13\5\13M\n\13\3\13\7\13P\n\13\f\13\16\13S\13\13\3"+
		"\f\6\fV\n\f\r\f\16\fW\3\f\3\f\3\r\6\r]\n\r\r\r\16\r^\3\r\3\r\2\2\16\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\7\3\2\62;"+
		"\5\2\62;C\\c|\4\2C\\c|\4\2\13\f\17\17\4\2\13\13\"\"\2h\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33"+
		"\3\2\2\2\5\37\3\2\2\2\7&\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17"+
		"\64\3\2\2\2\219\3\2\2\2\23C\3\2\2\2\25L\3\2\2\2\27U\3\2\2\2\31\\\3\2\2"+
		"\2\33\34\7k\2\2\34\35\7p\2\2\35\36\7v\2\2\36\4\3\2\2\2\37 \7u\2\2 !\7"+
		"v\2\2!\"\7t\2\2\"#\7k\2\2#$\7p\2\2$%\7i\2\2%\6\3\2\2\2&\'\7h\2\2\'(\7"+
		"n\2\2()\7q\2\2)*\7c\2\2*+\7v\2\2+\b\3\2\2\2,-\7=\2\2-\n\3\2\2\2./\7?\2"+
		"\2/\f\3\2\2\2\60\61\7w\2\2\61\62\7\f\2\2\62\16\3\2\2\2\63\65\t\2\2\2\64"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\20\3\2\2\28:"+
		"\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\7\60\2\2"+
		">@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\22\3\2\2\2CE\7$\2"+
		"\2DF\t\3\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7$\2"+
		"\2J\24\3\2\2\2KM\t\4\2\2LK\3\2\2\2MQ\3\2\2\2NP\t\3\2\2ON\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2R\26\3\2\2\2SQ\3\2\2\2TV\t\5\2\2UT\3\2\2\2VW\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\f\2\2Z\30\3\2\2\2[]\t\6\2\2\\"+
		"[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\r\2\2a\32\3\2\2"+
		"\2\r\2\66;AEGLOQW^\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}