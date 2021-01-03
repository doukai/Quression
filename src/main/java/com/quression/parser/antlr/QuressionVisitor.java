// Generated from Quression.g4 by ANTLR 4.9

    package io.quression.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QuressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(QuressionParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(QuressionParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(QuressionParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#multi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti(QuressionParser.MultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#uni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUni(QuressionParser.UniContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(QuressionParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#neq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeq(QuressionParser.NeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#gt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(QuressionParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#ge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(QuressionParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(QuressionParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#le}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(QuressionParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#lk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLk(QuressionParser.LkContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#sl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl(QuressionParser.SlContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEl(QuressionParser.ElContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#nlk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNlk(QuressionParser.NlkContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#nsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNsl(QuressionParser.NslContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#nel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNel(QuressionParser.NelContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(QuressionParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#nin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNin(QuressionParser.NinContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#isn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsn(QuressionParser.IsnContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#nn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNn(QuressionParser.NnContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(QuressionParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(QuressionParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(QuressionParser.LimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#contact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContact(QuressionParser.ContactContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QuressionParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(QuressionParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QuressionParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#total}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotal(QuressionParser.TotalContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(QuressionParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(QuressionParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(QuressionParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(QuressionParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(QuressionParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(QuressionParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(QuressionParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(QuressionParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#subfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubfield(QuressionParser.SubfieldContext ctx);
}