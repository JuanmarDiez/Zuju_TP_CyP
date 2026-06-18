// Generated from com\lenguaje\zuju\interprete\Zuju.g4 by ANTLR 4.5.1
package com.lenguaje.zuju.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import com.lenguaje.zuju.interprete.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZujuParser}.
 */
public interface ZujuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZujuParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ZujuParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ZujuParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ZujuParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ZujuParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(ZujuParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(ZujuParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(ZujuParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(ZujuParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#var_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterVar_asignacion(ZujuParser.Var_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#var_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitVar_asignacion(ZujuParser.Var_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(ZujuParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(ZujuParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(ZujuParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(ZujuParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#bucle_para}.
	 * @param ctx the parse tree
	 */
	void enterBucle_para(ZujuParser.Bucle_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#bucle_para}.
	 * @param ctx the parse tree
	 */
	void exitBucle_para(ZujuParser.Bucle_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#enunciado}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado(ZujuParser.EnunciadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#enunciado}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado(ZujuParser.EnunciadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void enterProposicion(ZujuParser.ProposicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void exitProposicion(ZujuParser.ProposicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ZujuParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ZujuParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ZujuParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ZujuParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZujuParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ZujuParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZujuParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ZujuParser.TermContext ctx);
}