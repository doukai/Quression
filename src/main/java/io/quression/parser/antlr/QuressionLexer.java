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
		T__0=1, T__1=2, T__2=3, IDENTIFICATION_VARIABLE=4, ITEM_SEPARATOR=5, ATTRIBUTE_SEPARATOR=6, 
		STRING=7, NUMBER=8, BOOLEAN=9, TRUE=10, FALSE=11, NULL=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "IDENTIFICATION_VARIABLE", "ITEM_SEPARATOR", 
			"ATTRIBUTE_SEPARATOR", "STRING", "NUMBER", "BOOLEAN", "TRUE", "FALSE", 
			"NULL", "ESC", "UNICODE", "HEX", "SAFECODEPOINT", "INT", "EXP", "WS"
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
			"ATTRIBUTE_SEPARATOR", "STRING", "NUMBER", "BOOLEAN", "TRUE", "FALSE", 
			"NULL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5\62\n\5\f"+
		"\5\16\5\65\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b\3"+
		"\b\3\b\3\t\5\tF\n\t\3\t\3\t\3\t\6\tK\n\t\r\t\16\tL\5\tO\n\t\3\t\5\tR\n"+
		"\t\3\n\3\n\5\nV\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13^\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\fg\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rp\n\r\3\16"+
		"\3\16\3\16\5\16u\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\7\22\u0084\n\22\f\22\16\22\u0087\13\22\5\22\u0089\n\22"+
		"\3\23\3\23\5\23\u008d\n\23\3\23\3\23\3\24\3\24\3\24\3\24\2\2\25\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2"+
		"#\2%\2\'\17\3\2\r\5\2C\\aac|\6\2\62;C\\aac|\4\2\"\"..\3\2\62;\n\2$$\61"+
		"\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\3\2\63;\4\2GGgg\4\2--//\5\2\13"+
		"\f\17\17\"\"\2\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-"+
		"\3\2\2\2\t/\3\2\2\2\13\66\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21E\3\2\2\2\23"+
		"U\3\2\2\2\25]\3\2\2\2\27f\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35v\3\2\2\2"+
		"\37|\3\2\2\2!~\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u0090\3\2\2\2)"+
		"*\7*\2\2*\4\3\2\2\2+,\7+\2\2,\6\3\2\2\2-.\7)\2\2.\b\3\2\2\2/\63\t\2\2"+
		"\2\60\62\t\3\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\n\3\2\2\2\65\63\3\2\2\2\66\67\t\4\2\2\67\f\3\2\2\289\4/\60\29\16"+
		"\3\2\2\2:?\7$\2\2;>\5\33\16\2<>\5!\21\2=;\3\2\2\2=<\3\2\2\2>A\3\2\2\2"+
		"?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7$\2\2C\20\3\2\2\2DF\7/\2\2"+
		"ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GN\5#\22\2HJ\7\60\2\2IK\t\5\2\2JI\3\2\2"+
		"\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NH\3\2\2\2NO\3\2\2\2OQ\3\2\2"+
		"\2PR\5%\23\2QP\3\2\2\2QR\3\2\2\2R\22\3\2\2\2SV\5\25\13\2TV\5\27\f\2US"+
		"\3\2\2\2UT\3\2\2\2V\24\3\2\2\2WX\7%\2\2X^\7v\2\2YZ\7v\2\2Z[\7t\2\2[\\"+
		"\7w\2\2\\^\7g\2\2]W\3\2\2\2]Y\3\2\2\2^\26\3\2\2\2_`\7%\2\2`g\7h\2\2ab"+
		"\7h\2\2bc\7c\2\2cd\7n\2\2de\7u\2\2eg\7g\2\2f_\3\2\2\2fa\3\2\2\2g\30\3"+
		"\2\2\2hi\7)\2\2ij\7*\2\2jp\7+\2\2kl\7p\2\2lm\7w\2\2mn\7n\2\2np\7n\2\2"+
		"oh\3\2\2\2ok\3\2\2\2p\32\3\2\2\2qt\7^\2\2ru\t\6\2\2su\5\35\17\2tr\3\2"+
		"\2\2ts\3\2\2\2u\34\3\2\2\2vw\7w\2\2wx\5\37\20\2xy\5\37\20\2yz\5\37\20"+
		"\2z{\5\37\20\2{\36\3\2\2\2|}\t\7\2\2} \3\2\2\2~\177\n\b\2\2\177\"\3\2"+
		"\2\2\u0080\u0089\7\62\2\2\u0081\u0085\t\t\2\2\u0082\u0084\t\5\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0080\3\2\2\2\u0088"+
		"\u0081\3\2\2\2\u0089$\3\2\2\2\u008a\u008c\t\n\2\2\u008b\u008d\t\13\2\2"+
		"\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\5#\22\2\u008f&\3\2\2\2\u0090\u0091\t\f\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\b\24\2\2\u0093(\3\2\2\2\22\2\63=?ELNQU]fot\u0085\u0088\u008c\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}