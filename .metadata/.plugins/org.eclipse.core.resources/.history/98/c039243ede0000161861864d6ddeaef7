grammar PC;

program : printStatement+
		;

printStatement : 'print(' exp=expression ')'   #Print
			   | 'println(' exp=expression ')' #Println
			   ;
			   
expression : leftExp=expression '/' rightExp=expression #Divide
		   | leftExp=expression '*' rightExp=expression #Multiply
		   | leftExp=expression '-' rightExp=expression #Subtract
		   | leftExp=expression '+' rightExp=expression #Add
		   | digit=DIGIT								#Digit
		   ;
		   
DIGIT : [0-9]+;