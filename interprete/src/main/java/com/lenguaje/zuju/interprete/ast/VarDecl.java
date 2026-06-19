package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class VarDecl implements ASTNode {
	private String tipo;
	private String name;
	
	

	public VarDecl(String tipo, String name) {
		super();
		this.tipo = tipo;
		this.name = name;
	}



	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		
		if (symbolTable.containsKey(name)) {
	        throw new RuntimeException("Error semántico: La variable '" + name + "' ya ha sido declarada previamente.");
	    }
		
		symbolTable.put(name, new SimboloVariable(tipo,null));
		return null;
	}

}
