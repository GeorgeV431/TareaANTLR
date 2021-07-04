grammar ParserDND;
import LexerDND;

program: BEGIN LLAVIZQ sentencias* LLAVDER END;

sentencias: declaracion
			| asignacion 
			| readSentence
			| iteracion
			| pregunta 
			| operacion
			| printSentence
			| comentario ;

comentario: COMENTARIOS;

declaracion: tipo_dato nombre ES valor | tipo_dato nombre ES operacion | tipo_dato nombre | tipo_dato nombre ES NUM ;

asignacion: nombre ES valor | valor ES  operacion;

readSentence: READ PARIZQ nombre PARDER;

printSentence: PRINTLN PARIZQ (COM ID COM | valor | COM ID COM COMA valor) PARDER;

operacion: (valor reformular valor);	//this is weird

reformular: SUMAR | RESTAR | DIVIDIR | MULTIPLICAR | RESTO;

pregunta: IF PARIZQ valor comparacion valor PARDER LLAVIZQ sinElse LLAVDER;

sinElse: (sentencias+ LLAVDER ELSE LLAVIZQ sentencias+ | sentencias+);

comparacion: IGUAL | MAYOR | MENOR | NOTIGUAL | MAYORIGUAL | MENORIGUAL;

iteracion: iter_for | iter_while;

iter_while: WHILE PARIZQ condition PARDER LLAVIZQ sentencias+ LLAVDER;

iter_for: FOR PARIZQ ID ES NUM SEMIC condition SEMIC recorrer PARDER LLAVIZQ sentencias+ LLAVDER;

condition: valor ( IGUAL | MAYOR | MENOR | NOTIGUAL | MAYORIGUAL | MENORIGUAL ) valor | valor ( IGUAL | MAYOR | MENOR | NOTIGUAL | MAYORIGUAL | MENORIGUAL ) valor AND | valor ( IGUAL | MAYOR | MENOR | NOTIGUAL | MAYORIGUAL | MENORIGUAL ) valor OR ;

recorrer: ID ES ID (SUMAR | RESTAR) NUM;

tipo_dato: ENTERO | FLOTANTE | BOOLEAN | STRING;

valor:  NUM | TRUE | FALSE | ID ;

nombre: ID;




