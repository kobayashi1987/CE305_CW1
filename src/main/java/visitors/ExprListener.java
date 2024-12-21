// Generated from Expr.g4 by ANTLR 4.13.2
package main.java.visitors;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import main.java.visitors.ExprParser;
/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */

//
//public interface ExprListener extends ParseTreeListener {
//	/**
//	 * Enter a parse tree produced by {@link ExprParser#program}.
//	 * @param ctx the parse tree
//	 */
//	void enterProgram(ExprParser.ProgramContext ctx);
//	/**
//	 * Exit a parse tree produced by {@link ExprParser#program}.
//	 * @param ctx the parse tree
//	 */
//	void exitProgram(ExprParser.ProgramContext ctx);
//	/**
//	 * Enter a parse tree produced by {@link ExprParser#statement}.
//	 * @param ctx the parse tree
//	 */
//	void enterStatement(ExprParser.StatementContext ctx);
//	/**
//	 * Exit a parse tree produced by {@link ExprParser#statement}.
//	 * @param ctx the parse tree
//	 */
//	void exitStatement(ExprParser.StatementContext ctx);
//	/**
//	 * Enter a parse tree produced by {@link ExprParser#assignment}.
//	 * @param ctx the parse tree
//	 */
//	void enterAssignment(ExprParser.AssignmentContext ctx);
//	/**
//	 * Exit a parse tree produced by {@link ExprParser#assignment}.
//	 * @param ctx the parse tree
//	 */
//	void exitAssignment(ExprParser.AssignmentContext ctx);
//	/**
//	 * Enter a parse tree produced by the {@code FloatExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void enterFloatExpr(ExprParser.FloatExprContext ctx);
//	/**
//	 * Exit a parse tree produced by the {@code FloatExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void exitFloatExpr(ExprParser.FloatExprContext ctx);
//	/**
//	 * Enter a parse tree produced by the {@code MulDivExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void enterMulDivExpr(ExprParser.MulDivExprContext ctx);
//	/**
//	 * Exit a parse tree produced by the {@code MulDivExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void exitMulDivExpr(ExprParser.MulDivExprContext ctx);
//	/**
//	 * Enter a parse tree produced by the {@code VarExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void enterVarExpr(ExprParser.VarExprContext ctx);
//	/**
//	 * Exit a parse tree produced by the {@code VarExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void exitVarExpr(ExprParser.VarExprContext ctx);
//	/**
//	 * Enter a parse tree produced by the {@code IntExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void enterIntExpr(ExprParser.IntExprContext ctx);
//	/**
//	 * Exit a parse tree produced by the {@code IntExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void exitIntExpr(ExprParser.IntExprContext ctx);
//	/**
//	 * Enter a parse tree produced by the {@code ParenExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void enterParenExpr(ExprParser.ParenExprContext ctx);
//	/**
//	 * Exit a parse tree produced by the {@code ParenExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void exitParenExpr(ExprParser.ParenExprContext ctx);
//	/**
//	 * Enter a parse tree produced by the {@code AddSubExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void enterAddSubExpr(ExprParser.AddSubExprContext ctx);
//	/**
//	 * Exit a parse tree produced by the {@code AddSubExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 */
//	void exitAddSubExpr(ExprParser.AddSubExprContext ctx);
//}


public interface ExprListener extends ParseTreeListener {
	void enterProgram(ExprParser.ProgramContext ctx);
	void exitProgram(ExprParser.ProgramContext ctx);
	void enterStatement(ExprParser.StatementContext ctx);
	void exitStatement(ExprParser.StatementContext ctx);
	void enterAssignment(ExprParser.AssignmentContext ctx);
	void exitAssignment(ExprParser.AssignmentContext ctx);
	void enterFloatExpr(ExprParser.FloatExprContext ctx);
	void exitFloatExpr(ExprParser.FloatExprContext ctx);
	void enterMulDivExpr(ExprParser.MulDivExprContext ctx);
	void exitMulDivExpr(ExprParser.MulDivExprContext ctx);
	void enterVarExpr(ExprParser.VarExprContext ctx);
	void exitVarExpr(ExprParser.VarExprContext ctx);
	void enterIntExpr(ExprParser.IntExprContext ctx);
	void exitIntExpr(ExprParser.IntExprContext ctx);
	void enterParenExpr(ExprParser.ParenExprContext ctx);
	void exitParenExpr(ExprParser.ParenExprContext ctx);
	void enterAddSubExpr(ExprParser.AddSubExprContext ctx);
	void exitAddSubExpr(ExprParser.AddSubExprContext ctx);
}