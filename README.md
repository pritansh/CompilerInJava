# CompilerInJava
Basic compiler written in java

##How to run this :-

####Using Eclipse -

Import project into eclipse and edit code in CompilerInJava/Compiler/code.pc and compile Main.java to execute.

####Alternate Method -

Run either .bat (WINDOWS) or .sh(LINUX) to automatically execute the code and see output. After first execution of the script, a code.pc file will be created in the current directory. Edit code in this file and execute script to see the output.

####This includes:- 

######Basic operations like +(addition), -(subtraction), *(multiplication), /(division)

######Data types and variables 

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
