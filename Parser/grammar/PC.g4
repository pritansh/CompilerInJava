grammar PC;

program : programPart+;

programPart : printStatement
		    | variableDefinition
		    | newLine
		    ;

printStatement : 'print(' exp=expressions ')' #Print
			   | 'println(' exp=expressions ')' #Println
			   ;

variableDefinition : var=IDENTIFIER '=' exp=expressions ',' variableDefinition #MultipleVariable
				   | var=IDENTIFIER '=' exp=expressions #LastVariable
				   ;	
				   
expressions : stringExpression+
			| expression+
			;	   
			
stringExpression : stringRead
				 | stringConcat
				 | stringMultiply
				 ;
				 
stringConcat : var=IDENTIFIER '+' right=stringConcat #StringAdd
			 | str=STRING #StringAddString
			 | digit=DIGIT #StringAddDigit
			 | decimal=DECIMAL #StringAddDecimal
			 ;
			 
stringMultiply : var=IDENTIFIER '*' digit=DIGIT #StringRepeat
			   ;	
			   
stringRead : str=STRING #String
		   ;
			   
expression : leftExp=expression '/' rightExp=expression #Divide
		   | leftExp=expression '*' rightExp=expression #Multiply
		   | leftExp=expression '-' rightExp=expression #Subtract
		   | leftExp=expression '+' rightExp=expression #Add
		   | digit=DIGIT #Digit
		   | decimal=DECIMAL #Decimal
		   | var=IDENTIFIER #Variable
		   ;
		   
newLine : '\n' #Line
		;
		   
DIGIT : [0-9]+;
DECIMAL : [0-9]+ '.' [0-9]+;
STRING : '"'[a-zA-Z0-9\n\r\t ]*'"';
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]*;
WHITESPACE : [\r\t ]->skip;