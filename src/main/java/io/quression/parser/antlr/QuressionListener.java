// Generated from Quression.g4 by ANTLR 4.9

    package io.quression.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuressionParser}.
 */
public interface QuressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuressionParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(QuressionParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(QuressionParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuressionParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(QuressionParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(QuressionParser.ItemsContext ctx);
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
	 * Enter a parse tree produced by {@link QuressionParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(QuressionParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(QuressionParser.SymbolContext ctx);
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
	 * Enter a parse tree produced by {@link QuressionParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(QuressionParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(QuressionParser.QuoteContext ctx);
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
}