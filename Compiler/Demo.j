
.class public Demo
.super java/lang/Object
.method static public main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
bipush 10
anewarray java/lang/String
astore 0
ldc 0
istore 1
Label0:
iload 1
ldc 10
if_icmplt True0
goto EndIf0
True0:
aload 0
ldc 0
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "Hello"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
iload 1
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
aastore 
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
ldc 0
aaload
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 1
ldc 1
iadd
istore 1
goto Label0
EndIf0:
return
.end method