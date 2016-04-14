package pc.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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
import pc.parser.PCParser.StringContext;
import pc.parser.PCParser.SubtractContext;
import pc.parser.PCParser.VariableContext;

public class Compiler extends PCBaseVisitor<String>{

	private File file = null;
	private FileWriter fw = null;
	private String type, prevType;
	private boolean floatBool = false;
	private HashMap<String,SymbolTableNode> symbolTable = new HashMap<>();
	private int lineNumber = 1;
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
		appendToFile(endPrint + "(");
		if(type.equals("Ljava/lang/String;"))
			appendToFile(type + ")V");
		else
			appendToFile(type.toUpperCase() + ")V");
		return null;
	}
	
	public String visitPrintln(PrintlnContext ctx) {
		appendToFile(begPrint);
		visit(ctx.exp);
		appendToFile(endPrint + "ln(");
		if(type.equals("Ljava/lang/String;"))
			appendToFile(type + ")V");
		else
			appendToFile(type.toUpperCase() + ")V");
		return null;
	}
	
	public String visitAdd(AddContext ctx) {
		visitChildren(ctx);
		if(type!=null && !type.equals("Ljava/lang/String;"))
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
	
	public String visitDigit(DigitContext ctx) {
		appendToFile("\nldc " + ctx.digit.getText());
		if(type!=null && type.equals("Ljava/lang/String;"))
			prevType = "Ljava/lang/String;";
		if(type!=null && type.equals("f"))
			appendToFile("\ni2f");
		else
			type = "i";
		return null;
	}
	
	public String visitDecimal(DecimalContext ctx) {
		if(type!=null && type.equals("i"))
			appendToFile("\ni2f");
		type = "f";
		appendToFile("\nldc " + ctx.decimal.getText());
		return null;
	}
	
	public String visitString(StringContext ctx) {
		type = "Ljava/lang/String;";
		appendToFile("\nldc " + ctx.str.getText());
		return null;
	}
	
	public String visitVariable(VariableContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			type = tmp.getType();
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			if(!floatBool && type.equals("f") && prevType!=null && prevType.equals("i"))
				appendToFile("\ni2f");
			if(type.equals("f"))
				floatBool = true;
			appendToFile("\n" + type.toLowerCase() + "load " + tmp);
			if(type!=null && type.equals("i") && floatBool) {
				appendToFile("\ni2f");
				type = "f";
			}
			if(type.equals("a"))
				type="Ljava/lang/String;";
		}
		else 
			throw new VariableNotDefined(ctx.getText(), ctx.var.getText(), lineNumber);
		return null;
	}
	
	public String visitLine(LineContext ctx) {
		lineNumber++;
		type = null;
		prevType = null;
		floatBool = false;
		return null;
	}
	
	public String visitMultipleVariable(MultipleVariableContext ctx) {
		visit(ctx.exp);
		if(symbolTable.get(ctx.var.getText())==null) 
			symbolTable.put(ctx.var.getText(), new SymbolTableNode(ctx.var.getText(), type, symbolTable.size()));
		if(type.equals("Ljava/lang/String;"))
			type = "a";
		appendToFile("\n" + type.toLowerCase() + "store " + symbolTable.get(ctx.var.getText()));
		visitChildren(ctx);
		return null;
	}
	
	public String visitLastVariable(LastVariableContext ctx) {
		visit(ctx.exp);
		if(symbolTable.get(ctx.var.getText())==null) 
			symbolTable.put(ctx.var.getText(), new SymbolTableNode(ctx.var.getText(), type, symbolTable.size()));
		if(type.equals("Ljava/lang/String;"))
			type = "a";
		appendToFile("\n" + type.toLowerCase() + "store " + symbolTable.get(ctx.var.getText()));
		return null;
	}
	
}
