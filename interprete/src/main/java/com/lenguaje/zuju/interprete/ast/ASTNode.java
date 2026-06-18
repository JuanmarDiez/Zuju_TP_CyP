package com.lenguaje.zuju.interprete.ast;

import java.util.Map;

import com.lenguaje.zuju.interprete.SimboloVariable;

public interface ASTNode {
	public Object execute(Map<String, SimboloVariable> symbolTable);
}
