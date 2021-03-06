lexer grammar LexerDND;

BEGIN: 'Fabricate' ;
END:'Bane';

//3 tipos de datos
ENTERO:'StoneShape';
BOOLEAN:'DetectGoodAndEvil';
STRING: 'Message';

TRUE:'GOOD';
FALSE:'EVIL';

//Lectura e impresion
PRINTLN:'Sending';
READ:'ComprehendLanguages';

//Una estructura condicional
IF:'Identify';
THEN:'Command';
ELSE:'Nondetection';

//2 estructuras repetitivas
FOR:'Initiative';
WHILE:'Haste';

//2 Operadores logicos
AND:'&&';
OR:'||';

//Constantes
CRITICO: '20';
FALLO:	'1';

//Operadores matematicos basicos
SUMAR:'+';
RESTAR:'-';
MULTIPLICAR:'*';
DIVIDIR:'/';
RESTO:'%';

//4 funciones matem?aticas (sqrt, cos, sin, etc.)
COS:'ControlFlames';
SIN:'ControlWater';
TAN:'ControlWinds';
ABS:'AbsorbElements';


//Comparadores
ES:'=';
MAYOR:'>';
MENOR:'<';
IGUAL:'==';
NOTIGUAL:'!=';
MAYORIGUAL:'>=';
MENORIGUAL:'<=';

//Parentesis y signos de puntuacion
SEMIC:';';
PARIZQ:'(';
PARDER:')';
LLAVIZQ:'{';
LLAVDER:'}';
CORIZQ:'[';
CORDER:']';
COM:'"';
COMA:',';

//Identificadores
NUM:[0-9]+;
STRING_LITERAL : '"'  ( ~('"'|'\n'|'\r') )* '"' ;
ID : [a-zA-Z0-9]+ ;  
IDS : [a-zA-Z_][a-zA-Z0-9_]* ;	// match lower-case identifiers
WS : [ \t\r\n]+ -> skip ;		// skip spaces, tabs, newlines

COMENTARIOS: '//' ~[\r\n]* -> skip ;

