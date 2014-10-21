/**
 * CLite Grammatik
 */
grammar CLite;
//
//ERROR: grammar 'CLite' has no rules
// TODO Parser Regeln erstellen!
//

// Lexikalische Ebene
// Identifier -> Letter { Letter | Digit }
Identifier
    : LETTER (LETTER|DIGIT)*
    ;

// Letter -> a | b | ... | z | A | B | ... | Z 
LETTER
    : [a-zA-Z]
    ;

// Digit ->   0 | 1 | ... | 9    
DIGIT 
    : [0-9]
    ;

// Literal -> Integer | Boolean | Float | Char
LITERAL
    : IntegerType | BooleanType | FloatType | CharType
    ;

// Integer -> Digit { Digit }    
IntegerType
    : DIGIT+
    ;

// Boolean -> true | False
BooleanType
    : ('true'|'false')
    ;

// Float -> Integer . Integer    
FloatType
    : IntegerType '.' IntegerType
    ;

// Char -> ‘ ASCII Char ‘
// Hinweis: da müsste ich noch dran arbeiten
// die folgende Spezifikation habe ich grob 
// aus der ANTLR Grammatik für Java 4 übernommen
// http://jknack.github.io/antlr4ide/Java/Javav4.g4.html#CharacterLiteral  
CharType
    :
 	CharLiteral
    ;
 
CharacterLiteral 
 	: 
 	'\'' SingleCharacter '\''
 	;

SingleCharacter 
	: 
	~['\\] ; 	 
	  
CharLiteral
	:
	'a'..'z' 
	| 'A'..'Z'
	|'0'..'9'
;
 
WS
    : (' ' | '\t' | '\n' | '\r')+ { skip();}
    ;

COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;
 

