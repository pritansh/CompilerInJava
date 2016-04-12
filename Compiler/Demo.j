
.class public Demo
.super java/lang/Object
.method static public main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 3
ldc 4
iadd
invokevirtual java/io/PrintStream/print(I)V
return
.end method