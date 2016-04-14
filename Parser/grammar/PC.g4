grammar PC;

program : programPart+;

programPart : printStatement
		    | variableDefinition
		    | newLine
		    ;

printStatement : 'print(' exp=expression ')' #Print
			   | 'println(' exp=expression ')' #Println
			   ;

variableDefinition : var=IDENTIFIER '=' exp=expression ',' variableDefinition #MultipleVariable
				   | var=IDENTIFIER '=' exp=expression #LastVariable
				   ;		
			   
expression : leftExp=expression '/' rightExp=expression #Divide
		   | leftExp=expression '*' rightExp=expression #Multiply
		   | leftExp=expression '-' rightExp=expression #Subtract
		   | leftExp=expression '+' rightExp=expression #Add
		   | digit=DIGIT #Digit
		   | decimal=DECIMAL #Decimal
		   | var=IDENTIFIER #Variable
		   | str=STRING #String
		   ;
		   
newLine : '\n' #Line
		;
		   
DIGIT : [0-9]+;
DECIMAL : [0-9]+ '.' [0-9]+;
STRING : '"'[a-zA-Z0-9\n\r\t ]*'"';
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]*;
WHITESPACE : [\r\t ]->skip;