
.class public Demo
.super java/lang/Object
.method static public main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 4.3
fstore 0
ldc 4.3
ldc 4.5
fstore 1
ldc 4.5
ldc 4
i2f
fstore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 0
fload 1
fadd
fload 2
fadd
invokevirtual java/io/PrintStream/println(F)V
return
.end method