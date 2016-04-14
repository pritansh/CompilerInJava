// Generated from PC.g4 by ANTLR 4.5.1
package pc.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramPart(PCParser.ProgramPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link PCParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PCParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Println}
	 * labeled alternative in {@link PCParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(PCParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleVariable}
	 * labeled alternative in {@link PCParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleVariable(PCParser.MultipleVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LastVariable}
	 * labeled alternative in {@link PCParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastVariable(PCParser.LastVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(PCParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(PCParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Digit}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(PCParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(PCParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(PCParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(PCParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PCParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Line}
	 * labeled alternative in {@link PCParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(PCParser.LineContext ctx);
}