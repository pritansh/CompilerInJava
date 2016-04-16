
.class public Demo
.super java/lang/Object
.method static public main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 4
istore 0
ldc 7
istore 1
Label0:
iload 0
ldc 3
iadd
iload 1
if_icmpeq True0
goto EndIf0
True0:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
iload 0
ldc 1
iadd
istore 0
goto Label0
EndIf0:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
return
.end method