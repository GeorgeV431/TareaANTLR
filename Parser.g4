grammar Parser;

import Lexer;

program: INICIO LLAV_A sentencias* LLAV_C;

sentencias: declaracion
			| asignacion 
			| leer
			| iteracion
			| pregunta 
			| operacion
			| imprimir
			| comentario ;

comentario: COMENTARIOS;

declaracion: tipo_dato nombre ES valor | tipo_dato nombre ES operacion | tipo_dato nombre | tipo_dato nombre ES NUM ;

asignacion: nombre ES valor | valor ES valor operacion;

leer: LEER PAR_A nombre PAR_C;

imprimir: PRINTLN PAR_A (COM ID COM | valor | COM ID COM COMA valor) PAR_C;

operacion: (valor reformular valor ES valor | reformular valor);

reformular: SUMAR | RESTAR | DIVIDIR | MULTIPLICAR | RESTO;

pregunta: IF PAR_A valor comparacion valor PAR_C LLAV_A sinElse LLAV_C;

sinElse: (sentencias+ LLAV_C ELSE LLAV_A sentencias+ | sentencias+);

comparacion: IGUAL | MAYOR | MENOR;

iteracion: iter_for | iter_while;

iter_while: WHILE PAR_A condicion PAR_C LLAV_A sentencias+ LLAV_C;

iter_for: FOR PAR_A ID ES NUM SC condicion SC recorrer PAR_C LLAV_A sentencias+ LLAV_C;

condicion: valor ( IGUAL | MAYOR | MENOR ) valor | valor ( IGUAL | MAYOR | MENOR ) valor AND | valor ( IGUAL | MAYOR | MENOR ) valor OR ;

recorrer: ID ES ID (SUMAR | RESTAR) NUM;

tipo_dato: ENTERO | FLOTANTE | BOOL | CHAR;

valor:  NUM | TRUE | FALSE | ID ;

nombre: ID;




