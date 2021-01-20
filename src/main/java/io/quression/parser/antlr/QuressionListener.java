// Generated from Quression.g4 by ANTLR 4.9

    package io.quression.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuressionParser}.
 */
public interface QuressionListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link QuressionParser#collectionValue}.
	 * @param ctx the parse tree
	 */
	void enterCollectionValue(QuressionParser.CollectionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#collectionValue}.
	 * @param ctx the parse tree
	 */
	void exitCollectionValue(QuressionParser.CollectionValueContext ctx);
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
	 * Enter a parse tree produced by {@link QuressionParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(QuressionParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuressionParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(QuressionParser.FunctionNameContext ctx);
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