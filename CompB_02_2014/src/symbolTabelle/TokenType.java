package symbolTabelle;

/*
 * Die Reihenfolge ist so, 
 * dass jedes reservierte Wort < EOF ist.
 */
public enum TokenType {
	Bool, 
	Char, 
	Else, 
	False, 
	Float, 
	If, 
	Int, 
	Main, 
	True, 
	While, 
	Eof, //was kleiner als EOF ist --> reserviertes Keyword.
	LeftBrace, RightBrace, 
	LeftBracket, RightBracket, LeftParen, RightParen, 
	Semicolon, Comma, Assign, Equals, Less, LessEqual, 
	Greater, GreaterEqual, Not, NotEqual, Plus, Minus, 
	Multiply, Divide, And, Or, Identifier, IntLiteral, 
	FloatLiteral, CharLiteral
}
