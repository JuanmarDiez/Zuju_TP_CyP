package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class Id implements ASTNode {
	private String id;
		
	public Id(String id) {
		super();
		this.id = id;
	}

	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		return id;
	}

}
