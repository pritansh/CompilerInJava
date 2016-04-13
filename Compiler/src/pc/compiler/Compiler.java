package pc.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import pc.compiler.errors.VariableAlreadyDefined;
import pc.compiler.errors.VariableNotDefined;
import pc.compiler.symbolTable.SymbolTableNode;
import pc.parser.PCBaseVisitor;
import pc.parser.PCParser.AddContext;
import pc.parser.PCParser.DecimalContext;
import pc.parser.PCParser.DigitContext;
import pc.parser.PCParser.DivideContext;
import pc.parser.PCParser.LastVariableContext;
import pc.parser.PCParser.LineContext;
import pc.parser.PCParser.MultipleVariableContext;
import pc.parser.PCParser.MultiplyContext;
import pc.parser.PCParser.PrintContext;
import pc.parser.PCParser.PrintlnContext;
import pc.parser.PCParser.ProgramContext;
import pc.parser.PCParser.SubtractContext;
import pc.parser.PCParser.VariableContext;

public class Compiler extends PCBaseVisitor<String>{

	private File file = null;
	private FileWriter fw = null;
	private String type;
	private String[] types = new String[64];
	private HashMap<String,SymbolTableNode> symbolTable = new HashMap<>();
	private int lineNumber = 1, typesIndex = 0;
	String begPrint = "\ngetstatic java/lang/System/out Ljava/io/PrintStream;"; 
	String endPrint = "\ninvokevirtual java/io/PrintStream/print";
	
	public Compiler(String fileName) throws IOException {
		file = new File(fileName);
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
		appendToFile(endPrint + "(" + type.toUpperCase() + ")V");
		return null;
	}
	
	public String visitPrintln(PrintlnContext ctx) {
		appendToFile(begPrint);
		visit(ctx.exp);
		appendToFile(endPrint + "ln(" + type.toUpperCase() + ")V");
		return null;
	}
	
	public String visitAdd(AddContext ctx) {
		visitChildren(ctx);
		appendToFile("\n" + type.toLowerCase() + "add");
		return null;
	}
	
	public String visitSubtract(SubtractContext ctx) {
		visitChildren(ctx);
		appendToFile("\n" + type.toLowerCase() + "sub");
		return null;
	}
	
	public String visitMultiply(MultiplyContext ctx) {
		visitChildren(ctx);
		appendToFile("\n" + type.toLowerCase() + "mul");
		return null;
	}
	
	public String visitDivide(DivideContext ctx) {
		visitChildren(ctx);
		appendToFile("\n" + type.toLowerCase() + "div");
		return null;
	}
	
	public String findType() {
		for(String temp:types) {
			if(temp!=null && temp.equals("f"))
				return temp;
		}
		return "i";
	}
	
	public String visitDigit(DigitContext ctx) {
		types[typesIndex] = new String("i");
		typesIndex++;
		type = findType();
		appendToFile("\nldc " + ctx.digit.getText());
		if(!type.equals("i"))
			appendToFile("\ni2f");
		return null;
	}
	
	public String visitDecimal(DecimalContext ctx) {
		types[typesIndex] = new String("f");
		typesIndex++;
		type = findType();
		appendToFile("\nldc " + ctx.decimal.getText());
		if(!type.equals("f"))
			appendToFile("\nf2i");
		return null;
	}
	
	public String visitVariable(VariableContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			type = tmp.getType();
			types[typesIndex] = new String(type);
			typesIndex++;
			appendToFile("\n" + type.toLowerCase() + "load " + tmp);
			if(type.equals("i"))
				appendToFile("\ni2f");
		}
		else 
			throw new VariableNotDefined(ctx.getText(), ctx.var.getText(), lineNumber);
		return null;
	}
	
	public String visitLine(LineContext ctx) {
		lineNumber++;
		type = null;
		types = new String[64];
		typesIndex = 0;
		return null;
	}
	
	public String visitMultipleVariable(MultipleVariableContext ctx) {
		return null;
	}
	
	public String visitLastVariable(LastVariableContext ctx) {
		visit(ctx.exp);
		if(symbolTable.get(ctx.var.getText())==null) 
			symbolTable.put(ctx.var.getText(), new SymbolTableNode(ctx.var.getText(), type, symbolTable.size()));
		else
			throw new VariableAlreadyDefined(ctx.getText(), ctx.var.getText(), lineNumber);
		appendToFile("\n" + type.toLowerCase() + "store " + symbolTable.get(ctx.var.getText()));
		return null;
	}
	
}
