package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class Comparacion implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	
	public Comparacion(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}



	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		Object valor1 = operand1.execute(symbolTable);
		Object valor2 = operand2.execute(symbolTable);
		if(valor1 instanceof Number && valor2 instanceof Number) {
			return ((Number)valor1).doubleValue() > ((Number)valor2).doubleValue();
		}
		else {
			throw new RuntimeException("Error semántico: La operacion es invalida");
		}
	}

}
