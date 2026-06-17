package com.lenguaje.zuju.interprete.ast;

public class ComparacionIg implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	
	public ComparacionIg(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}



	@Override
	public Object execute() {
		return ((Number)operand1.execute()).doubleValue() >= ((Number)operand2.execute()).doubleValue();
	}

}
