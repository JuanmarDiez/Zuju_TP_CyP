package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class VarDecl implements ASTNode {
	private String tipo;
	private String name;
	public ASTNode expresion;
	

	public VarDecl(String tipo, String name) {
		super();
		this.tipo = tipo;
		this.name = name;
		this.expresion = null;
	}
	
	public VarDecl(String tipo, String name, ASTNode expresion) {
		super();
		this.tipo = tipo;
		this.name = name;
		this.expresion = expresion;
	}

	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		
		if (symbolTable.containsKey(name)) {
	        throw new RuntimeException("Error semántico: La variable '" + name + "' ya ha sido declarada previamente.");
	    }
		
		Object valor = null;
		
		if (this.expresion != null) {
	        valor = this.expresion.execute(symbolTable); 
	    }

		symbolTable.put(name, new SimboloVariable(tipo,valor));
		return null;
	}

}
