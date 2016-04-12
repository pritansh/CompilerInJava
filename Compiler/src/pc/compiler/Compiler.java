package pc.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import pc.parser.PCBaseVisitor;
import pc.parser.PCParser.AddContext;
import pc.parser.PCParser.DigitContext;
import pc.parser.PCParser.DivideContext;
import pc.parser.PCParser.MultiplyContext;
import pc.parser.PCParser.PrintContext;
import pc.parser.PCParser.PrintlnContext;
import pc.parser.PCParser.ProgramContext;
import pc.parser.PCParser.SubtractContext;

public class Compiler extends PCBaseVisitor<String>{

	private File file = null;
	private FileWriter fw = null;
	private char type = 'i';
	String begPrint = "\ngetstatic java/lang/System/out Ljava/io/PrintStream;"; 
	String endPrint = "\ninvokevirtual java/io/PrintStream/print";
	
	public Compiler(String fileName) throws IOException {
		file = new File("C:\\Users\\Kinshu\\workspace\\CompilerInJava\\Compiler\\" + fileName);
		fw = new FileWriter(file);
		String temp = "\n.class public Demo\n.super java/lang/Object" + 
						"\n.method static public main([Ljava/lang/String;)V" + 
						"\n.limit stack 100\n.limit locals 100";
		fw.write(temp);
	}
	
	public void appendToFile(String instructions) {
		try {
			fw.write(instructions);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String visitProgram(ProgramContext ctx) {
		visitChildren(ctx);
		try {
			fw.write("\nreturn\n.end method");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String visitPrint(PrintContext ctx) {
		appendToFile(begPrint);
		visit(ctx.exp);
		appendToFile(endPrint + "(" + Character.toUpperCase(type) + ")V");
		return null;
	}
	
	public String visitPrintln(PrintlnContext ctx) {
		appendToFile(begPrint);
		visit(ctx.exp);
		appendToFile(endPrint + "ln(" + Character.toUpperCase(type) + ")V");
		return null;
	}
	
	public String visitAdd(AddContext ctx) {
		visitChildren(ctx);
		appendToFile("\n" + Character.toLowerCase(type) + "add");
		return null;
	}
	
	public String visitSubtract(SubtractContext ctx) {
		visitChildren(ctx);
		appendToFile("\n" + Character.toLowerCase(type) + "sub");
		return null;
	}
	
	public String visitMultiply(MultiplyContext ctx) {
		visitChildren(ctx);
		appendToFile("\n" + Character.toLowerCase(type) + "mul");
		return null;
	}
	
	public String visitDivide(DivideContext ctx) {
		visitChildren(ctx);
		appendToFile("\n" + Character.toLowerCase(type) + "div");
		return null;
	}
	
	public String visitDigit(DigitContext ctx) {
		appendToFile("\nldc " + ctx.digit.getText());
		return null;
	}
	
}
