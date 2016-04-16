
.class public Demo
.super java/lang/Object
.method static public main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 4
istore 0
ldc 3
istore 1
iload 0
iload 1
if_icmpeq True0
iload 0
iload 1
if_icmpne True1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Not Equal"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto EndIf1
True1:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Not Equal Not"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
EndIf1:
goto EndIf1
True0:
ldc 1
ldc 3
if_icmpeq True2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Equal Not"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto EndIf2
True2:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Equal"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
EndIf2:
EndIf0:
return
.end method