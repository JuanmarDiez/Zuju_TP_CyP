// Generated from com\lenguaje\zuju\interprete\Zuju.g4 by ANTLR 4.5.1
package com.lenguaje.zuju.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import com.lenguaje.zuju.interprete.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZujuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZujuVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZujuParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ZujuParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(ZujuParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(ZujuParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(ZujuParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#var_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_asignacion(ZujuParser.Var_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(ZujuParser.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(ZujuParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#bucle_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_para(ZujuParser.Bucle_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#enunciado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnunciado(ZujuParser.EnunciadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#proposicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProposicion(ZujuParser.ProposicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(ZujuParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ZujuParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZujuParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ZujuParser.TermContext ctx);
}