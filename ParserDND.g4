grammar ParserDND;
import LexerDND;

program: BEGIN statement* END;

statement: declaracion SEMIC
			| asignacion SEMIC
			| readSentence SEMIC
			| pregunta SEMIC
			| printSentence SEMIC
			| iter_while SEMIC
			| iter_for SEMIC
			| printSentence SEMIC
			| comentario ;

comentario: COMENTARIOS;

declaracion: tipo_dato asignacion | tipo_dato nombre ;

asignacion: nombre ES (valor|nombre) | nombre ES  operacion | nombre ES funcion ;

funcion: (COS | SIN | TAN | ABS) PARIZQ (valor|nombre) PARDER;

readSentence: READ PARIZQ nombre PARDER;

printSentence: PRINTLN PARIZQ ( valor | nombre | valor COMA nombre) PARDER;

operacion: ((valor|nombre) reformular (valor|nombre));	//this is weird

reformular: SUMAR | RESTAR | DIVIDIR | MULTIPLICAR | RESTO;

pregunta: IF PARIZQ condition PARDER LLAVIZQ sinElse LLAVDER;

sinElse: (if_block LLAVDER ELSE LLAVIZQ if_block | if_block);

if_block: statement+;

else_block: statement+;

comparacion: IGUAL | MAYOR | MENOR | NOTIGUAL | MAYORIGUAL | MENORIGUAL;

iter_while: WHILE PARIZQ condition PARDER LLAVIZQ statement+ LLAVDER;

iter_for: FOR PARIZQ nombre ES NUM SEMIC condition SEMIC recorrer PARDER LLAVIZQ statement+ LLAVDER;

condition: (valor|nombre) comparacion (valor|nombre) | (valor|nombre) comparacion (valor|nombre) AND condition | (valor|nombre) comparacion (valor|nombre) OR condition;

recorrer: nombre ES nombre (SUMAR | RESTAR) NUM;

tipo_dato: ENTERO | BOOLEAN | STRING;

valor:  NUM | TRUE | FALSE | STRING_LITERAL ;

nombre: ID;




