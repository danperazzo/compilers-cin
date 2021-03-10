// Generated from /home/daniel/Desktop/compilers-cin/2020_3/projeto1/Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, INTEGER=31, 
		FLOAT=32, STRING=33, ID=34, WS=35, SPACE=36, COMMENT=37, LINE_COMMENT=38, 
		INCLUDE=39, DEFINE=40;
	public static final int
		RULE_type = 0, RULE_identifier = 1, RULE_integer = 2, RULE_floating = 3, 
		RULE_string = 4, RULE_function_call = 5, RULE_arguments = 6, RULE_body = 7, 
		RULE_statement = 8, RULE_expression = 9, RULE_array = 10, RULE_array_literal = 11, 
		RULE_if_statement = 12, RULE_else_statement = 13, RULE_for_loop = 14, 
		RULE_for_initializer = 15, RULE_for_condition = 16, RULE_for_step = 17, 
		RULE_file = 18, RULE_variable_definition = 19, RULE_variable_assignment = 20, 
		RULE_function_definition = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "identifier", "integer", "floating", "string", "function_call", 
			"arguments", "body", "statement", "expression", "array", "array_literal", 
			"if_statement", "else_statement", "for_loop", "for_initializer", "for_condition", 
			"for_step", "file", "variable_definition", "variable_assignment", "function_definition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'('", "','", "')'", "'{'", "'}'", "'return'", 
			"';'", "'/'", "'*'", "'+'", "'-'", "'<'", "'>'", "'>='", "'<='", "'=='", 
			"'!='", "'['", "']'", "'if'", "'else'", "'for'", "'='", "'/='", "'+='", 
			"'-='", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INTEGER", "FLOAT", "STRING", 
			"ID", "WS", "SPACE", "COMMENT", "LINE_COMMENT", "INCLUDE", "DEFINE"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GrammarParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(INTEGER);
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

	public static class FloatingContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public FloatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating; }
	}

	public final FloatingContext floating() throws RecognitionException {
		FloatingContext _localctx = new FloatingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_floating);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(FLOAT);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(STRING);
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

	public static class Function_callContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				identifier();
				{
				setState(55);
				match(T__2);
				setState(56);
				expression(0);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(57);
					match(T__3);
					setState(58);
					expression(0);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(T__4);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__2);
				setState(67);
				match(T__4);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(70);
				match(T__2);
				setState(71);
				type();
				setState(72);
				identifier();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(73);
					match(T__3);
					setState(74);
					type();
					setState(75);
					identifier();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(T__4);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__2);
				setState(85);
				match(T__4);
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

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__5);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__21) | (1L << T__23) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__6);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__5:
			case T__7:
			case T__11:
			case T__12:
			case INTEGER:
			case FLOAT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(97);
					match(T__7);
					setState(98);
					expression(0);
					}
					break;
				case 2:
					{
					setState(99);
					variable_definition();
					}
					break;
				case 3:
					{
					setState(100);
					variable_assignment();
					}
					break;
				case 4:
					{
					setState(101);
					expression(0);
					}
					break;
				}
				setState(104);
				match(T__8);
				}
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				if_statement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				for_loop();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatingContext floating() {
			return getRuleContext(FloatingContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(111);
				match(T__2);
				setState(112);
				expression(0);
				setState(113);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(115);
				function_call();
				}
				break;
			case 3:
				{
				setState(116);
				identifier();
				}
				break;
			case 4:
				{
				setState(117);
				integer();
				}
				break;
			case 5:
				{
				setState(118);
				floating();
				}
				break;
			case 6:
				{
				setState(119);
				string();
				}
				break;
			case 7:
				{
				setState(120);
				array();
				}
				break;
			case 8:
				{
				setState(121);
				array_literal();
				}
				break;
			case 9:
				{
				{
				setState(122);
				match(T__12);
				}
				setState(123);
				expression(2);
				}
				break;
			case 10:
				{
				{
				setState(124);
				match(T__11);
				}
				setState(125);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(129);
						match(T__9);
						setState(130);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(132);
						match(T__10);
						setState(133);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(135);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(136);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						{
						setState(138);
						match(T__13);
						}
						setState(139);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(141);
						match(T__14);
						}
						setState(142);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						{
						setState(144);
						match(T__15);
						}
						setState(145);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						{
						setState(147);
						match(T__16);
						}
						setState(148);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(150);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			identifier();
			setState(162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(158);
					match(T__19);
					setState(159);
					expression(0);
					setState(160);
					match(T__20);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Array_literalContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__5);
			setState(167);
			expression(0);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(168);
				match(T__3);
				setState(169);
				expression(0);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__6);
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

	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__21);
				setState(178);
				match(T__2);
				setState(179);
				expression(0);
				setState(180);
				match(T__4);
				setState(181);
				body();
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(182);
					else_statement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__21);
				setState(186);
				match(T__2);
				setState(187);
				expression(0);
				setState(188);
				match(T__4);
				setState(189);
				statement();
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(190);
					else_statement();
					}
					break;
				}
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

	public static class Else_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else_statement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__22);
				setState(196);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__22);
				setState(198);
				body();
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

	public static class For_loopContext extends ParserRuleContext {
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public For_conditionContext for_condition() {
			return getRuleContext(For_conditionContext.class,0);
		}
		public For_stepContext for_step() {
			return getRuleContext(For_stepContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__23);
			setState(202);
			match(T__2);
			setState(203);
			for_initializer();
			setState(204);
			match(T__8);
			setState(205);
			for_condition();
			setState(206);
			match(T__8);
			setState(207);
			for_step();
			setState(208);
			match(T__4);
			setState(209);
			body();
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

	public static class For_initializerContext extends ParserRuleContext {
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_initializer);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				variable_definition();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				variable_assignment();
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

	public static class For_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condition; }
	}

	public final For_conditionContext for_condition() throws RecognitionException {
		For_conditionContext _localctx = new For_conditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			expression(0);
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

	public static class For_stepContext extends ParserRuleContext {
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public For_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_step; }
	}

	public final For_stepContext for_step() throws RecognitionException {
		For_stepContext _localctx = new For_stepContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			variable_assignment();
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

	public static class FileContext extends ParserRuleContext {
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(219);
					variable_definition();
					setState(220);
					match(T__8);
					}
					break;
				case 2:
					{
					setState(222);
					function_definition();
					}
					break;
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__1 );
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

	public static class Variable_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable_definition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			type();
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(228);
				identifier();
				}
				break;
			case 2:
				{
				setState(229);
				array();
				}
				break;
			}
			setState(232);
			match(T__24);
			setState(233);
			expression(0);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(234);
					match(T__3);
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(235);
						identifier();
						}
						break;
					case 2:
						{
						setState(236);
						array();
						}
						break;
					}
					setState(239);
					match(T__24);
					setState(240);
					expression(0);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Variable_assignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable_assignment);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(247);
					identifier();
					}
					break;
				case 2:
					{
					setState(248);
					array();
					}
					break;
				}
				setState(251);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				identifier();
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Function_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			type();
			setState(260);
			identifier();
			setState(261);
			arguments();
			setState(262);
			body();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\7\3"+
		"\7\3\7\3\7\5\7G\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\bS\13"+
		"\b\3\b\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\ni\n\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009b\n\13"+
		"\f\13\16\13\u009e\13\13\3\f\3\f\3\f\3\f\3\f\6\f\u00a5\n\f\r\f\16\f\u00a6"+
		"\3\r\3\r\3\r\3\r\7\r\u00ad\n\r\f\r\16\r\u00b0\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00c2\n\16\5\16\u00c4\n\16\3\17\3\17\3\17\3\17\5\17\u00ca\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00d8\n\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\6\24\u00e2\n\24\r\24\16\24\u00e3"+
		"\3\25\3\25\3\25\5\25\u00e9\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f0\n"+
		"\25\3\25\3\25\3\25\7\25\u00f5\n\25\f\25\16\25\u00f8\13\25\3\26\3\26\5"+
		"\26\u00fc\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0104\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\u00f6\3\24\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\7\3\2\3\4\3\2\16\17\3\2\24\25\3\2\33\36\3\2\37 \2\u011d"+
		"\2.\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\fF\3\2"+
		"\2\2\16X\3\2\2\2\20Z\3\2\2\2\22n\3\2\2\2\24\u0080\3\2\2\2\26\u009f\3\2"+
		"\2\2\30\u00a8\3\2\2\2\32\u00c3\3\2\2\2\34\u00c9\3\2\2\2\36\u00cb\3\2\2"+
		"\2 \u00d7\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00e1\3\2\2\2(\u00e5"+
		"\3\2\2\2*\u0103\3\2\2\2,\u0105\3\2\2\2./\t\2\2\2/\3\3\2\2\2\60\61\7$\2"+
		"\2\61\5\3\2\2\2\62\63\7!\2\2\63\7\3\2\2\2\64\65\7\"\2\2\65\t\3\2\2\2\66"+
		"\67\7#\2\2\67\13\3\2\2\289\5\4\3\29:\7\5\2\2:?\5\24\13\2;<\7\6\2\2<>\5"+
		"\24\13\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2B"+
		"C\7\7\2\2CG\3\2\2\2DE\7\5\2\2EG\7\7\2\2F8\3\2\2\2FD\3\2\2\2G\r\3\2\2\2"+
		"HI\7\5\2\2IJ\5\2\2\2JQ\5\4\3\2KL\7\6\2\2LM\5\2\2\2MN\5\4\3\2NP\3\2\2\2"+
		"OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\7\2\2"+
		"UY\3\2\2\2VW\7\5\2\2WY\7\7\2\2XH\3\2\2\2XV\3\2\2\2Y\17\3\2\2\2Z^\7\b\2"+
		"\2[]\5\22\n\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3"+
		"\2\2\2ab\7\t\2\2b\21\3\2\2\2cd\7\n\2\2di\5\24\13\2ei\5(\25\2fi\5*\26\2"+
		"gi\5\24\13\2hc\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jk\7\13"+
		"\2\2ko\3\2\2\2lo\5\32\16\2mo\5\36\20\2nh\3\2\2\2nl\3\2\2\2nm\3\2\2\2o"+
		"\23\3\2\2\2pq\b\13\1\2qr\7\5\2\2rs\5\24\13\2st\7\7\2\2t\u0081\3\2\2\2"+
		"u\u0081\5\f\7\2v\u0081\5\4\3\2w\u0081\5\6\4\2x\u0081\5\b\5\2y\u0081\5"+
		"\n\6\2z\u0081\5\26\f\2{\u0081\5\30\r\2|}\7\17\2\2}\u0081\5\24\13\4~\177"+
		"\7\16\2\2\177\u0081\5\24\13\3\u0080p\3\2\2\2\u0080u\3\2\2\2\u0080v\3\2"+
		"\2\2\u0080w\3\2\2\2\u0080x\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080"+
		"{\3\2\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081\u009c\3\2\2\2\u0082\u0083"+
		"\f\23\2\2\u0083\u0084\7\f\2\2\u0084\u009b\5\24\13\24\u0085\u0086\f\22"+
		"\2\2\u0086\u0087\7\r\2\2\u0087\u009b\5\24\13\23\u0088\u0089\f\21\2\2\u0089"+
		"\u008a\t\3\2\2\u008a\u009b\5\24\13\22\u008b\u008c\f\20\2\2\u008c\u008d"+
		"\7\20\2\2\u008d\u009b\5\24\13\21\u008e\u008f\f\17\2\2\u008f\u0090\7\21"+
		"\2\2\u0090\u009b\5\24\13\20\u0091\u0092\f\16\2\2\u0092\u0093\7\22\2\2"+
		"\u0093\u009b\5\24\13\17\u0094\u0095\f\r\2\2\u0095\u0096\7\23\2\2\u0096"+
		"\u009b\5\24\13\16\u0097\u0098\f\f\2\2\u0098\u0099\t\4\2\2\u0099\u009b"+
		"\5\24\13\r\u009a\u0082\3\2\2\2\u009a\u0085\3\2\2\2\u009a\u0088\3\2\2\2"+
		"\u009a\u008b\3\2\2\2\u009a\u008e\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0094"+
		"\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a4\5\4\3"+
		"\2\u00a0\u00a1\7\26\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00a3\7\27\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00ae"+
		"\5\24\13\2\u00aa\u00ab\7\6\2\2\u00ab\u00ad\5\24\13\2\u00ac\u00aa\3\2\2"+
		"\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\t\2\2\u00b2\31\3\2\2\2\u00b3"+
		"\u00b4\7\30\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7"+
		"\7\7\2\2\u00b7\u00b9\5\20\t\2\u00b8\u00ba\5\34\17\2\u00b9\u00b8\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba\u00c4\3\2\2\2\u00bb\u00bc\7\30\2\2\u00bc"+
		"\u00bd\7\5\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf\7\7\2\2\u00bf\u00c1\5"+
		"\22\n\2\u00c0\u00c2\5\34\17\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c4\3\2\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c4\33"+
		"\3\2\2\2\u00c5\u00c6\7\31\2\2\u00c6\u00ca\5\22\n\2\u00c7\u00c8\7\31\2"+
		"\2\u00c8\u00ca\5\20\t\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\35\3\2\2\2\u00cb\u00cc\7\32\2\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\5 \21"+
		"\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\7\13\2\2\u00d1"+
		"\u00d2\5$\23\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\5\20\t\2\u00d4\37\3\2\2"+
		"\2\u00d5\u00d8\5(\25\2\u00d6\u00d8\5*\26\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00da\5\24\13\2\u00da#\3\2\2\2\u00db\u00dc"+
		"\5*\26\2\u00dc%\3\2\2\2\u00dd\u00de\5(\25\2\u00de\u00df\7\13\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00e2\5,\27\2\u00e1\u00dd\3\2\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\'\3\2\2\2\u00e5\u00e8\5\2\2\2\u00e6\u00e9\5\4\3\2\u00e7\u00e9\5\26\f"+
		"\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\7\33\2\2\u00eb\u00f6\5\24\13\2\u00ec\u00ef\7\6\2\2\u00ed\u00f0\5\4\3"+
		"\2\u00ee\u00f0\5\26\f\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\7\33\2\2\u00f2\u00f3\5\24\13\2\u00f3\u00f5"+
		"\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7)\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\5\4\3\2"+
		"\u00fa\u00fc\5\26\f\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\t\5\2\2\u00fe\u00ff\5\24\13\2\u00ff\u0104\3\2\2\2"+
		"\u0100\u0101\5\4\3\2\u0101\u0102\t\6\2\2\u0102\u0104\3\2\2\2\u0103\u00fb"+
		"\3\2\2\2\u0103\u0100\3\2\2\2\u0104+\3\2\2\2\u0105\u0106\5\2\2\2\u0106"+
		"\u0107\5\4\3\2\u0107\u0108\5\16\b\2\u0108\u0109\5\20\t\2\u0109-\3\2\2"+
		"\2\32?FQX^hn\u0080\u009a\u009c\u00a6\u00ae\u00b9\u00c1\u00c3\u00c9\u00d7"+
		"\u00e1\u00e3\u00e8\u00ef\u00f6\u00fb\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}