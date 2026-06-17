package com.lenguaje.zuju.interprete.ast;

public class Division implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Division(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute() {
		if(((Number)operand2.execute()).doubleValue() != 0) {
			double resultado = ((Number)operand1.execute()).doubleValue() / ((Number)operand2.execute()).doubleValue();
			if (resultado % 1 == 0) {
				return (int) resultado;
			}
			else {
				return (double) resultado;
			}
		}
		else {
			return "No es posible la division entre 0";
		}
	}

}
