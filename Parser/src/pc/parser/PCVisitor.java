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
	 * Visit a parse tree produced by the {@code ArrayVariable}
	 * labeled alternative in {@link PCParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariable(PCParser.ArrayVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayIndexVariable}
	 * labeled alternative in {@link PCParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexVariable(PCParser.ArrayIndexVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayIndexVar}
	 * labeled alternative in {@link PCParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexVar(PCParser.ArrayIndexVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link PCParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(PCParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link PCParser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(PCParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link PCParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(PCParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotNull}
	 * labeled alternative in {@link PCParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNull(PCParser.NotNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link PCParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(PCParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link PCParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(PCParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqual}
	 * labeled alternative in {@link PCParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(PCParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HighEqual}
	 * labeled alternative in {@link PCParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighEqual(PCParser.HighEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link PCParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(PCParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code High}
	 * labeled alternative in {@link PCParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigh(PCParser.HighContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PCParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PCParser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(PCParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAddVariable}
	 * labeled alternative in {@link PCParser#stringConcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAddVariable(PCParser.StringAddVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAdd}
	 * labeled alternative in {@link PCParser#stringConcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAdd(PCParser.StringAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAddConcat}
	 * labeled alternative in {@link PCParser#stringConcatAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAddConcat(PCParser.StringAddConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArrayDigit}
	 * labeled alternative in {@link PCParser#stringConcatAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayDigit(PCParser.StringArrayDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAddString}
	 * labeled alternative in {@link PCParser#stringConcatAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAddString(PCParser.StringAddStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAddVar}
	 * labeled alternative in {@link PCParser#stringConcatAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAddVar(PCParser.StringAddVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAddDigit}
	 * labeled alternative in {@link PCParser#stringConcatAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAddDigit(PCParser.StringAddDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringArrayVariable}
	 * labeled alternative in {@link PCParser#stringConcatAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayVariable(PCParser.StringArrayVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAddDecimal}
	 * labeled alternative in {@link PCParser#stringConcatAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAddDecimal(PCParser.StringAddDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringRepeatVar}
	 * labeled alternative in {@link PCParser#stringMultiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringRepeatVar(PCParser.StringRepeatVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringRepeatString}
	 * labeled alternative in {@link PCParser#stringMultiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringRepeatString(PCParser.StringRepeatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link PCParser#stringRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PCParser.StringContext ctx);
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
	 * Visit a parse tree produced by the {@code ArrayVar}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVar(PCParser.ArrayVarContext ctx);
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
	 * Visit a parse tree produced by the {@code ArrayDigit}
	 * labeled alternative in {@link PCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDigit(PCParser.ArrayDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Line}
	 * labeled alternative in {@link PCParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(PCParser.LineContext ctx);
}