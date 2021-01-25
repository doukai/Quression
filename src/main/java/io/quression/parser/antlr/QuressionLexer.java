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
		T__0=1, T__1=2, T__2=3, IDENTIFICATION_VARIABLE=4, ITEM_SEPARATOR=5, STRING=6, 
		NUMBER=7, BOOLEAN=8, TRUE=9, FALSE=10, NULL=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "IDENTIFICATION_VARIABLE", "ITEM_SEPARATOR", 
			"STRING", "NUMBER", "BOOLEAN", "TRUE", "FALSE", "NULL", "ESC", "UNICODE", 
			"HEX", "SAFECODEPOINT", "INT", "EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IDENTIFICATION_VARIABLE", "ITEM_SEPARATOR", 
			"STRING", "NUMBER", "BOOLEAN", "TRUE", "FALSE", "NULL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5\60\n\5\f\5\16\5\63"+
		"\13\5\3\6\3\6\3\7\3\7\3\7\7\7:\n\7\f\7\16\7=\13\7\3\7\3\7\3\b\5\bB\n\b"+
		"\3\b\3\b\3\b\6\bG\n\b\r\b\16\bH\5\bK\n\b\3\b\5\bN\n\b\3\t\3\t\5\tR\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\nZ\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13c\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\5\rq\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u0080"+
		"\n\21\f\21\16\21\u0083\13\21\5\21\u0085\n\21\3\22\3\22\5\22\u0089\n\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\2\33\2\35\2\37\2!\2#\2%\16\3\2\r\5\2C\\aac|\6\2"+
		"\62;C\\aac|\4\2\"\"..\3\2\62;\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2"+
		"\2!$$^^\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\2\u0098\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2%\3\2\2\2\3"+
		"\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2"+
		"\17A\3\2\2\2\21Q\3\2\2\2\23Y\3\2\2\2\25b\3\2\2\2\27k\3\2\2\2\31m\3\2\2"+
		"\2\33r\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%"+
		"\u008c\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7+\2\2*\6\3\2\2\2+,\7)\2\2,\b\3"+
		"\2\2\2-\61\t\2\2\2.\60\t\3\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\n\3\2\2\2\63\61\3\2\2\2\64\65\t\4\2\2\65\f\3\2\2\2\66;"+
		"\7$\2\2\67:\5\31\r\28:\5\37\20\29\67\3\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7$\2\2?\16\3\2\2\2@B\7/\2\2A@\3\2"+
		"\2\2AB\3\2\2\2BC\3\2\2\2CJ\5!\21\2DF\7\60\2\2EG\t\5\2\2FE\3\2\2\2GH\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JD\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5"+
		"#\22\2ML\3\2\2\2MN\3\2\2\2N\20\3\2\2\2OR\5\23\n\2PR\5\25\13\2QO\3\2\2"+
		"\2QP\3\2\2\2R\22\3\2\2\2ST\7%\2\2TZ\7v\2\2UV\7v\2\2VW\7t\2\2WX\7w\2\2"+
		"XZ\7g\2\2YS\3\2\2\2YU\3\2\2\2Z\24\3\2\2\2[\\\7%\2\2\\c\7h\2\2]^\7h\2\2"+
		"^_\7c\2\2_`\7n\2\2`a\7u\2\2ac\7g\2\2b[\3\2\2\2b]\3\2\2\2c\26\3\2\2\2d"+
		"e\7)\2\2ef\7*\2\2fl\7+\2\2gh\7p\2\2hi\7w\2\2ij\7n\2\2jl\7n\2\2kd\3\2\2"+
		"\2kg\3\2\2\2l\30\3\2\2\2mp\7^\2\2nq\t\6\2\2oq\5\33\16\2pn\3\2\2\2po\3"+
		"\2\2\2q\32\3\2\2\2rs\7w\2\2st\5\35\17\2tu\5\35\17\2uv\5\35\17\2vw\5\35"+
		"\17\2w\34\3\2\2\2xy\t\7\2\2y\36\3\2\2\2z{\n\b\2\2{ \3\2\2\2|\u0085\7\62"+
		"\2\2}\u0081\t\t\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0085\"\3\2\2\2\u0086\u0088\t\n\2\2\u0087"+
		"\u0089\t\13\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u008b\5!\21\2\u008b$\3\2\2\2\u008c\u008d\t\f\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\b\23\2\2\u008f&\3\2\2\2\22\2\619;AHJMQYbkp\u0081"+
		"\u0084\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}