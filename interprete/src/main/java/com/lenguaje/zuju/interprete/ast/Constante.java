package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class Constante implements ASTNode {
	private Object value;
	
	
	
	public Constante(Object value) {
		super();
		this.value = value;
	}



	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		return value;
	}

}
