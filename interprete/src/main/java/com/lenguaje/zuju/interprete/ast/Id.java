package com.lenguaje.zuju.interprete.ast;

public class Id implements ASTNode {
	private String id;
		
	public Id(String id) {
		super();
		this.id = id;
	}

	@Override
	public Object execute() {
		return id;
	}

}
