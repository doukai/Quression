// Generated from Quression.g4 by ANTLR 4.9

    package io.quression.parser.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFICATION_VARIABLE=7, 
		STRING=8, NUMBER=9, ENUM=10, BOOLEAN=11, NULL=12, WS=13;
	public static final int
		RULE_collection = 0, RULE_items = 1, RULE_function = 2, RULE_value = 3, 
		RULE_collectionValue = 4, RULE_variable = 5, RULE_constant = 6, RULE_functionName = 7, 
		RULE_field = 8, RULE_subfield = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"collection", "items", "function", "value", "collectionValue", "variable", 
			"constant", "functionName", "field", "subfield"
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

	@Override
	public String getGrammarFileName() { return "Quression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CollectionContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << IDENTIFICATION_VARIABLE) | (1L << STRING) | (1L << NUMBER) | (1L << ENUM) | (1L << BOOLEAN) | (1L << NULL))) != 0)) {
				{
				setState(21);
				items();
				}
			}

			setState(24);
			match(T__1);
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

	public static class ItemsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			value();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(27);
				match(T__2);
				setState(28);
				value();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			functionName();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(36);
				match(T__2);
				setState(37);
				value();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__1);
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

	public static class ValueContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public CollectionValueContext collectionValue() {
			return getRuleContext(CollectionValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				field();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				collectionValue();
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

	public static class CollectionValueContext extends ParserRuleContext {
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public CollectionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterCollectionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitCollectionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitCollectionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionValueContext collectionValue() throws RecognitionException {
		CollectionValueContext _localctx = new CollectionValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_collectionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__3);
			setState(53);
			collection();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(QuressionParser.IDENTIFICATION_VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(56);
			match(IDENTIFICATION_VARIABLE);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QuressionParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(QuressionParser.NUMBER, 0); }
		public TerminalNode ENUM() { return getToken(QuressionParser.ENUM, 0); }
		public TerminalNode BOOLEAN() { return getToken(QuressionParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(QuressionParser.NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << ENUM) | (1L << BOOLEAN) | (1L << NULL))) != 0)) ) {
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(QuressionParser.IDENTIFICATION_VARIABLE, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IDENTIFICATION_VARIABLE);
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(QuressionParser.IDENTIFICATION_VARIABLE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SubfieldContext subfield() {
			return getRuleContext(SubfieldContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(IDENTIFICATION_VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(IDENTIFICATION_VARIABLE);
				setState(65);
				match(T__5);
				setState(66);
				subfield();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				variable();
				setState(68);
				match(T__5);
				setState(69);
				subfield();
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

	public static class SubfieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(QuressionParser.IDENTIFICATION_VARIABLE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SubfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterSubfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitSubfield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitSubfield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubfieldContext subfield() throws RecognitionException {
		SubfieldContext _localctx = new SubfieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subfield);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(IDENTIFICATION_VARIABLE);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				variable();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\5\2\31\n\2\3\2\3\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4\3\4"+
		"\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\65\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\nJ\n\n\3\13\3\13\5\13N\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\3\3\2\n\16\2P\2\26\3\2\2\2\4\34\3\2\2\2\6$\3\2\2\2\b\64\3\2\2\2"+
		"\n\66\3\2\2\2\f9\3\2\2\2\16<\3\2\2\2\20>\3\2\2\2\22I\3\2\2\2\24M\3\2\2"+
		"\2\26\30\7\3\2\2\27\31\5\4\3\2\30\27\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2"+
		"\2\32\33\7\4\2\2\33\3\3\2\2\2\34!\5\b\5\2\35\36\7\5\2\2\36 \5\b\5\2\37"+
		"\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2\2\2$%\7"+
		"\3\2\2%*\5\20\t\2&\'\7\5\2\2\')\5\b\5\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2"+
		"*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\4\2\2.\7\3\2\2\2/\65\5\16\b\2\60\65"+
		"\5\f\7\2\61\65\5\6\4\2\62\65\5\22\n\2\63\65\5\n\6\2\64/\3\2\2\2\64\60"+
		"\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2\2\66\67"+
		"\7\6\2\2\678\5\2\2\28\13\3\2\2\29:\7\7\2\2:;\7\t\2\2;\r\3\2\2\2<=\t\2"+
		"\2\2=\17\3\2\2\2>?\7\t\2\2?\21\3\2\2\2@J\7\t\2\2AJ\5\f\7\2BC\7\t\2\2C"+
		"D\7\b\2\2DJ\5\24\13\2EF\5\f\7\2FG\7\b\2\2GH\5\24\13\2HJ\3\2\2\2I@\3\2"+
		"\2\2IA\3\2\2\2IB\3\2\2\2IE\3\2\2\2J\23\3\2\2\2KN\7\t\2\2LN\5\f\7\2MK\3"+
		"\2\2\2ML\3\2\2\2N\25\3\2\2\2\b\30!*\64IM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}