package com.lenguaje.zuju.interprete.ast;

import java.util.List;
import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class Id implements ASTNode {
	private List<String> id;
		
	public Id(List<String> id) {
		super();
		this.id = id;
	}

	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		return String.join(" ", id);
	}

}
