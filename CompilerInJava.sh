if [ ! -e code.pc ];then
cp Compiler/code.pc .
fi
if [ -e classes ]; then
rm -rf classes
fi
if [ ! -e classes ];then
mkdir classes
mkdir classes/src
mkdir classes/lib
fi
javac -cp Parser/lib/antlr.jar -d classes/src/ Parser/src/pc/parser/*.java
javac -cp Parser/lib/antlr.jar:Parser/src/:Compiler/src/ -d classes/src/ Compiler/src/pc/compiler/*.java
cp code.pc classes/src/
cp Compiler/lib/jasmin.jar classes/lib/
cp Parser/lib/antlr.jar classes/lib/
cd classes/src/
java -cp .:../lib/antlr.jar pc.compiler.Main
java -jar ../lib/jasmin.jar Demo.j
java Demo
sleep 5
