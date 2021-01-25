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
	 * Visit a parse tree produced by {@link QuressionParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(QuressionParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(QuressionParser.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(QuressionParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(QuressionParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QuressionParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(QuressionParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(QuressionParser.ConstantContext ctx);
}