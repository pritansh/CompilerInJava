
.class public Demo
.super java/lang/Object
.method static public main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
bipush 5
newarray float
astore 0
ldc 0
istore 1
Label0:
iload 1
ldc 5
if_icmplt True0
goto EndIf0
True0:
aload 0
iload 1
iload 1
i2f
ldc 4.5
fadd
fastore 
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
iload 1
faload
ldc 4.3
fadd
invokevirtual java/io/PrintStream/println(F)V
iload 1
ldc 1
iadd
istore 1
goto Label0
EndIf0:
return
.end method