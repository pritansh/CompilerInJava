package pc.compiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pc.parser.PCLexer;
import pc.parser.PCParser;

public class Main {

	private static String path = "cd \"C:\\Users\\Kinshu\\workspace\\CompilerInJava\\Compiler\"";
	private static String compile = "&& java -jar lib/jasmin.jar Demo.j";
	private static String run = "&& java Demo";
	
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRFileStream("code.pc");
		PCLexer lexer = new PCLexer(input);
		CommonTokenStream tokens = new  CommonTokenStream(lexer);
		PCParser parser = new PCParser(tokens);
		ParseTree tree = parser.program();
		new Compiler("Demo.j").visit(tree);    //Begins the creation of .j File
		runProcess(compile);
		runProcess(run);
	}
	
	//Function for compiling and executing .j file
	public static void runProcess(String type) {
		ProcessBuilder process = new ProcessBuilder("cmd.exe","/c",path + type);
		process.redirectErrorStream(true);
		Process p = null;
		try {
			p = process.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		while(true) {
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(line==null)
				break;
			System.out.println(line);
		}
	}

}
