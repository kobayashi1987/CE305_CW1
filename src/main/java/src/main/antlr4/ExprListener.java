// Generated from src/main/antlr4/Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(ExprParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(ExprParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(ExprParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(ExprParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ExprParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ExprParser.PrimaryExprContext ctx);
}