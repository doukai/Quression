// Generated from Quression.g4 by ANTLR 4.9

    package io.quression.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuressionParser}.
 */
public interface QuressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QuressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QuressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(QuressionParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(QuressionParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(QuressionParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(QuressionParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(QuressionParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(QuressionParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#multi}.
	 * @param ctx the parse tree
	 */
	void enterMulti(QuressionParser.MultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#multi}.
	 * @param ctx the parse tree
	 */
	void exitMulti(QuressionParser.MultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#uni}.
	 * @param ctx the parse tree
	 */
	void enterUni(QuressionParser.UniContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#uni}.
	 * @param ctx the parse tree
	 */
	void exitUni(QuressionParser.UniContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(QuressionParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(QuressionParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#neq}.
	 * @param ctx the parse tree
	 */
	void enterNeq(QuressionParser.NeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#neq}.
	 * @param ctx the parse tree
	 */
	void exitNeq(QuressionParser.NeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#gt}.
	 * @param ctx the parse tree
	 */
	void enterGt(QuressionParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#gt}.
	 * @param ctx the parse tree
	 */
	void exitGt(QuressionParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#ge}.
	 * @param ctx the parse tree
	 */
	void enterGe(QuressionParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#ge}.
	 * @param ctx the parse tree
	 */
	void exitGe(QuressionParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(QuressionParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(QuressionParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#le}.
	 * @param ctx the parse tree
	 */
	void enterLe(QuressionParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#le}.
	 * @param ctx the parse tree
	 */
	void exitLe(QuressionParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#lk}.
	 * @param ctx the parse tree
	 */
	void enterLk(QuressionParser.LkContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#lk}.
	 * @param ctx the parse tree
	 */
	void exitLk(QuressionParser.LkContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#sl}.
	 * @param ctx the parse tree
	 */
	void enterSl(QuressionParser.SlContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#sl}.
	 * @param ctx the parse tree
	 */
	void exitSl(QuressionParser.SlContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#el}.
	 * @param ctx the parse tree
	 */
	void enterEl(QuressionParser.ElContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#el}.
	 * @param ctx the parse tree
	 */
	void exitEl(QuressionParser.ElContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#nlk}.
	 * @param ctx the parse tree
	 */
	void enterNlk(QuressionParser.NlkContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#nlk}.
	 * @param ctx the parse tree
	 */
	void exitNlk(QuressionParser.NlkContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#nsl}.
	 * @param ctx the parse tree
	 */
	void enterNsl(QuressionParser.NslContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#nsl}.
	 * @param ctx the parse tree
	 */
	void exitNsl(QuressionParser.NslContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#nel}.
	 * @param ctx the parse tree
	 */
	void enterNel(QuressionParser.NelContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#nel}.
	 * @param ctx the parse tree
	 */
	void exitNel(QuressionParser.NelContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(QuressionParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(QuressionParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#nin}.
	 * @param ctx the parse tree
	 */
	void enterNin(QuressionParser.NinContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#nin}.
	 * @param ctx the parse tree
	 */
	void exitNin(QuressionParser.NinContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#isn}.
	 * @param ctx the parse tree
	 */
	void enterIsn(QuressionParser.IsnContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#isn}.
	 * @param ctx the parse tree
	 */
	void exitIsn(QuressionParser.IsnContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#nn}.
	 * @param ctx the parse tree
	 */
	void enterNn(QuressionParser.NnContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#nn}.
	 * @param ctx the parse tree
	 */
	void exitNn(QuressionParser.NnContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(QuressionParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(QuressionParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(QuressionParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(QuressionParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(QuressionParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(QuressionParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#contact}.
	 * @param ctx the parse tree
	 */
	void enterContact(QuressionParser.ContactContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#contact}.
	 * @param ctx the parse tree
	 */
	void exitContact(QuressionParser.ContactContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(QuressionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(QuressionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(QuressionParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(QuressionParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QuressionParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QuressionParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#total}.
	 * @param ctx the parse tree
	 */
	void enterTotal(QuressionParser.TotalContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#total}.
	 * @param ctx the parse tree
	 */
	void exitTotal(QuressionParser.TotalContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(QuressionParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(QuressionParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(QuressionParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(QuressionParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(QuressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(QuressionParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(QuressionParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(QuressionParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(QuressionParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(QuressionParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(QuressionParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(QuressionParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(QuressionParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(QuressionParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(QuressionParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(QuressionParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#subfield}.
	 * @param ctx the parse tree
	 */
	void enterSubfield(QuressionParser.SubfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#subfield}.
	 * @param ctx the parse tree
	 */
	void exitSubfield(QuressionParser.SubfieldContext ctx);
}