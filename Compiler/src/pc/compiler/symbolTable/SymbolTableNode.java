package pc.compiler.symbolTable;

public class SymbolTableNode {

	private String variable,type;
	private int id;
	
	public SymbolTableNode() {
		variable = null;
		type = null;
		id = 0;
	}
	
	public SymbolTableNode(String variable, String type, int id) {
		this.variable = variable;
		this.type = type;
		this.id = id;
	}
	
	public String toString() {
		return "" + id;
	}
	
	public void display() {
		System.out.println("SymbolData Entry : " + variable + "," + type + "," + id);
	}
	
	public String getType() {
		return type;
	}
	
	public String getVariable() {
		return variable;
	}
}
