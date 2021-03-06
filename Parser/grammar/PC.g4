grammar PC;

program : programPart+;

programPart : printStatement
		    | variableDefinition
		    | newLine
		    | whileLoop
		    | conditionStatement
		    ;

printStatement : 'print(' exp=expressions ')' #Print
			   | 'println(' exp=expressions ')' #Println
			   ;

variableDefinition : var=IDENTIFIER '=' exp=expressions ',' variableDefinition #MultipleVariable
				   | var=IDENTIFIER '=' exp=expressions #LastVariable
				   | var=IDENTIFIER '=[' digit=DIGIT ']' data=type #ArrayVariable
				   | var=IDENTIFIER '::' digit=DIGIT '=' exp=expressions #ArrayIndexVariable
				   | var=IDENTIFIER '::' index=IDENTIFIER '=' exp=expressions #ArrayIndexVar
				   ;	
				   
type : 'i'
	 | 'f'
	 | 'S'
	 ;
				   
whileLoop : 'while ' exp=expressions ':' onTrue=block ';' #While
		  ;
				   
conditionStatement : 'if ' exp=expressions ':' onTrue=block 'else:' onFalse=block ';' #IfElse
				   ;
				   
block : programPart+
	  ;
	 
conditionExpression : exp=expression ' null' #Null
					| exp=expression '!null' #NotNull
					| left=expression '==' right=expression #Equal
					| left=expression '!=' right=expression #NotEqual
					| left=expression '<=' right=expression #LessEqual
					| left=expression '>=' right=expression #HighEqual
					| left=expression '<' right=expression #Less
					| left=expression '>' right=expression #High
					;
				   
expressions : conditionExpression+
			| expression+
			| stringExpression+
			;	   

stringExpression : stringRead
				 | stringMultiply
				 | stringConcat
				 ;
				 
stringConcat : var=IDENTIFIER '+' right=stringConcatAdd #StringAddVariable
			 | str=STRING '+' right=stringConcatAdd #StringAdd
			 ;
			 
stringConcatAdd : left=stringConcatAdd '+' right=stringConcatAdd #StringAddConcat
		        | var=IDENTIFIER '::' digit=DIGIT #StringArrayDigit
		        | var=IDENTIFIER '::' index=IDENTIFIER #StringArrayVariable		  
				| var=IDENTIFIER #StringAddVar
			    | str=STRING #StringAddString
			    | digit=DIGIT #StringAddDigit
			    | decimal=DECIMAL #StringAddDecimal
			    ;
			 
stringMultiply : var=IDENTIFIER '*' digit=DIGIT #StringRepeatVar
			   | str=STRING '*' digit=DIGIT #StringRepeatString
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
		   | var=IDENTIFIER '::' digit=DIGIT #ArrayDigit
		   | var=IDENTIFIER '::' index=IDENTIFIER #ArrayVar
		   ;
		   
newLine : '\n' #Line
		;
		   
DIGIT : [0-9]+;
DECIMAL : [0-9]+ '.' [0-9]+;
STRING : '"'[a-zA-Z0-9\n\r\t ]*'"';
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]*;
WHITESPACE : [\r\t ]->skip;