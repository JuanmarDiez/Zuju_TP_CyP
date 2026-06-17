package com.lenguaje.zuju.interprete.ast;

public class YLog implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public YLog(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute() {
		return (boolean)operand1.execute() && (boolean)operand2.execute();
	}

}
