package com.lenguaje.zuju.interprete;

public class SimboloVariable {
	private String tipo;
	private Object valor;
	
	public SimboloVariable(String tipo, Object valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	
	
}
