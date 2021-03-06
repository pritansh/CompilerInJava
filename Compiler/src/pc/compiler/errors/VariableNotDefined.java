package pc.compiler.errors;

public class VariableNotDefined extends Error {

	private static final long serialVersionUID = -7404327109778284868L;

	public VariableNotDefined(String code, String variable, int line) {
		System.out.println(code);
		System.out.println("Error at line " + line + " : " + variable + " is not defined");
		System.exit(0);
	}
}
