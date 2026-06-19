package com.lenguaje.zuju.interprete.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class Si implements ASTNode {
	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> elseBody;

	
	
	public Si(ASTNode condition, List<ASTNode> body, List<ASTNode> elseBody) {
		super();
		this.condition = condition;
		this.body = body;
		this.elseBody = elseBody;
	}



	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		
		Set<String> variablesPrevias = new HashSet<>(symbolTable.keySet());
		
		if((boolean)condition.execute(symbolTable)) {
			for(ASTNode n:body) {
				n.execute(symbolTable);
			}
		}else {
			for(ASTNode n:elseBody) {
				n.execute(symbolTable);
			}
		}
		
		Set<String> variablesActuales = new HashSet<>(symbolTable.keySet());
	    for (String nombreVar : variablesActuales) {
	       
	        if (!variablesPrevias.contains(nombreVar)) {
	           
	            symbolTable.remove(nombreVar); 
	        }
	    }
		return null;
	}

}
