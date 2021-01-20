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
	 * Visit a parse tree produced by {@link QuressionParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(QuressionParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(QuressionParser.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QuressionParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QuressionParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuressionParser#collectionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionValue(QuressionParser.CollectionValueContext ctx);
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
	 * Visit a parse tree produced by {@link QuressionParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(QuressionParser.FunctionNameContext ctx);
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