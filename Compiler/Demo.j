
.class public Demo
.super java/lang/Object
.method static public main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 4
ldc 6.7
fadd
ldc 8.5
fadd
invokevirtual java/io/PrintStream/print(F)V
return
.end method