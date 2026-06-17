package com.lenguaje.zuju.interprete.ast;

public class Constante implements ASTNode {
	private Object value;
	
	
	
	public Constante(Object value) {
		super();
		this.value = value;
	}



	@Override
	public Object execute() {
		return value;
	}

}
