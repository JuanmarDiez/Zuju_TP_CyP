package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class YLog implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public YLog(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		Object valor1 = operand1.execute(symbolTable);
		Object valor2 = operand2.execute(symbolTable);
		if(valor1 instanceof Boolean && valor2 instanceof Boolean) {
			return (boolean)valor1 && (boolean)valor2;
		}
		else {
			throw new RuntimeException("Error semántico: La operacion es invalida");
		}
	}

}
