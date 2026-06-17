package com.lenguaje.zuju.interprete.ast;

public class Mostrar implements ASTNode {
	private ASTNode data;
	
	
	
	public Mostrar(ASTNode data) {
		super();
		this.data = data;
	}



	@Override
	public Object execute() {
		System.out.println(data.execute());
		return null;
	}

}
