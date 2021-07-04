grammar ParserDND;
import LexerDND;

program: BEGIN statement* END;

statement: declaracion SEMIC
			| asignacion SEMIC
			| readSentence SEMIC
			| iteracion SEMIC
			| pregunta SEMIC
			| operacion SEMIC
			| printSentence SEMIC
			| comentario ;

comentario: COMENTARIOS;

declaracion: tipo_dato nombre ES valor | tipo_dato nombre ES operacion | tipo_dato nombre ;

asignacion: nombre ES valor | nombre ES  operacion;

readSentence: READ PARIZQ nombre PARDER;

printSentence: PRINTLN PARIZQ (COM valor COM | nombre | COM ID COM COMA valor) PARDER;

operacion: (valor reformular valor);	//this is weird

reformular: SUMAR | RESTAR | DIVIDIR | MULTIPLICAR | RESTO;

pregunta: IF PARIZQ valor comparacion valor PARDER LLAVIZQ sinElse LLAVDER;

sinElse: (statement+ LLAVDER ELSE LLAVIZQ statement+ | statement+);

comparacion: IGUAL | MAYOR | MENOR | NOTIGUAL | MAYORIGUAL | MENORIGUAL;

iteracion: iter_for | iter_while;

iter_while: WHILE PARIZQ condition PARDER LLAVIZQ statement+ LLAVDER;

iter_for: FOR PARIZQ ID ES NUM SEMIC condition SEMIC recorrer PARDER LLAVIZQ statement+ LLAVDER;

condition: valor comparacion valor | valor comparacion valor AND condition | valor comparacion valor OR condition;

recorrer: ID ES ID (SUMAR | RESTAR) NUM;

tipo_dato: ENTERO | FLOTANTE | BOOLEAN | STRING;

valor:  NUM | TRUE | FALSE | ID ;

nombre: ID;




