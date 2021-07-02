lexer grammar Lexer;


INICIO: 'asamblea' ;

ENTERO:'num';
FLOTANTE:'dec';
BOOL:'funa';
CHAR:'letra';

TRUE:'funado';
FALSE:'desfunado';

PRINTLN:'incel';
LEER:'aliade';


IF:'cuestionar';
ELSE:'noCuestionar';
FOR:'normalizar';
WHILE:'romantizar';

//Operadores Aritmeticos//
SUMAR:'+';
RESTAR:'-';
MULTIPLICAR:'*';
DIVIDIR:'/';
RESTO:'%';

//Operadores logicos//
AND:'&&';
OR:'||';
NOT: '!';

//Operadores de comparacion//

ES:'=';
MAYOR:'>';
MENOR:'<';
IGUAL:'==';
NOIGUAL:'!=';
MAYORAL:'>=';
MENORAL:'<=';

//Parentesis y signos de puntuacion//
SC:';';
PAR_A:'(';
PAR_C:')';
LLAV_A:'{';
LLAV_C:'}';
COM:'"';
COMA:',';

//Identificadores//
NUM:[0-9]+;

ID : [a-zA-Z]+ ;  
IDS : [a-zA-Z_][a-zA-Z0-9]* ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

COMENTARIOS: '//' ~[\r\n]* -> skip ;

