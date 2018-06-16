package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegexRulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, LETTER=3, LEFT_BRACKET=4, RIGHT_BRACKET=5, LEFT_PARENTHESE=6, 
		RIGHT_PARENTHESE=7, STAR=8, EMPTY=9, DOT=10, DASH=11, CARET=12, END=13, 
		LEFT_BRACE=14, RIGHT_BRACE=15, COMMA=16, NUMBER=17, LAST_TOKEN=18, PLUS=19, 
		QUESTION_MARK=20, ALTERNATIVE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NEWLINE", "LETTER", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESE", 
		"RIGHT_PARENTHESE", "STAR", "EMPTY", "DOT", "DASH", "CARET", "END", "LEFT_BRACE", 
		"RIGHT_BRACE", "COMMA", "NUMBER", "LAST_TOKEN", "PLUS", "QUESTION_MARK", 
		"ALTERNATIVE"
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


	public RegexRulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegexRules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27g\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2/\n\2\r\2\16\2\60\3\2"+
		"\3\2\3\3\6\3\66\n\3\r\3\16\3\67\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\7\22X\n\22\f\22\16\22[\13\22\3\22\5\22^\n\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27\3\2\b\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2c|\3\2\63;\3\2\62"+
		";\4\2,-AA\2j\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3.\3\2\2"+
		"\2\5\65\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2"+
		"\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27I\3\2\2\2\31K\3\2\2\2\33M\3\2"+
		"\2\2\35O\3\2\2\2\37Q\3\2\2\2!S\3\2\2\2#]\3\2\2\2%_\3\2\2\2\'a\3\2\2\2"+
		")c\3\2\2\2+e\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\b\2\2\2\63\4\3\2\2\2\64\66\t\3\2\2\65\64"+
		"\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\6\3\2\2\29:\t\4\2\2"+
		":\b\3\2\2\2;<\7]\2\2<\n\3\2\2\2=>\7_\2\2>\f\3\2\2\2?@\7*\2\2@\16\3\2\2"+
		"\2AB\7+\2\2B\20\3\2\2\2CD\7,\2\2D\22\3\2\2\2EF\7B\2\2F\24\3\2\2\2GH\7"+
		"\60\2\2H\26\3\2\2\2IJ\7/\2\2J\30\3\2\2\2KL\7`\2\2L\32\3\2\2\2MN\7&\2\2"+
		"N\34\3\2\2\2OP\7}\2\2P\36\3\2\2\2QR\7\177\2\2R \3\2\2\2ST\7.\2\2T\"\3"+
		"\2\2\2UY\t\5\2\2VX\t\6\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z^\3"+
		"\2\2\2[Y\3\2\2\2\\^\7\62\2\2]U\3\2\2\2]\\\3\2\2\2^$\3\2\2\2_`\t\7\2\2"+
		"`&\3\2\2\2ab\7-\2\2b(\3\2\2\2cd\7A\2\2d*\3\2\2\2ef\7~\2\2f,\3\2\2\2\7"+
		"\2\60\67Y]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}