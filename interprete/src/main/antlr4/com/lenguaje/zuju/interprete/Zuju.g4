grammar Zuju;

@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	import com.lenguaje.zuju.interprete.ast.*;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}

program: PROGRAMA ID LLAVE_ABIERTA
		{
			List<ASTNode> body = new ArrayList<ASTNode>();
		}
		(sentencia {body.add($sentencia.node);})*
		LLAVE_CERRADA
		{
			for(ASTNode n : body) {
				n.execute();
			}
		};
	
sentencia returns [ASTNode node]: var_decl | var_asignacion | mostrar {$node = $mostrar.node;}| condicional {$node = $condicional.node;};

var_decl: (ENT | REAL | CADENA | BOOL) ID PUNTO_COMA
		{symbolTable.put($ID.text, 0);};
		
var_asignacion: ID ASIGNAR enunciado PUNTO_COMA
			{};
			
mostrar returns [ASTNode node]: MOSTRAR enunciado PUNTO_COMA
		{$node = new Mostrar($enunciado.node);};
		
condicional returns [ASTNode node]: SI PAR_ABIERTO enunciado PAR_CERRADO
				{
					List<ASTNode> body = new ArrayList<ASTNode>();
				}
				LLAVE_ABIERTA (s1=sentencia { body.add($s1.node);})* LLAVE_CERRADA
				SINO
				{
					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				}
				LLAVE_ABIERTA (s2=sentencia {elseBody.add($s2.node);})* LLAVE_CERRADA
				{
					$node = new Si($enunciado.node,body,elseBody);
				};
				
enunciado returns [ASTNode node]:
		 t1=proposicion {$node = $t1.node;} 
			(O t2=proposicion {$node = new OLog($node,$t2.node);}
			| Y	t2=proposicion {$node = new YLog($node,$t2.node);}	
			)*;
				
proposicion returns [ASTNode node]:
		t1=expresion {$node = $t1.node;}
			(MAYORQ t2=expresion {$node = new Comparacion($node,$t2.node);} 
				| MENORQ t2=expresion {$node = new Comparacion($t2.node,$node);}
				| IGUAL t2=expresion {$node = new Igualacion($node, $t2.node);}
				| MAYORI t2=expresion {$node = new ComparacionIg($node,$t2.node);}
				| MENORI t2=expresion {$node = new ComparacionIg($t2.node,$node);}
			)*;
		
expresion returns [ASTNode node]:
		t1=factor {$node = $t1.node;} 
			((MAS t2=factor {$node = new Adicion($node,$t2.node);}) | MENOS t2=factor {$node = new Sustraccion($node,$t2.node);})*;
		
			
factor returns [ASTNode node]: t1=term {$node = $t1.node;} 
			(MULT t2=term {$node = new Multiplicacion($node,$t2.node);}
				| DIV t2=term {$node = new Division($node,$t2.node);}
			)*;
			

term returns [ASTNode node]: 
		NUMERO {$node = new Constante(Double.parseDouble($NUMERO.text));}
		| ENTERO {$node = new Constante(Integer.parseInt($ENTERO.text));}
		| ID {$node = new Id($ID.text);}
		| BOOLEAN {$node = new Constante(Boolean.parseBoolean($BOOLEAN.text));}
		| PAR_ABIERTO expresion {$node = $expresion.node;} PAR_CERRADO;



PROGRAMA: 'programa';
ENT: 'ent';
REAL: 'real';
CADENA: 'cadena';
BOOL: 'bool';
MOSTRAR: 'mostrar';
SI: 'si';
SINO: 'sino';

MAS: '+';
MENOS: '-';
MULT: '*';
DIV: '/';

Y: '&&';
O: '||';

MAYORQ: '>';
MENORQ: '<';
MAYORI: '>=';
MENORI: '<=';
IGUAL: '==';
NOIGUAL: '!=';

ASIGNAR: '=';

LLAVE_ABIERTA: '{';
LLAVE_CERRADA: '}';

PAR_ABIERTO: '(';
PAR_CERRADO: ')';

PUNTO_COMA: ';';

BOOLEAN: 'true' | 'false';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
ENTERO: [0-9]+;
NUMERO: [0-9]+('.'[0-9]+);

WS: [ \t\n\r]+ -> skip;