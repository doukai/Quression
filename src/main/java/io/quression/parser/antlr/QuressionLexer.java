// Generated from Quression.g4 by ANTLR 4.9

    package io.quression.parser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFICATION_VARIABLE=7, 
		STRING=8, NUMBER=9, ENUM=10, BOOLEAN=11, NULL=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IDENTIFICATION_VARIABLE", 
			"STRING", "NUMBER", "ENUM", "BOOLEAN", "NULL", "ESC", "UNICODE", "HEX", 
			"SAFECODEPOINT", "INT", "EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'''", "'$'", "'.'", null, null, null, null, 
			null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENTIFICATION_VARIABLE", 
			"STRING", "NUMBER", "ENUM", "BOOLEAN", "NULL", "WS"
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


	public QuressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Quression.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\7\b8\n\b\f\b\16\b;\13\b\3\t\3\t\3\t\7\t@\n\t\f\t\16\tC\13"+
		"\t\3\t\3\t\3\n\5\nH\n\n\3\n\3\n\3\n\6\nM\n\n\r\n\16\nN\5\nQ\n\n\3\n\5"+
		"\nT\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fc\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16m\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22|\n\22\f\22\16\22\177"+
		"\13\22\5\22\u0081\n\22\3\23\3\23\5\23\u0085\n\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\2\35\2\37\2!\2#\2%\2\'\17\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2\62"+
		";\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\3\2\63;\4\2GGgg\4\2-"+
		"-//\5\2\13\f\17\17\"\"\2\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3"+
		"\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2"+
		"\21<\3\2\2\2\23G\3\2\2\2\25U\3\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33i\3\2\2"+
		"\2\35n\3\2\2\2\37t\3\2\2\2!v\3\2\2\2#\u0080\3\2\2\2%\u0082\3\2\2\2\'\u0088"+
		"\3\2\2\2)*\7*\2\2*\4\3\2\2\2+,\7+\2\2,\6\3\2\2\2-.\7.\2\2.\b\3\2\2\2/"+
		"\60\7)\2\2\60\n\3\2\2\2\61\62\7&\2\2\62\f\3\2\2\2\63\64\7\60\2\2\64\16"+
		"\3\2\2\2\659\t\2\2\2\668\t\3\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29"+
		":\3\2\2\2:\20\3\2\2\2;9\3\2\2\2<A\7$\2\2=@\5\33\16\2>@\5!\21\2?=\3\2\2"+
		"\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7$\2"+
		"\2E\22\3\2\2\2FH\7/\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IP\5#\22\2JL\7\60"+
		"\2\2KM\t\4\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2"+
		"\2\2PQ\3\2\2\2QS\3\2\2\2RT\5%\23\2SR\3\2\2\2ST\3\2\2\2T\24\3\2\2\2UV\5"+
		"\17\b\2VW\7\60\2\2WX\5\17\b\2X\26\3\2\2\2YZ\7v\2\2Z[\7t\2\2[\\\7w\2\2"+
		"\\c\7g\2\2]^\7h\2\2^_\7c\2\2_`\7n\2\2`a\7u\2\2ac\7g\2\2bY\3\2\2\2b]\3"+
		"\2\2\2c\30\3\2\2\2de\7p\2\2ef\7w\2\2fg\7n\2\2gh\7n\2\2h\32\3\2\2\2il\7"+
		"^\2\2jm\t\5\2\2km\5\35\17\2lj\3\2\2\2lk\3\2\2\2m\34\3\2\2\2no\7w\2\2o"+
		"p\5\37\20\2pq\5\37\20\2qr\5\37\20\2rs\5\37\20\2s\36\3\2\2\2tu\t\6\2\2"+
		"u \3\2\2\2vw\n\7\2\2w\"\3\2\2\2x\u0081\7\62\2\2y}\t\b\2\2z|\t\4\2\2{z"+
		"\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2"+
		"\u0080x\3\2\2\2\u0080y\3\2\2\2\u0081$\3\2\2\2\u0082\u0084\t\t\2\2\u0083"+
		"\u0085\t\n\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\5#\22\2\u0087&\3\2\2\2\u0088\u0089\t\13\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\b\24\2\2\u008b(\3\2\2\2\17\29?AGNPSbl}\u0080\u0084"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}