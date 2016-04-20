package pc.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import pc.compiler.errors.VariableNotDefined;
import pc.compiler.helper.Helper;
import pc.compiler.symbolTable.SymbolTableNode;
import pc.parser.PCBaseVisitor;
import pc.parser.PCParser.AddContext;
import pc.parser.PCParser.ArrayDigitContext;
import pc.parser.PCParser.ArrayIndexVarContext;
import pc.parser.PCParser.ArrayIndexVariableContext;
import pc.parser.PCParser.ArrayVarContext;
import pc.parser.PCParser.ArrayVariableContext;
import pc.parser.PCParser.DecimalContext;
import pc.parser.PCParser.DigitContext;
import pc.parser.PCParser.DivideContext;
import pc.parser.PCParser.EqualContext;
import pc.parser.PCParser.HighContext;
import pc.parser.PCParser.HighEqualContext;
import pc.parser.PCParser.IfElseContext;
import pc.parser.PCParser.LastVariableContext;
import pc.parser.PCParser.LessContext;
import pc.parser.PCParser.LessEqualContext;
import pc.parser.PCParser.LineContext;
import pc.parser.PCParser.MultipleVariableContext;
import pc.parser.PCParser.MultiplyContext;
import pc.parser.PCParser.NotEqualContext;
import pc.parser.PCParser.NotNullContext;
import pc.parser.PCParser.NullContext;
import pc.parser.PCParser.PrintContext;
import pc.parser.PCParser.PrintlnContext;
import pc.parser.PCParser.ProgramContext;
import pc.parser.PCParser.StringAddConcatContext;
import pc.parser.PCParser.StringAddContext;
import pc.parser.PCParser.StringAddDecimalContext;
import pc.parser.PCParser.StringAddDigitContext;
import pc.parser.PCParser.StringAddStringContext;
import pc.parser.PCParser.StringAddVarContext;
import pc.parser.PCParser.StringAddVariableContext;
import pc.parser.PCParser.StringArrayDigitContext;
import pc.parser.PCParser.StringArrayVariableContext;
import pc.parser.PCParser.StringContext;
import pc.parser.PCParser.StringRepeatStringContext;
import pc.parser.PCParser.StringRepeatVarContext;
import pc.parser.PCParser.SubtractContext;
import pc.parser.PCParser.VariableContext;
import pc.parser.PCParser.WhileContext;

public class Compiler extends PCBaseVisitor<String>{

	private File file = null;
	private FileWriter fw = null;
	private String type, prevType;
	private boolean floatBool = false;
	private Helper helper;
	private HashMap<String,SymbolTableNode> symbolTable = new HashMap<>();
	private int lineNumber = 1, branchCount = -1, arrayCount = 0;
	String begPrint = "\ngetstatic java/lang/System/out Ljava/io/PrintStream;"; 
	String endPrint = "\ninvokevirtual java/io/PrintStream/print";
	
	public Compiler(String fileName) throws IOException {
		file = new File(fileName);
		fw = new FileWriter(file);
		helper = new Helper(fw);
		String temp = "\n.class public Demo\n.super java/lang/Object" + 
						"\n.method static public main([Ljava/lang/String;)V" + 
						"\n.limit stack 100\n.limit locals 100";
		fw.write(temp);
	}
	
	private void appendToFile(String instructions) {
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
		if(type!=null && type.equals("Ljava/lang/String;"))
			appendToFile(type + ")V");
		else
			appendToFile(type.toUpperCase() + ")V");
		return null;
	}
	
	public String visitPrintln(PrintlnContext ctx) {
		appendToFile(begPrint);
		visit(ctx.exp);
		appendToFile(endPrint + "ln(");
		if(type!=null && type.equals("Ljava/lang/String;"))
			appendToFile(type + ")V");
		else if(type!=null)
			appendToFile(type.toUpperCase() + ")V");
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
	
	public String visitStringAddVariable(StringAddVariableContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			type = tmp.getType();
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			appendToFile("\nnew java/lang/StringBuilder");
			appendToFile("\ndup\ninvokespecial java/lang/StringBuilder/<init>()V");
			appendToFile("\n" + type + "load " + tmp);
			appendToFile("\ninvokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
			visit(ctx.right);
			appendToFile("\ninvokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
			type = "Ljava/lang/String;";
		}
		return null;
	}
	
	public String visitStringAdd(StringAddContext ctx) {
		type = "a";
		appendToFile("\nnew java/lang/StringBuilder");
		appendToFile("\ndup\ninvokespecial java/lang/StringBuilder/<init>()V");
		appendToFile("\nldc " + ctx.str.getText());
		appendToFile("\ninvokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
		visit(ctx.right);
		appendToFile("\ninvokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
		type = "Ljava/lang/String;";
		return null;
	}
	
	public String visitStringAddConcat(StringAddConcatContext ctx) {
		visit(ctx.left);
		visit(ctx.right);
		return null;
	}

	public String visitStringArrayDigit(StringArrayDigitContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			type = tmp.getType();
			appendToFile("\naload " + tmp);
			appendToFile("\nldc " + ctx.digit.getText());
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			appendToFile("\n" + type + "aload");
			if(type.equals("a"))
				type = "Ljava/lang/String;";
			appendToFile("\ninvokevirtual java/lang/StringBuilder/append(" + type + ")Ljava/lang/StringBuilder;");
		}
		return null;
	}
	
	public String visitStringArrayVariable(StringArrayVariableContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			type = tmp.getType();
			appendToFile("\n" + type + "load " + tmp);
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			appendToFile("\n" + type + "aload");
			if(type.equals("a"))
				type = "Ljava/lang/String;";
			appendToFile("\ninvokevirtual java/lang/StringBuilder/append(" + type + ")Ljava/lang/StringBuilder;");
		}
		return null;
	}
	
	public String visitStringAddVar(StringAddVarContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			type = tmp.getType();
			appendToFile("\n" + type + "load " + tmp);
			if(!type.equals("Ljava/lang/String;"))
				type = type.toUpperCase();
			appendToFile("\ninvokevirtual java/lang/StringBuilder/append(" + type + ")Ljava/lang/StringBuilder;");
		}
		return null;
	}
	
	public String visitStringAddDigit(StringAddDigitContext ctx) {
		type = "i";
		appendToFile("\nldc " + ctx.digit.getText());
		if(!type.equals("Ljava/lang/String;"))
			type = type.toUpperCase();
		appendToFile("\ninvokevirtual java/lang/StringBuilder/append(" + type + ")Ljava/lang/StringBuilder;");
		return null;
	}
	
	public String visitStringAddDecimal(StringAddDecimalContext ctx) {
		type = "f";
		appendToFile("\nldc " + ctx.decimal.getText());
		if(!type.equals("Ljava/lang/String;"))
			type = type.toUpperCase();
		appendToFile("\ninvokevirtual java/lang/StringBuilder/append(" + type + ")Ljava/lang/StringBuilder;");
		return null;
	}
	
	public String visitStringAddString(StringAddStringContext ctx) {
		type = "Ljava/lang/String;";
		appendToFile("\nldc " + ctx.str.getText());
		appendToFile("\ninvokevirtual java/lang/StringBuilder/append(" + type + ")Ljava/lang/StringBuilder;");
		return null;
	}
	
	public String visitStringRepeatVar(StringRepeatVarContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			type = tmp.getType();
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			Helper helper = new Helper(fw);
			helper.repeatString(""+tmp, true, false, 0, 99);
			int count = Integer.parseInt(ctx.digit.getText());
			for(int i=1;i<count;i++) 
				helper.repeatString(""+tmp, false, true, count-1-i, 99);
		}
		return null;
	}
	
	public String visitStringRepeatString(StringRepeatStringContext ctx) {
		type = "a";
		appendToFile("\nldc " + ctx.str.getText());
		appendToFile("\nastore " + (symbolTable.size()+1));
		appendToFile("\naload " + (symbolTable.size()+1));
		appendToFile("\nastore " + (symbolTable.size()+2));
		int count = Integer.parseInt(ctx.digit.getText());
		for(int i=1;i<count;i++)
			helper.repeatString(""+(symbolTable.size()+1), false, true, count-1-i, (symbolTable.size()+2));
		return null;
	}
	
	public String visitVariable(VariableContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			prevType = type;
			type = tmp.getType();
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			if(!floatBool && type.equals("f") && prevType!=null && prevType.equals("i"))
				appendToFile("\ni2f");
			if(prevType.equals("f"))
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
		if(type!=null && type.equals("Ljava/lang/String;"))
			type = "a";
		appendToFile("\n" + type.toLowerCase() + "store " + symbolTable.get(ctx.var.getText()));
		return null;
	}
	
	public String visitArrayVariable(ArrayVariableContext ctx) {
		if(symbolTable.get(ctx.var.getText())==null) {
			String temp = ctx.data.getText();
			if(temp.equals("i"))
				type = "i";
			else if(temp.equals("f"))
				type = "f";
			else if(temp.equals("S"))
				type = "Ljava/lang/String;";
			arrayCount = symbolTable.size();
			symbolTable.put(ctx.var.getText(), new SymbolTableNode(ctx.var.getText(), type, symbolTable.size()));
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			appendToFile("\nbipush " + ctx.digit.getText() + "\n");
			if(type.equals("a"))
				appendToFile("a");
			appendToFile("newarray ");
			if(type.equals("i"))
				appendToFile("int");
			else if(type.equals("f"))
				appendToFile("float");
			else if(type.equals("a"))
				appendToFile("java/lang/String");
			appendToFile("\nastore " + arrayCount);
		}
		return null;
	}
	
	public String visitArrayIndexVariable(ArrayIndexVariableContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			appendToFile("\naload " + tmp);
			appendToFile("\nldc " + ctx.digit.getText());
			visit(ctx.exp);
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			appendToFile("\n" + type + "astore ");
			if(type.equals("a"))
				type = "Ljava/lang/String;";
		}
		else
			throw new VariableNotDefined(ctx.getText(), ctx.var.getText(), lineNumber);
		return null;
	}
	
	public String visitArrayIndexVar(ArrayIndexVarContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			appendToFile("\naload " + tmp);
			if(symbolTable.get(ctx.index.getText())!=null) {
				SymbolTableNode temp= symbolTable.get(ctx.index.getText());
				appendToFile("\niload " + temp);
			}
			else
				throw new VariableNotDefined(ctx.getText(), ctx.index.getText(), lineNumber);
			visit(ctx.exp);
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			appendToFile("\n" + type + "astore ");
			if(type.equals("a"))
				type = "Ljava/lang/String;";
		}
		else
			throw new VariableNotDefined(ctx.getText(), ctx.var.getText(), lineNumber);
		return null;
	}
	
	public String visitArrayDigit(ArrayDigitContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			appendToFile("\naload " + tmp);
			type = tmp.getType();
			appendToFile("\nldc " + ctx.digit.getText());
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			appendToFile("\n" + type + "aload");
			if(type.equals("a"))
				type = "Ljava/lang/String;";
		}
		return null;
	}
	
	public String visitArrayVar(ArrayVarContext ctx) {
		if(symbolTable.get(ctx.var.getText())!=null) {
			SymbolTableNode tmp = symbolTable.get(ctx.var.getText());
			appendToFile("\naload " + tmp);
			type = tmp.getType();
			if(symbolTable.get(ctx.index.getText())!=null) {
				SymbolTableNode temp= symbolTable.get(ctx.index.getText());
				appendToFile("\niload " + temp);
			}
			else
				throw new VariableNotDefined(ctx.getText(), ctx.index.getText(), lineNumber);
			if(type.equals("Ljava/lang/String;"))
				type = "a";
			appendToFile("\n" + type + "aload");
			if(type.equals("a"))
				type = "Ljava/lang/String;";
		}
		return null;
	}
	
	public String visitEqual(EqualContext ctx) {
		visit(ctx.left);
		int fl=0;
		if(type.equals("f"))
			fl++;
		visit(ctx.right);
		if(type.equals("f") && fl==1)
			fl++;
		else if(type.equals("f") && fl==0)
			appendToFile("\nf2i");
		if(type.equals("Ljava/lang/String;")) 
			appendToFile("\nif_acmpeq ");
		else if(type.equals("i")) 
			appendToFile("\nif_icmpeq ");
		else if(fl==2) {
			appendToFile("\nfsub\nldc 0.5\nfadd\nf2i");
			appendToFile("\nifeq ");
		}
		return null;
	}
	
	public String visitNotEqual(NotEqualContext ctx) {
		visit(ctx.left);
		int fl=0;
		if(type.equals("f"))
			fl++;
		visit(ctx.right);
		if(type.equals("f") && fl==1)
			fl++;
		else if(type.equals("f") && fl==0)
			appendToFile("\nf2i");
		if(type.equals("Ljava/lang/String;")) 
			appendToFile("\nif_acmpne ");
		else if(type.equals("i")) 
			appendToFile("\nif_icmpne ");
		else if(fl==2) {
			appendToFile("\nfsub\nldc 0.5\nfadd\nf2i");
			appendToFile("\nifne ");
		}
		return null;
	}
	
	public String visitHighEqual(HighEqualContext ctx) {
		visit(ctx.left);
		int fl=0;
		if(type.equals("f"))
			fl++;
		visit(ctx.right);
		if(type.equals("f") && fl==1)
			fl++;
		else if(type.equals("f") && fl==0)
			appendToFile("\nf2i");
		if(type.equals("i"))
			appendToFile("\nif_icmpge ");
		else if(fl==2) {
			appendToFile("\nfsub\nldc 0.5\nfadd\nf2i");
			appendToFile("\nifge ");
		}
		return null;
	}
	
	public String visitLessEqual(LessEqualContext ctx) {
		visit(ctx.left);
		int fl=0;
		if(type.equals("f"))
			fl++;
		visit(ctx.right);
		if(type.equals("f") && fl==1)
			fl++;
		else if(type.equals("f") && fl==0)
			appendToFile("\nf2i");
		if(type.equals("i")) 
			appendToFile("\nif_icmple ");
		else if(fl==2) {
			appendToFile("\nfsub\nldc 0.5\nfadd\nf2i");
			appendToFile("\nifle ");
		}
		return null;
	}
	
	public String visitHigh(HighContext ctx) {
		visit(ctx.left);
		int fl=0;
		if(type.equals("f"))
			fl++;
		visit(ctx.right);
		if(type.equals("f") && fl==1)
			fl++;
		else if(type.equals("f") && fl==0)
			appendToFile("\nf2i");
		if(type.equals("i")) 
			appendToFile("\nif_icmpgt ");
		else if(fl==2) {
			appendToFile("\nfsub\nldc 0.5\nfadd\nf2i");
			appendToFile("\nifgt ");
		}
		return null;
	}
	
	public String visitLess(LessContext ctx) {
		visit(ctx.left);
		int fl=0;
		if(type.equals("f"))
			fl++;
		visit(ctx.right);
		if(type.equals("f") && fl==1)
			fl++;
		else if(type.equals("f") && fl==0)
			appendToFile("\nf2i");
		if(type.equals("i")) 
			appendToFile("\nif_icmplt ");
		else if(fl==2) {
			appendToFile("\nfsub\nldc 0.5\nfadd\nf2i");
			appendToFile("\niflt ");
		}
		return null;
	}
	
	public String visitNull(NullContext ctx) {
		visit(ctx.exp);
		appendToFile("\nifnull ");
		return null;
	}
	
	public String visitNotNull(NotNullContext ctx) {
		visit(ctx.exp);
		appendToFile("\nifnonnull ");
		return null;
	}
	
	public String visitIfElse(IfElseContext ctx) {
		branchCount++;
		int branchNum = branchCount;
		visit(ctx.exp);
		appendToFile("True" + branchCount);
		visit(ctx.onFalse);
		appendToFile("\ngoto EndIf" + branchCount + "\nTrue" + branchNum + ":");
		visit(ctx.onTrue);
		appendToFile("\nEndIf" + branchNum + ":");
		return null;
	}
	
	public String visitWhile(WhileContext ctx) {
		branchCount++;
		int branchNum = branchCount;
		appendToFile("\nLabel" + branchNum + ":");
		visit(ctx.exp);
		appendToFile("True" + branchCount);
		appendToFile("\ngoto EndIf" + branchCount + "\nTrue" + branchNum + ":");
		visit(ctx.onTrue);
		appendToFile("\ngoto Label" + branchNum);
		appendToFile("\nEndIf" + branchNum + ":");
		return null;
	}
	
}
