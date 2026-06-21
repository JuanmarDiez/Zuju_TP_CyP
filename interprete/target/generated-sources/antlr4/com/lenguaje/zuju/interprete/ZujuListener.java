// Generated from Zuju.g4 by ANTLR 4.4
package com.lenguaje.zuju.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import com.lenguaje.zuju.interprete.ast.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZujuParser}.
 */
public interface ZujuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZujuParser#var_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterVar_asignacion(@NotNull ZujuParser.Var_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#var_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitVar_asignacion(@NotNull ZujuParser.Var_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(@NotNull ZujuParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(@NotNull ZujuParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ZujuParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ZujuParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull ZujuParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull ZujuParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull ZujuParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull ZujuParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(@NotNull ZujuParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(@NotNull ZujuParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#bucle_para}.
	 * @param ctx the parse tree
	 */
	void enterBucle_para(@NotNull ZujuParser.Bucle_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#bucle_para}.
	 * @param ctx the parse tree
	 */
	void exitBucle_para(@NotNull ZujuParser.Bucle_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#enunciado}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado(@NotNull ZujuParser.EnunciadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#enunciado}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado(@NotNull ZujuParser.EnunciadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull ZujuParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull ZujuParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull ZujuParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull ZujuParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(@NotNull ZujuParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(@NotNull ZujuParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull ZujuParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull ZujuParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void enterProposicion(@NotNull ZujuParser.ProposicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void exitProposicion(@NotNull ZujuParser.ProposicionContext ctx);
}