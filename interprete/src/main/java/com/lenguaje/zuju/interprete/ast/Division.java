package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class Division implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Division(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		if(((Number)operand2.execute(symbolTable)).doubleValue() != 0) {
			double resultado = ((Number)operand1.execute(symbolTable)).doubleValue() / ((Number)operand2.execute(symbolTable)).doubleValue();
			if (resultado % 1 == 0) {
				return (int) resultado;
			}
			else {
				return (double) resultado;
			}
		}
		else {
			throw new ArithmeticException("Error semantico: No se admite la division entre 0");
		}
	}

}
