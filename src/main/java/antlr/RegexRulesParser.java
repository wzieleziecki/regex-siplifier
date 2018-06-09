// Generated from /home/tk/IdeaProjects/regex-simplifier/RegexRules.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegexRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, LETTER=3, LEFT_BRACKET=4, RIGHT_BRACKET=5, LEFT_PARENTHESE=6, 
		RIGHT_PARENTHESE=7, STAR=8, EMPTY=9, DOT=10, DASH=11, CARET=12, END=13, 
		LEFT_BRACE=14, RIGHT_BRACE=15, COMMA=16, NUMBER=17, LAST_TOKEN=18, PLUS=19, 
		QUESTION_MARK=20, ALTERNATIVE=21;
	public static final int
		RULE_prog = 0, RULE_parentheseExpression = 1, RULE_alternativeExpression = 2, 
		RULE_matchCountExpression = 3, RULE_rangeOccurence = 4, RULE_bracketExpression = 5, 
		RULE_range = 6, RULE_basicExpression = 7;
	public static final String[] ruleNames = {
		"prog", "parentheseExpression", "alternativeExpression", "matchCountExpression", 
		"rangeOccurence", "bracketExpression", "range", "basicExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'['", "']'", "'('", "')'", "'*'", "'@'", "'.'", 
		"'-'", "'^'", "'$'", "'{'", "'}'", "','", null, null, "'+'", "'?'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "LETTER", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"LEFT_PARENTHESE", "RIGHT_PARENTHESE", "STAR", "EMPTY", "DOT", "DASH", 
		"CARET", "END", "LEFT_BRACE", "RIGHT_BRACE", "COMMA", "NUMBER", "LAST_TOKEN", 
		"PLUS", "QUESTION_MARK", "ALTERNATIVE"
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
	public String getGrammarFileName() { return "RegexRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegexRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(RegexRulesParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RegexRulesParser.NEWLINE, i);
		}
		public List<BasicExpressionContext> basicExpression() {
			return getRuleContexts(BasicExpressionContext.class);
		}
		public BasicExpressionContext basicExpression(int i) {
			return getRuleContext(BasicExpressionContext.class,i);
		}
		public List<AlternativeExpressionContext> alternativeExpression() {
			return getRuleContexts(AlternativeExpressionContext.class);
		}
		public AlternativeExpressionContext alternativeExpression(int i) {
			return getRuleContext(AlternativeExpressionContext.class,i);
		}
		public List<ParentheseExpressionContext> parentheseExpression() {
			return getRuleContexts(ParentheseExpressionContext.class);
		}
		public ParentheseExpressionContext parentheseExpression(int i) {
			return getRuleContext(ParentheseExpressionContext.class,i);
		}
		public List<BracketExpressionContext> bracketExpression() {
			return getRuleContexts(BracketExpressionContext.class);
		}
		public BracketExpressionContext bracketExpression(int i) {
			return getRuleContext(BracketExpressionContext.class,i);
		}
		public List<MatchCountExpressionContext> matchCountExpression() {
			return getRuleContexts(MatchCountExpressionContext.class);
		}
		public MatchCountExpressionContext matchCountExpression(int i) {
			return getRuleContext(MatchCountExpressionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexRulesVisitor ) return ((RegexRulesVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(21); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(21);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
						case 1:
							{
							setState(16);
							basicExpression();
							}
							break;
						case 2:
							{
							setState(17);
							alternativeExpression(0);
							}
							break;
						case 3:
							{
							setState(18);
							parentheseExpression();
							}
							break;
						case 4:
							{
							setState(19);
							bracketExpression();
							}
							break;
						case 5:
							{
							setState(20);
							matchCountExpression();
							}
							break;
						}
						}
						setState(23); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << LEFT_BRACKET) | (1L << LEFT_PARENTHESE) | (1L << DOT))) != 0) );
					setState(25);
					match(NEWLINE);
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << LEFT_BRACKET) | (1L << LEFT_PARENTHESE) | (1L << DOT))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					alternativeExpression(0);
					setState(32);
					match(NEWLINE);
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << LEFT_BRACKET) | (1L << LEFT_PARENTHESE) | (1L << DOT))) != 0) );
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

	public static class ParentheseExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESE() { return getToken(RegexRulesParser.LEFT_PARENTHESE, 0); }
		public TerminalNode RIGHT_PARENTHESE() { return getToken(RegexRulesParser.RIGHT_PARENTHESE, 0); }
		public List<ParentheseExpressionContext> parentheseExpression() {
			return getRuleContexts(ParentheseExpressionContext.class);
		}
		public ParentheseExpressionContext parentheseExpression(int i) {
			return getRuleContext(ParentheseExpressionContext.class,i);
		}
		public List<BracketExpressionContext> bracketExpression() {
			return getRuleContexts(BracketExpressionContext.class);
		}
		public BracketExpressionContext bracketExpression(int i) {
			return getRuleContext(BracketExpressionContext.class,i);
		}
		public List<MatchCountExpressionContext> matchCountExpression() {
			return getRuleContexts(MatchCountExpressionContext.class);
		}
		public MatchCountExpressionContext matchCountExpression(int i) {
			return getRuleContext(MatchCountExpressionContext.class,i);
		}
		public List<BasicExpressionContext> basicExpression() {
			return getRuleContexts(BasicExpressionContext.class);
		}
		public BasicExpressionContext basicExpression(int i) {
			return getRuleContext(BasicExpressionContext.class,i);
		}
		public TerminalNode LAST_TOKEN() { return getToken(RegexRulesParser.LAST_TOKEN, 0); }
		public AlternativeExpressionContext alternativeExpression() {
			return getRuleContext(AlternativeExpressionContext.class,0);
		}
		public ParentheseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).enterParentheseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).exitParentheseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexRulesVisitor ) return ((RegexRulesVisitor<? extends T>)visitor).visitParentheseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentheseExpressionContext parentheseExpression() throws RecognitionException {
		ParentheseExpressionContext _localctx = new ParentheseExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parentheseExpression);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(LEFT_PARENTHESE);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(41);
						parentheseExpression();
						}
						break;
					case 2:
						{
						setState(42);
						bracketExpression();
						}
						break;
					case 3:
						{
						setState(43);
						matchCountExpression();
						}
						break;
					case 4:
						{
						setState(44);
						basicExpression();
						}
						break;
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << LEFT_BRACKET) | (1L << LEFT_PARENTHESE) | (1L << DOT))) != 0) );
				setState(49);
				match(RIGHT_PARENTHESE);
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(50);
					match(LAST_TOKEN);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(LEFT_PARENTHESE);
				{
				setState(54);
				alternativeExpression(0);
				}
				setState(55);
				match(RIGHT_PARENTHESE);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(56);
					match(LAST_TOKEN);
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

	public static class AlternativeExpressionContext extends ParserRuleContext {
		public TerminalNode ALTERNATIVE() { return getToken(RegexRulesParser.ALTERNATIVE, 0); }
		public List<ParentheseExpressionContext> parentheseExpression() {
			return getRuleContexts(ParentheseExpressionContext.class);
		}
		public ParentheseExpressionContext parentheseExpression(int i) {
			return getRuleContext(ParentheseExpressionContext.class,i);
		}
		public List<BasicExpressionContext> basicExpression() {
			return getRuleContexts(BasicExpressionContext.class);
		}
		public BasicExpressionContext basicExpression(int i) {
			return getRuleContext(BasicExpressionContext.class,i);
		}
		public List<MatchCountExpressionContext> matchCountExpression() {
			return getRuleContexts(MatchCountExpressionContext.class);
		}
		public MatchCountExpressionContext matchCountExpression(int i) {
			return getRuleContext(MatchCountExpressionContext.class,i);
		}
		public List<BracketExpressionContext> bracketExpression() {
			return getRuleContexts(BracketExpressionContext.class);
		}
		public BracketExpressionContext bracketExpression(int i) {
			return getRuleContext(BracketExpressionContext.class,i);
		}
		public AlternativeExpressionContext alternativeExpression() {
			return getRuleContext(AlternativeExpressionContext.class,0);
		}
		public AlternativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).enterAlternativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).exitAlternativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexRulesVisitor ) return ((RegexRulesVisitor<? extends T>)visitor).visitAlternativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeExpressionContext alternativeExpression() throws RecognitionException {
		return alternativeExpression(0);
	}

	private AlternativeExpressionContext alternativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AlternativeExpressionContext _localctx = new AlternativeExpressionContext(_ctx, _parentState);
		AlternativeExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_alternativeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(62);
					parentheseExpression();
					}
					break;
				case 2:
					{
					setState(63);
					basicExpression();
					}
					break;
				case 3:
					{
					setState(64);
					matchCountExpression();
					}
					break;
				case 4:
					{
					setState(65);
					bracketExpression();
					}
					break;
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << LEFT_BRACKET) | (1L << LEFT_PARENTHESE) | (1L << DOT))) != 0) );
			setState(70);
			match(ALTERNATIVE);
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(71);
						parentheseExpression();
						}
						break;
					case 2:
						{
						setState(72);
						basicExpression();
						}
						break;
					case 3:
						{
						setState(73);
						matchCountExpression();
						}
						break;
					case 4:
						{
						setState(74);
						bracketExpression();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AlternativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_alternativeExpression);
					setState(79);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(80);
					match(ALTERNATIVE);
					setState(85); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(85);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
							case 1:
								{
								setState(81);
								parentheseExpression();
								}
								break;
							case 2:
								{
								setState(82);
								basicExpression();
								}
								break;
							case 3:
								{
								setState(83);
								matchCountExpression();
								}
								break;
							case 4:
								{
								setState(84);
								bracketExpression();
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(87); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class MatchCountExpressionContext extends ParserRuleContext {
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public RangeOccurenceContext rangeOccurence() {
			return getRuleContext(RangeOccurenceContext.class,0);
		}
		public BracketExpressionContext bracketExpression() {
			return getRuleContext(BracketExpressionContext.class,0);
		}
		public ParentheseExpressionContext parentheseExpression() {
			return getRuleContext(ParentheseExpressionContext.class,0);
		}
		public MatchCountExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCountExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).enterMatchCountExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).exitMatchCountExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexRulesVisitor ) return ((RegexRulesVisitor<? extends T>)visitor).visitMatchCountExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchCountExpressionContext matchCountExpression() throws RecognitionException {
		MatchCountExpressionContext _localctx = new MatchCountExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_matchCountExpression);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				basicExpression();
				setState(95);
				rangeOccurence();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				bracketExpression();
				setState(98);
				rangeOccurence();
				}
				break;
			case LEFT_PARENTHESE:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				parentheseExpression();
				setState(101);
				rangeOccurence();
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

	public static class RangeOccurenceContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(RegexRulesParser.LEFT_BRACE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(RegexRulesParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(RegexRulesParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(RegexRulesParser.COMMA, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(RegexRulesParser.RIGHT_BRACE, 0); }
		public RangeOccurenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOccurence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).enterRangeOccurence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).exitRangeOccurence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexRulesVisitor ) return ((RegexRulesVisitor<? extends T>)visitor).visitRangeOccurence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeOccurenceContext rangeOccurence() throws RecognitionException {
		RangeOccurenceContext _localctx = new RangeOccurenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rangeOccurence);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(LEFT_BRACE);
				setState(106);
				match(NUMBER);
				setState(107);
				match(COMMA);
				setState(108);
				match(NUMBER);
				setState(109);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(LEFT_BRACE);
				setState(111);
				match(NUMBER);
				setState(112);
				match(COMMA);
				setState(113);
				match(RIGHT_BRACE);
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

	public static class BracketExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(RegexRulesParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(RegexRulesParser.RIGHT_BRACKET, 0); }
		public TerminalNode CARET() { return getToken(RegexRulesParser.CARET, 0); }
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<MatchCountExpressionContext> matchCountExpression() {
			return getRuleContexts(MatchCountExpressionContext.class);
		}
		public MatchCountExpressionContext matchCountExpression(int i) {
			return getRuleContext(MatchCountExpressionContext.class,i);
		}
		public List<BasicExpressionContext> basicExpression() {
			return getRuleContexts(BasicExpressionContext.class);
		}
		public BasicExpressionContext basicExpression(int i) {
			return getRuleContext(BasicExpressionContext.class,i);
		}
		public List<ParentheseExpressionContext> parentheseExpression() {
			return getRuleContexts(ParentheseExpressionContext.class);
		}
		public ParentheseExpressionContext parentheseExpression(int i) {
			return getRuleContext(ParentheseExpressionContext.class,i);
		}
		public List<BracketExpressionContext> bracketExpression() {
			return getRuleContexts(BracketExpressionContext.class);
		}
		public BracketExpressionContext bracketExpression(int i) {
			return getRuleContext(BracketExpressionContext.class,i);
		}
		public List<AlternativeExpressionContext> alternativeExpression() {
			return getRuleContexts(AlternativeExpressionContext.class);
		}
		public AlternativeExpressionContext alternativeExpression(int i) {
			return getRuleContext(AlternativeExpressionContext.class,i);
		}
		public TerminalNode LAST_TOKEN() { return getToken(RegexRulesParser.LAST_TOKEN, 0); }
		public BracketExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexRulesVisitor ) return ((RegexRulesVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketExpressionContext bracketExpression() throws RecognitionException {
		BracketExpressionContext _localctx = new BracketExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bracketExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(LEFT_BRACKET);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARET) {
				{
				setState(117);
				match(CARET);
				}
			}

			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(120);
					range();
					}
					break;
				case 2:
					{
					setState(121);
					matchCountExpression();
					}
					break;
				case 3:
					{
					setState(122);
					basicExpression();
					}
					break;
				case 4:
					{
					setState(123);
					parentheseExpression();
					}
					break;
				case 5:
					{
					setState(124);
					bracketExpression();
					}
					break;
				case 6:
					{
					setState(125);
					alternativeExpression(0);
					}
					break;
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << LEFT_BRACKET) | (1L << LEFT_PARENTHESE) | (1L << DOT))) != 0) );
			setState(130);
			match(RIGHT_BRACKET);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(131);
				match(LAST_TOKEN);
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

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(RegexRulesParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(RegexRulesParser.LETTER, i);
		}
		public TerminalNode DASH() { return getToken(RegexRulesParser.DASH, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexRulesVisitor ) return ((RegexRulesVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LETTER);
			setState(135);
			match(DASH);
			setState(136);
			match(LETTER);
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

	public static class BasicExpressionContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(RegexRulesParser.LETTER, 0); }
		public TerminalNode LAST_TOKEN() { return getToken(RegexRulesParser.LAST_TOKEN, 0); }
		public TerminalNode DOT() { return getToken(RegexRulesParser.DOT, 0); }
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).enterBasicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexRulesListener ) ((RegexRulesListener)listener).exitBasicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexRulesVisitor ) return ((RegexRulesVisitor<? extends T>)visitor).visitBasicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicExpressionContext basicExpression() throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basicExpression);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(LETTER);
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(139);
					match(LAST_TOKEN);
					}
					break;
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(DOT);
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(143);
					match(LAST_TOKEN);
					}
					break;
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return alternativeExpression_sempred((AlternativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean alternativeExpression_sempred(AlternativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\2\3\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3"+
		"\2\6\2%\n\2\r\2\16\2&\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\6\3\60\n\3\r\3\16\3"+
		"\61\3\3\3\3\5\3\66\n\3\3\3\3\3\3\3\3\3\5\3<\n\3\5\3>\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\6\4E\n\4\r\4\16\4F\3\4\3\4\3\4\3\4\3\4\6\4N\n\4\r\4\16\4O\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\6\4X\n\4\r\4\16\4Y\7\4\\\n\4\f\4\16\4_\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6u\n\6\3\7\3\7\5\7y\n\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0081\n\7\r"+
		"\7\16\7\u0082\3\7\3\7\5\7\u0087\n\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u008f"+
		"\n\t\3\t\3\t\5\t\u0093\n\t\5\t\u0095\n\t\3\t\2\3\6\n\2\4\6\b\n\f\16\20"+
		"\2\2\2\u00b8\2(\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bi\3\2\2\2\nt\3\2\2\2\f"+
		"v\3\2\2\2\16\u0088\3\2\2\2\20\u0094\3\2\2\2\22\30\5\20\t\2\23\30\5\6\4"+
		"\2\24\30\5\4\3\2\25\30\5\f\7\2\26\30\5\b\5\2\27\22\3\2\2\2\27\23\3\2\2"+
		"\2\27\24\3\2\2\2\27\25\3\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2"+
		"\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7\4\2\2\34\36\3\2\2\2\35\27\3\2\2"+
		"\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 )\3\2\2\2!\"\5\6\4\2\"#\7\4"+
		"\2\2#%\3\2\2\2$!\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(\35"+
		"\3\2\2\2($\3\2\2\2)\3\3\2\2\2*/\7\b\2\2+\60\5\4\3\2,\60\5\f\7\2-\60\5"+
		"\b\5\2.\60\5\20\t\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\65\7\t\2\2\64\66\7\24"+
		"\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66>\3\2\2\2\678\7\b\2\289\5\6\4\29;\7"+
		"\t\2\2:<\7\24\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=*\3\2\2\2=\67\3\2\2\2"+
		">\5\3\2\2\2?D\b\4\1\2@E\5\4\3\2AE\5\20\t\2BE\5\b\5\2CE\5\f\7\2D@\3\2\2"+
		"\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2"+
		"\2HM\7\27\2\2IN\5\4\3\2JN\5\20\t\2KN\5\b\5\2LN\5\f\7\2MI\3\2\2\2MJ\3\2"+
		"\2\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P]\3\2\2\2QR\f\3"+
		"\2\2RW\7\27\2\2SX\5\4\3\2TX\5\20\t\2UX\5\b\5\2VX\5\f\7\2WS\3\2\2\2WT\3"+
		"\2\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Q"+
		"\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_]\3\2\2\2`a\5\20\t"+
		"\2ab\5\n\6\2bj\3\2\2\2cd\5\f\7\2de\5\n\6\2ej\3\2\2\2fg\5\4\3\2gh\5\n\6"+
		"\2hj\3\2\2\2i`\3\2\2\2ic\3\2\2\2if\3\2\2\2j\t\3\2\2\2kl\7\20\2\2lm\7\23"+
		"\2\2mn\7\22\2\2no\7\23\2\2ou\7\21\2\2pq\7\20\2\2qr\7\23\2\2rs\7\22\2\2"+
		"su\7\21\2\2tk\3\2\2\2tp\3\2\2\2u\13\3\2\2\2vx\7\6\2\2wy\7\16\2\2xw\3\2"+
		"\2\2xy\3\2\2\2y\u0080\3\2\2\2z\u0081\5\16\b\2{\u0081\5\b\5\2|\u0081\5"+
		"\20\t\2}\u0081\5\4\3\2~\u0081\5\f\7\2\177\u0081\5\6\4\2\u0080z\3\2\2\2"+
		"\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\7\7\2\2\u0085\u0087\7\24\2\2\u0086\u0085\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\r\3\2\2\2\u0088\u0089\7\5\2\2\u0089\u008a"+
		"\7\r\2\2\u008a\u008b\7\5\2\2\u008b\17\3\2\2\2\u008c\u008e\7\5\2\2\u008d"+
		"\u008f\7\24\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0095\3"+
		"\2\2\2\u0090\u0092\7\f\2\2\u0091\u0093\7\24\2\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0090\3\2"+
		"\2\2\u0095\21\3\2\2\2\34\27\31\37&(/\61\65;=DFMOWY]itx\u0080\u0082\u0086"+
		"\u008e\u0092\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}