package pc.compiler.errors;

public class VariableAlreadyDefined extends Error {
	
	private static final long serialVersionUID = -3766661921229136369L;

	public VariableAlreadyDefined(String code, String variable, int line) {
		System.out.println(code);
		System.out.println("Error at line " + line + " : " + variable + " is already defined");
		System.exit(0);
	}
}
