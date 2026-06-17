package com.lenguaje.zuju.interprete.ast;

public class Sustraccion implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Sustraccion(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute() {
		if(Integer.class.isInstance(operand1.execute()) && Integer.class.isInstance(operand2.execute())) {
			return (int)operand1.execute() - (int) operand2.execute();
		}
		else {
			return ((Number)operand1.execute()).doubleValue() - ((Number)operand2.execute()).doubleValue();
		}
	}

}
