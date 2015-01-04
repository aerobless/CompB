grammar LexikalischeAusdrücke;

/*Identifier --> Letter{Letter | Digit}*/
identifier
	: LETTER (LETTER|DIGIT)*
	;
	
/*Letter -> a|b|..|z|A|B|..|Z*/
LETTER
	: 'a'..'z'|'A'..'Z' /*Unklar ob korrekt, keine Lösung */
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