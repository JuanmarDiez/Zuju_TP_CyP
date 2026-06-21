grammar Zuju;

@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	import com.lenguaje.zuju.interprete.ast.*;
}

@parser::members {
	Map<String, SimboloVariable> symbolTable = new HashMap<String, SimboloVariable>();
}

program: PROGRAMA ID LLAVE_ABIERTA
		{
			List<ASTNode> body = new ArrayList<ASTNode>();
		}
		(sentencia {body.add($sentencia.node);})*
		LLAVE_CERRADA
		{
			for(ASTNode n : body) {
				n.execute(symbolTable);
			}
		};
	
sentencia returns [ASTNode node]: var_decl {$node = $var_decl.node;} | var_asignacion {$node = $var_asignacion.node;} | mostrar {$node = $mostrar.node;}| condicional {$node = $condicional.node;} | bucle_para {$node = $bucle_para.node;};

var_decl returns [ASTNode node]: tipo_dato ID (ASIGNAR enun=enunciado)? PUNTO_COMA {
																				if ($enun.ctx != null) {
																			              $node = new VarDecl($tipo_dato.text, $ID.text, $enun.node);
																			          } else {
																			              $node = new VarDecl($tipo_dato.text, $ID.text);
																			          }
																			};

tipo_dato returns [ASTNode node]: ENT | REAL | CADENA | BOOL;

var_asignacion returns [ASTNode node]: ID ASIGNAR enunciado PUNTO_COMA {$node = new VarAssign($ID.text, $enunciado.node);};
			
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
								
bucle_para returns [ASTNode node]: PARA PAR_ABIERTO decl=var_decl proposicion PUNTO_COMA id1=ID ASIGNAR en=enunciado PAR_CERRADO {List<ASTNode> body = new ArrayList<ASTNode>();}
									LLAVE_ABIERTA (sentencia {body.add($sentencia.node);})* LLAVE_CERRADA {$node = new BuclePara($decl.node, $proposicion.node, new VarAssign($id1.text, $en.node), body);};
				
enunciado returns [ASTNode node]:
		 t1=proposicion {$node = $t1.node;}
			(O t2=proposicion {$node = new OLog($node,$t2.node);}
			| Y	t2=proposicion {$node = new YLog($node,$t2.node);}	)*;
				
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
		| ID {$node = new VarRef($ID.text);}
		| BOOLEAN {$node = new Constante(Boolean.parseBoolean($BOOLEAN.text));}
		| PAR_ABIERTO expresion {$node = $expresion.node;} PAR_CERRADO
		| LITERAL_CADENA { 
		        String texto = $LITERAL_CADENA.text;        
		        texto = texto.substring(1, texto.length() - 1);         
		        $node = new Id(texto); 
      			}
      	|NO t=term {$node = new NoLog($t.node);} ;



PROGRAMA: 'programa';
ENT: 'ent';
REAL: 'real';
CADENA: 'cadena';
BOOL: 'bool';
MOSTRAR: 'mostrar';
SI: 'si';
SINO: 'sino';
PARA: 'para';

MAS: '+';
MENOS: '-';
MULT: '*';
DIV: '/';
COMENTARIO: '|-' ~[\r\n]* -> skip;
COMENTARIO_COMPLETO: '--' .*? '--'-> skip;
Y: '&&';
O: '||';
NO: '!';

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

COMILLAS: '"';

BOOLEAN: 'true' | 'false';

LITERAL_CADENA: '"' ~'"'* '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
ENTERO: [0-9]+;
NUMERO: [0-9]+('.'[0-9]+);


WS: [ \t\n\r]+ -> skip;