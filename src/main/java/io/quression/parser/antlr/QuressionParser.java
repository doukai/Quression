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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, IDENTIFICATION_VARIABLE=27, AND=28, OR=29, ASC=30, 
		DESC=31, STRING=32, NUMBER=33, ENUM=34, BOOLEAN=35, NULL=36, WS=37;
	public static final int
		RULE_expression = 0, RULE_block = 1, RULE_filter = 2, RULE_condition = 3, 
		RULE_multi = 4, RULE_uni = 5, RULE_eq = 6, RULE_neq = 7, RULE_gt = 8, 
		RULE_ge = 9, RULE_lt = 10, RULE_le = 11, RULE_lk = 12, RULE_sl = 13, RULE_el = 14, 
		RULE_nlk = 15, RULE_nsl = 16, RULE_nel = 17, RULE_in = 18, RULE_nin = 19, 
		RULE_isn = 20, RULE_nn = 21, RULE_order = 22, RULE_contact = 23, RULE_sort = 24, 
		RULE_value = 25, RULE_variable = 26, RULE_param = 27, RULE_function = 28, 
		RULE_type = 29, RULE_constant = 30, RULE_range = 31, RULE_min = 32, RULE_max = 33, 
		RULE_collection = 34, RULE_item = 35, RULE_field = 36, RULE_subfield = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "block", "filter", "condition", "multi", "uni", "eq", "neq", 
			"gt", "ge", "lt", "le", "lk", "sl", "el", "nlk", "nsl", "nel", "in", 
			"nin", "isn", "nn", "order", "contact", "sort", "value", "variable", 
			"param", "function", "type", "constant", "range", "min", "max", "collection", 
			"item", "field", "subfield"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", 
			"'%'", "'%^'", "'^%'", "'!%'", "'!%^'", "'!^%'", "'@'", "'!@'", "'^'", 
			"'!^'", "','", "'$'", "'['", "'~'", "']'", "'!'", "'.'", null, "'&'", 
			"'|'", "'+'", "'-'", null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENTIFICATION_VARIABLE", "AND", "OR", "ASC", "DESC", 
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(76);
			block();
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(77);
				match(T__0);
				setState(78);
				block();
				}
				}
				setState(83);
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

	public static class BlockContext extends ParserRuleContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				filter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				order();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				function();
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

	public static class FilterContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ContactContext> contact() {
			return getRuleContexts(ContactContext.class);
		}
		public ContactContext contact(int i) {
			return getRuleContext(ContactContext.class,i);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			condition();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(90);
				contact();
				setState(91);
				condition();
				}
				}
				setState(97);
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

	public static class ConditionContext extends ParserRuleContext {
		public UniContext uni() {
			return getRuleContext(UniContext.class,0);
		}
		public MultiContext multi() {
			return getRuleContext(MultiContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				uni();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				multi();
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

	public static class MultiContext extends ParserRuleContext {
		public List<UniContext> uni() {
			return getRuleContexts(UniContext.class);
		}
		public UniContext uni(int i) {
			return getRuleContext(UniContext.class,i);
		}
		public List<ContactContext> contact() {
			return getRuleContexts(ContactContext.class);
		}
		public ContactContext contact(int i) {
			return getRuleContext(ContactContext.class,i);
		}
		public MultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitMulti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiContext multi() throws RecognitionException {
		MultiContext _localctx = new MultiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__1);
			setState(103);
			uni();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(104);
				contact();
				setState(105);
				uni();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__2);
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

	public static class UniContext extends ParserRuleContext {
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public NeqContext neq() {
			return getRuleContext(NeqContext.class,0);
		}
		public GtContext gt() {
			return getRuleContext(GtContext.class,0);
		}
		public GeContext ge() {
			return getRuleContext(GeContext.class,0);
		}
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public LeContext le() {
			return getRuleContext(LeContext.class,0);
		}
		public LkContext lk() {
			return getRuleContext(LkContext.class,0);
		}
		public SlContext sl() {
			return getRuleContext(SlContext.class,0);
		}
		public ElContext el() {
			return getRuleContext(ElContext.class,0);
		}
		public NlkContext nlk() {
			return getRuleContext(NlkContext.class,0);
		}
		public NslContext nsl() {
			return getRuleContext(NslContext.class,0);
		}
		public NelContext nel() {
			return getRuleContext(NelContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public NinContext nin() {
			return getRuleContext(NinContext.class,0);
		}
		public IsnContext isn() {
			return getRuleContext(IsnContext.class,0);
		}
		public NnContext nn() {
			return getRuleContext(NnContext.class,0);
		}
		public UniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterUni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitUni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitUni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniContext uni() throws RecognitionException {
		UniContext _localctx = new UniContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_uni);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				eq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				neq();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				gt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				ge();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				lt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				le();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				lk();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				sl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				el();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				nlk();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				nsl();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(125);
				nel();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(126);
				in();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(127);
				nin();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(128);
				isn();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(129);
				nn();
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

	public static class EqContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			field();
			setState(133);
			match(T__3);
			setState(134);
			value();
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

	public static class NeqContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitNeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitNeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeqContext neq() throws RecognitionException {
		NeqContext _localctx = new NeqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_neq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			field();
			setState(137);
			match(T__4);
			setState(138);
			value();
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

	public static class GtContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtContext gt() throws RecognitionException {
		GtContext _localctx = new GtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_gt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			field();
			setState(141);
			match(T__5);
			setState(142);
			value();
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

	public static class GeContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeContext ge() throws RecognitionException {
		GeContext _localctx = new GeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			field();
			setState(145);
			match(T__6);
			setState(146);
			value();
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

	public static class LtContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtContext lt() throws RecognitionException {
		LtContext _localctx = new LtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			field();
			setState(149);
			match(T__7);
			setState(150);
			value();
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

	public static class LeContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			field();
			setState(153);
			match(T__8);
			setState(154);
			value();
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

	public static class LkContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterLk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitLk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitLk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LkContext lk() throws RecognitionException {
		LkContext _localctx = new LkContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			field();
			setState(157);
			match(T__9);
			setState(158);
			value();
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

	public static class SlContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterSl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitSl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitSl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlContext sl() throws RecognitionException {
		SlContext _localctx = new SlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			field();
			setState(161);
			match(T__10);
			setState(162);
			value();
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

	public static class ElContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitEl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitEl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElContext el() throws RecognitionException {
		ElContext _localctx = new ElContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_el);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			field();
			setState(165);
			match(T__11);
			setState(166);
			value();
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

	public static class NlkContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NlkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterNlk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitNlk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitNlk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NlkContext nlk() throws RecognitionException {
		NlkContext _localctx = new NlkContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nlk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			field();
			setState(169);
			match(T__12);
			setState(170);
			value();
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

	public static class NslContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterNsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitNsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitNsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NslContext nsl() throws RecognitionException {
		NslContext _localctx = new NslContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nsl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			field();
			setState(173);
			match(T__13);
			setState(174);
			value();
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

	public static class NelContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterNel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitNel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitNel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NelContext nel() throws RecognitionException {
		NelContext _localctx = new NelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			field();
			setState(177);
			match(T__14);
			setState(178);
			value();
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

	public static class InContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			field();
			setState(181);
			match(T__15);
			setState(182);
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

	public static class NinContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public NinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterNin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitNin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitNin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NinContext nin() throws RecognitionException {
		NinContext _localctx = new NinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			field();
			setState(185);
			match(T__16);
			setState(186);
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

	public static class IsnContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public IsnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterIsn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitIsn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitIsn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsnContext isn() throws RecognitionException {
		IsnContext _localctx = new IsnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_isn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			field();
			setState(189);
			match(T__17);
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

	public static class NnContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public NnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterNn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitNn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitNn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NnContext nn() throws RecognitionException {
		NnContext _localctx = new NnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			field();
			setState(192);
			match(T__18);
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

	public static class OrderContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			field();
			setState(195);
			sort();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(196);
				match(T__19);
				setState(197);
				field();
				setState(198);
				sort();
				}
				}
				setState(204);
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

	public static class ContactContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(QuressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(QuressionParser.OR, 0); }
		public ContactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterContact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitContact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitContact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactContext contact() throws RecognitionException {
		ContactContext _localctx = new ContactContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_contact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class SortContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(QuressionParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(QuressionParser.DESC, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 50, RULE_value);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				variable();
				}
				break;
			case STRING:
			case NUMBER:
			case ENUM:
			case BOOLEAN:
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				constant();
				}
				break;
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				function();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				type();
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
		enterRule(_localctx, 52, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__20);
			setState(216);
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

	public static class ParamContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_param);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				value();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(QuressionParser.IDENTIFICATION_VARIABLE, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
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
		enterRule(_localctx, 56, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IDENTIFICATION_VARIABLE);
			setState(223);
			match(T__1);
			{
			setState(224);
			param();
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(225);
				match(T__19);
				setState(226);
				param();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__2);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(QuressionParser.IDENTIFICATION_VARIABLE, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__15);
			setState(235);
			match(IDENTIFICATION_VARIABLE);
			setState(236);
			match(T__1);
			{
			setState(237);
			constant();
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(238);
				match(T__19);
				setState(239);
				constant();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(T__2);
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
		enterRule(_localctx, 60, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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

	public static class RangeContext extends ParserRuleContext {
		public MinContext min() {
			return getRuleContext(MinContext.class,0);
		}
		public MaxContext max() {
			return getRuleContext(MaxContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__21);
			setState(250);
			min();
			setState(251);
			match(T__22);
			setState(252);
			max();
			setState(253);
			match(T__23);
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

	public static class MinContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinContext min() throws RecognitionException {
		MinContext _localctx = new MinContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_min);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			value();
			{
			setState(256);
			match(T__24);
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

	public static class MaxContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxContext max() throws RecognitionException {
		MaxContext _localctx = new MaxContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			value();
			{
			setState(259);
			match(T__24);
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

	public static class CollectionContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
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
		enterRule(_localctx, 68, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__21);
			{
			setState(262);
			item();
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(263);
				match(T__19);
				setState(264);
				item();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(T__23);
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

	public static class ItemContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuressionListener ) ((QuressionListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuressionVisitor ) return ((QuressionVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_item);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__20:
			case IDENTIFICATION_VARIABLE:
			case STRING:
			case NUMBER:
			case ENUM:
			case BOOLEAN:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				value();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				range();
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
		enterRule(_localctx, 72, RULE_field);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(IDENTIFICATION_VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(IDENTIFICATION_VARIABLE);
				setState(279);
				match(T__25);
				setState(280);
				subfield();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				variable();
				setState(282);
				match(T__25);
				setState(283);
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
		enterRule(_localctx, 74, RULE_subfield);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(IDENTIFICATION_VARIABLE);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4"+
		"\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00cb\n\30\f\30\16"+
		"\30\u00ce\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00d8\n\33"+
		"\3\34\3\34\3\34\3\35\3\35\5\35\u00df\n\35\3\36\3\36\3\36\3\36\3\36\7\36"+
		"\u00e6\n\36\f\36\16\36\u00e9\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u00f3\n\37\f\37\16\37\u00f6\13\37\3\37\3\37\3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\7$\u010c\n$\f$\16$\u010f\13"+
		"$\3$\3$\3%\3%\5%\u0115\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0120\n&\3\'\3"+
		"\'\5\'\u0124\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJL\2\5\3\2\36\37\3\2 !\3\2\"&\2\u0121\2N\3\2"+
		"\2\2\4Y\3\2\2\2\6[\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\f\u0084\3\2\2\2\16\u0086"+
		"\3\2\2\2\20\u008a\3\2\2\2\22\u008e\3\2\2\2\24\u0092\3\2\2\2\26\u0096\3"+
		"\2\2\2\30\u009a\3\2\2\2\32\u009e\3\2\2\2\34\u00a2\3\2\2\2\36\u00a6\3\2"+
		"\2\2 \u00aa\3\2\2\2\"\u00ae\3\2\2\2$\u00b2\3\2\2\2&\u00b6\3\2\2\2(\u00ba"+
		"\3\2\2\2*\u00be\3\2\2\2,\u00c1\3\2\2\2.\u00c4\3\2\2\2\60\u00cf\3\2\2\2"+
		"\62\u00d1\3\2\2\2\64\u00d7\3\2\2\2\66\u00d9\3\2\2\28\u00de\3\2\2\2:\u00e0"+
		"\3\2\2\2<\u00ec\3\2\2\2>\u00f9\3\2\2\2@\u00fb\3\2\2\2B\u0101\3\2\2\2D"+
		"\u0104\3\2\2\2F\u0107\3\2\2\2H\u0114\3\2\2\2J\u011f\3\2\2\2L\u0123\3\2"+
		"\2\2NS\5\4\3\2OP\7\3\2\2PR\5\4\3\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2T\3\3\2\2\2US\3\2\2\2VZ\5\6\4\2WZ\5.\30\2XZ\5:\36\2YV\3\2\2\2YW\3"+
		"\2\2\2YX\3\2\2\2Z\5\3\2\2\2[a\5\b\5\2\\]\5\60\31\2]^\5\b\5\2^`\3\2\2\2"+
		"_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2dg\5\f\7"+
		"\2eg\5\n\6\2fd\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hi\7\4\2\2io\5\f\7\2jk\5\60"+
		"\31\2kl\5\f\7\2ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3"+
		"\2\2\2qo\3\2\2\2rs\7\5\2\2s\13\3\2\2\2t\u0085\5\16\b\2u\u0085\5\20\t\2"+
		"v\u0085\5\22\n\2w\u0085\5\24\13\2x\u0085\5\26\f\2y\u0085\5\30\r\2z\u0085"+
		"\5\32\16\2{\u0085\5\34\17\2|\u0085\5\36\20\2}\u0085\5 \21\2~\u0085\5\""+
		"\22\2\177\u0085\5$\23\2\u0080\u0085\5&\24\2\u0081\u0085\5(\25\2\u0082"+
		"\u0085\5*\26\2\u0083\u0085\5,\27\2\u0084t\3\2\2\2\u0084u\3\2\2\2\u0084"+
		"v\3\2\2\2\u0084w\3\2\2\2\u0084x\3\2\2\2\u0084y\3\2\2\2\u0084z\3\2\2\2"+
		"\u0084{\3\2\2\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\177"+
		"\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\5J&\2\u0087\u0088\7\6\2\2\u0088"+
		"\u0089\5\64\33\2\u0089\17\3\2\2\2\u008a\u008b\5J&\2\u008b\u008c\7\7\2"+
		"\2\u008c\u008d\5\64\33\2\u008d\21\3\2\2\2\u008e\u008f\5J&\2\u008f\u0090"+
		"\7\b\2\2\u0090\u0091\5\64\33\2\u0091\23\3\2\2\2\u0092\u0093\5J&\2\u0093"+
		"\u0094\7\t\2\2\u0094\u0095\5\64\33\2\u0095\25\3\2\2\2\u0096\u0097\5J&"+
		"\2\u0097\u0098\7\n\2\2\u0098\u0099\5\64\33\2\u0099\27\3\2\2\2\u009a\u009b"+
		"\5J&\2\u009b\u009c\7\13\2\2\u009c\u009d\5\64\33\2\u009d\31\3\2\2\2\u009e"+
		"\u009f\5J&\2\u009f\u00a0\7\f\2\2\u00a0\u00a1\5\64\33\2\u00a1\33\3\2\2"+
		"\2\u00a2\u00a3\5J&\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\5\64\33\2\u00a5\35"+
		"\3\2\2\2\u00a6\u00a7\5J&\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\5\64\33\2"+
		"\u00a9\37\3\2\2\2\u00aa\u00ab\5J&\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\5"+
		"\64\33\2\u00ad!\3\2\2\2\u00ae\u00af\5J&\2\u00af\u00b0\7\20\2\2\u00b0\u00b1"+
		"\5\64\33\2\u00b1#\3\2\2\2\u00b2\u00b3\5J&\2\u00b3\u00b4\7\21\2\2\u00b4"+
		"\u00b5\5\64\33\2\u00b5%\3\2\2\2\u00b6\u00b7\5J&\2\u00b7\u00b8\7\22\2\2"+
		"\u00b8\u00b9\5F$\2\u00b9\'\3\2\2\2\u00ba\u00bb\5J&\2\u00bb\u00bc\7\23"+
		"\2\2\u00bc\u00bd\5F$\2\u00bd)\3\2\2\2\u00be\u00bf\5J&\2\u00bf\u00c0\7"+
		"\24\2\2\u00c0+\3\2\2\2\u00c1\u00c2\5J&\2\u00c2\u00c3\7\25\2\2\u00c3-\3"+
		"\2\2\2\u00c4\u00c5\5J&\2\u00c5\u00cc\5\62\32\2\u00c6\u00c7\7\26\2\2\u00c7"+
		"\u00c8\5J&\2\u00c8\u00c9\5\62\32\2\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"/\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0\61\3\2\2\2\u00d1"+
		"\u00d2\t\3\2\2\u00d2\63\3\2\2\2\u00d3\u00d8\5\66\34\2\u00d4\u00d8\5> "+
		"\2\u00d5\u00d8\5:\36\2\u00d6\u00d8\5<\37\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\65\3\2\2\2\u00d9"+
		"\u00da\7\27\2\2\u00da\u00db\7\35\2\2\u00db\67\3\2\2\2\u00dc\u00df\5J&"+
		"\2\u00dd\u00df\5\64\33\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"9\3\2\2\2\u00e0\u00e1\7\35\2\2\u00e1\u00e2\7\4\2\2\u00e2\u00e7\58\35\2"+
		"\u00e3\u00e4\7\26\2\2\u00e4\u00e6\58\35\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\7\5\2\2\u00eb;\3\2\2\2\u00ec\u00ed\7\22\2\2"+
		"\u00ed\u00ee\7\35\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f4\5> \2\u00f0\u00f1"+
		"\7\26\2\2\u00f1\u00f3\5> \2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f8\7\5\2\2\u00f8=\3\2\2\2\u00f9\u00fa\t\4\2\2\u00fa?\3\2"+
		"\2\2\u00fb\u00fc\7\30\2\2\u00fc\u00fd\5B\"\2\u00fd\u00fe\7\31\2\2\u00fe"+
		"\u00ff\5D#\2\u00ff\u0100\7\32\2\2\u0100A\3\2\2\2\u0101\u0102\5\64\33\2"+
		"\u0102\u0103\7\33\2\2\u0103C\3\2\2\2\u0104\u0105\5\64\33\2\u0105\u0106"+
		"\7\33\2\2\u0106E\3\2\2\2\u0107\u0108\7\30\2\2\u0108\u010d\5H%\2\u0109"+
		"\u010a\7\26\2\2\u010a\u010c\5H%\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7\32\2\2\u0111G\3\2\2\2\u0112\u0115\5\64\33"+
		"\2\u0113\u0115\5@!\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115I\3"+
		"\2\2\2\u0116\u0120\7\35\2\2\u0117\u0120\5\66\34\2\u0118\u0119\7\35\2\2"+
		"\u0119\u011a\7\34\2\2\u011a\u0120\5L\'\2\u011b\u011c\5\66\34\2\u011c\u011d"+
		"\7\34\2\2\u011d\u011e\5L\'\2\u011e\u0120\3\2\2\2\u011f\u0116\3\2\2\2\u011f"+
		"\u0117\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u011b\3\2\2\2\u0120K\3\2\2\2"+
		"\u0121\u0124\7\35\2\2\u0122\u0124\5\66\34\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124M\3\2\2\2\21SYafo\u0084\u00cc\u00d7\u00de\u00e7\u00f4"+
		"\u010d\u0114\u011f\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}