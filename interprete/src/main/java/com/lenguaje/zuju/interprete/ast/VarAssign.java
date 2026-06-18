package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class VarAssign implements ASTNode {
	private String name;
	private ASTNode expresion;
	
	public VarAssign(String name, ASTNode expresion) {
		super();
		this.name = name;
		this.expresion = expresion;
	}



	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		
		if(!symbolTable.containsKey(name)) {
			throw new RuntimeException("Error semántico: la variable " + name + " no a sido declarada");
		}
		
		Object valor = expresion.execute(symbolTable);
		String tipo = symbolTable.get(name).getTipo();
		if((symbolTable.get(name).getTipo().equals("ent") &&  Integer.class.isInstance(valor)) 
				|| (tipo.equals("real") && valor instanceof Double)
				|| (tipo.equals("cadena") && valor instanceof String)
				|| (tipo.equals("bool") && valor instanceof Boolean) ) {
			
			symbolTable.get(name).setValor(valor);
		}
		else {
			throw new RuntimeException("Error semántico: El tipo de dato que se intenta guardar en " + name + " no es soportado por la variable");
		}
		return null;
	}
}

