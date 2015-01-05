grammar LexikalischeAusdrücke;

//PARSER REGELN beginnen mit Kleinbuchstaben
//Hier Hello Grammer als Beispiel:
r: 'hello' ID;
ID : [a-z]+;


//LEXIKALISCHE REGELN beginnt mit Grossbuchstaben
//Identifier --> Letter{Letter | Digit}
IDENTIFIER
	: LETTER (LETTER|DIGIT)*
	;
	
/*Letter -> a|b|..|z|A|B|..|Z*/
LETTER
	: [a-zA-Z]
	;

/*Digit -> 0|1|..|9 */
DIGIT
	: [0-9]
	;

/*Literal -> Integer|Boolean|Float|Char */
LITERAL
	: IntegerType|BooleanType|FloatType|CharType
	;

/*Integer -> Digit{Digit} */
IntegerType
	: DIGIT+ /*+ bedeutet einer oder mehrer */
	;
	
/*Boolean -> true|false*/
BooleanType
	: ('true'|'false')
	;
	
/*Float -> Integer.Integer */
FloatType
	: IntegerType '.' IntegerType
	;

/*Char -> 'ASCII Char' */
CharType
	: CharLiteral
	;
	
CharLiteral
	: 'a'..'z'|'A'..'Z'|'0'..'9'
	;

//Whitespaces und Comments ignorieren
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;