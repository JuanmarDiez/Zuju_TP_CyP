package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class NoLog implements ASTNode {
	private ASTNode operand1;
	
	

	public NoLog(ASTNode operand1) {
		super();
		this.operand1 = operand1;
	}



	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		Object valor1 = operand1.execute(symbolTable);
		if(valor1 instanceof Boolean) {
			return !(boolean)valor1;
		}
		else {
			throw new RuntimeException("Error semántico: La operacion es invalida");
		}
	}

}
