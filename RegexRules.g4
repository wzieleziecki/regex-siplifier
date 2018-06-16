/**
 * Define a grammar called Hello
 */
grammar RegexRules;
// Parser Rules

regularExpr:    ((basicExpression|alternativeExpression|parentheseExpression|bracketExpression|matchCountExpression)+ NEWLINE)+
	| (alternativeExpression NEWLINE)+; 
//1.wyrazenie nawiasowe
//alternvativeExpr : 
parentheseExpression: LEFT_PARENTHESE (parentheseExpression|bracketExpression|matchCountExpression|basicExpression)+ RIGHT_PARENTHESE (LAST_TOKEN)?
					| LEFT_PARENTHESE (alternativeExpression) RIGHT_PARENTHESE (LAST_TOKEN)?; 

//2.alternatywa
//no avaible alternativeExpression as a sub-expression - problem with parsing
//maybe alternativeExpr could have alternativeExpr only on left/right side ??
alternativeExpression: ( parentheseExpression|basicExpression|matchCountExpression|bracketExpression)+ 
	ALTERNATIVE (parentheseExpression|basicExpression|matchCountExpression|bracketExpression)+
	|alternativeExpression ALTERNATIVE (parentheseExpression|basicExpression|matchCountExpression|bracketExpression)+; // maybe change for [basicExpression bracketExpression] ALTERNATIVE ... ?
	
//3.liczbawystapien abc{3,5}
matchCountExpression:    basicExpression rangeOccurence
					|	 bracketExpression rangeOccurence
					|	 parentheseExpression rangeOccurence;
rangeOccurence: LEFT_BRACE NUMBER COMMA NUMBER RIGHT_BRACE
			  | LEFT_BRACE NUMBER COMMA  RIGHT_BRACE;

//4.jeden element z przedzialu [a-b]
bracketExpression:LEFT_BRACKET CARET? (range | matchCountExpression | basicExpression | parentheseExpression | bracketExpression | alternativeExpression )+ RIGHT_BRACKET (LAST_TOKEN)?; //no () basicExpression, neither Alternative basicExpression, no nested bracketExpression
//zakres a-b
range: LETTER DASH LETTER ; 

//5.wyrazenie a*
//add range|bracketExpression|paretheseExpression|alternativeExpression
basicExpression:  LETTER (LAST_TOKEN)?
            | DOT (LAST_TOKEN)?;
            // ab.c.sfd.f*
		//basicExpression => abc | LETTER LAST_TOKEN

// Lexer Rules
WHITESPACE : ( '\t' | ' ' | '\u000C' )+ -> skip ;

NEWLINE : [\r\n]+ ;

LETTER : [a-z];

LEFT_BRACKET : '[' ;
 
RIGHT_BRACKET : ']' ;

LEFT_PARENTHESE : '(' ;

RIGHT_PARENTHESE : ')' ;
 
STAR : '*' ;

EMPTY : '@' ;

DOT : '.' ;

DASH : '-' ;

//caret for start indication and negation(eg. ^abc - not a "a","b","c")
CARET : '^' ;

END : '$' ;

LEFT_BRACE : '{' ;

RIGHT_BRACE : '}' ;

COMMA : ','; 

NUMBER : [1-9][0-9]* | '0' ; 

LAST_TOKEN: '*' | '+' | '?' ; 

//All token below can be replaced using token upwards

PLUS : '+' ;

QUESTION_MARK : '?';

ALTERNATIVE : '|';


