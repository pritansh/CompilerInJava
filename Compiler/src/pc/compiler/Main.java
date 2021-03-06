package pc.compiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pc.parser.PCLexer;
import pc.parser.PCParser;

public class Main {

	private static String compile = "java -jar lib/jasmin.jar Demo.j";
	private static String run = "java Demo";
	
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRFileStream("code.pc");
		PCLexer lexer = new PCLexer(input);
		CommonTokenStream tokens = new  CommonTokenStream(lexer);
		PCParser parser = new PCParser(tokens);
		ParseTree tree = parser.program();
		//showTree(parser, tree);
		new Compiler("Demo.j").visit(tree);    //Begins the creation of .j File
		runProcess(compile);
		runProcess(run);
	}
	
	public static void showTree(PCParser parser,ParseTree tree)
	{
		JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,400);
        frame.setVisible(true);
	}
	
	//Function for compiling and executing .j file
	public static void runProcess(String type) {
		Process p = null;
		try {
			p = Runtime.getRuntime().exec(type);
		} catch (IOException e1) {
			e1.printStackTrace();
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
