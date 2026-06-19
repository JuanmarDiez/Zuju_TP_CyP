package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class VarRef implements ASTNode {
	
	private String name;
	
	

	public VarRef(String name) {
		super();
		this.name = name;
	}



	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		if(!symbolTable.containsKey(name)) {
			throw new RuntimeException("Error semántico: la variable " + name + " no a sido declarada");
		}
		return symbolTable.get(name).getValor();
	}

}
