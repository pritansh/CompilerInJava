# CompilerInJava
Basic compiler written in java

##How to run this :-

####Using Eclipse -

Import project into eclipse and edit code in CompilerInJava/Compiler/code.pc and compile Main.java to execute.

####Alternate Method -

Run either .bat (WINDOWS) or .sh(LINUX) to automatically execute the code and see output. After first execution of the script, a code.pc file will be created in the current directory. Edit code in this file and execute script to see the output.

####This includes:- 

######Basic operations like +(addition), -(subtraction), *(multiplication), /(division)

######Data types and variables (integer, float, string)

######Arrays for data types (integer, float, string)

######Control Statements -> If-else, while loop

####Examples :-

>For integer 
	
	a = 4

>For float 
	
	a=4.2
  
>For string
	
	a="Hello World"
  
####Implicit Functions

>print()  -- print function
  	
  	print("Hello World")
  	Result :- Hello World
  
>println() -- println function --> prints the data then move to the newline
  	
  	println(3+5.3)
  	Result :-  8.3
  
####String Manipulation : -

>String concatenation
  	
  	str="Hello " + 4.5
  	println(str)
  	Result :- Hello 4.5
        OR
  	str="Hello "
  	str=str+"World "+4
  	println(str)
  	Result :- Hello World 4
  
>String Repeat
  	
  	str="Hello"*3
  	println(str)
  	Result :- HelloHelloHello
        OR
  	str="hello"
  	str=str*4
  	println(str)
  	Resutl :- hellohellohellohello
####If-else : -

For integer and float -> ==,!=,>=,<=,>,<, null,!null

For string -> null,!null,==,!= (memory reference)

>null and !null 

	str="Hello"
	if str null:
		println("null")
	else: if str!null:
		println("not null")
	else:
		println("not deined")
	;
	Result :- not null

>Basic if-else

	a=4
	b=3
	if a>b:
		println(a)
	else:
		println(b)
	;
	Result :- 4
	
>Nested If-else
	
	a=4.5
	b=6.5
	if a>=b:
		if a==b:
			println(a)
		else:
			println(b)
	else: if a<b:
		println("B"+b)
		println("greater than A"+a)
	else:
		println("Not")
	;
	Result :- B6.5
		  greater than A4.5

####Loops : -

>while loop

	a=4
	b=9
	while a<=b:
		println(a)
		a=a+1
	;
	println(a)
	Result :- 4
		  5
		  6
		  7
		  8
		  9
		  10

####Arrays : -

######~~Bugs :-~~ 
>~~Printing array values along with string does not work but works for integer and float~~

>~~Assigning a value to a float array value does not work for (float + variable) but works for (variable + float)~~

######Examples :-
>For integer

	a=[2]i
	a::0=1
	a::1=2
	println(a::0)
	println(a::1)
	Resutl :- 1
		  2
		  
>For float

	a=[5]f
	b=0
	while b<5:
		a::b=b+4.5
		println(a::b)
		b=b+1
	;
	Result :- 4.5
		  5.5
		  6.5
		  7.5
		  8.5

>For string

	a=[5]S
	b=0
	while b<5:
		a::b="Hello"+b
		println(a::b)
		b=b+1
	;
	Result :- Hello0
		  Hello1
		  Hello2
		  Hello3
		  Hello4
