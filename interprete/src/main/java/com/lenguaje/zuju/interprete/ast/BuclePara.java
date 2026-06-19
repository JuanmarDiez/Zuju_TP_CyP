package com.lenguaje.zuju.interprete.ast;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.lenguaje.zuju.interprete.SimboloVariable;

public class BuclePara implements ASTNode {
	private ASTNode declaracion;
    private ASTNode inicializacion;
	private ASTNode proposicion;
	private ASTNode incremento;
	private List<ASTNode> body;
	

	public BuclePara(ASTNode declaracion, ASTNode inicializacion, ASTNode proposicion, ASTNode incremento,
			List<ASTNode> body) {
		super();
		this.declaracion = declaracion;
		this.inicializacion = inicializacion;
		this.proposicion = proposicion;
		this.incremento = incremento;
		this.body = body;
	}


	@Override
	public Object execute(Map<String, SimboloVariable> symbolTable) {
		
		
		Set<String> variablesPrevias = new HashSet<>(symbolTable.keySet());
		
		
		declaracion.execute(symbolTable);

        inicializacion.execute(symbolTable);        
		
      		if(!(proposicion.execute(symbolTable) instanceof Boolean) ) {
      			throw new RuntimeException("Error semántico: la condición debe ser un resultado booleano");
      		}
		
		while((boolean) proposicion.execute(symbolTable)) {
			for(ASTNode n:body) {
				n.execute(symbolTable);
			}
			incremento.execute(symbolTable);
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
