// Generated from Expr.g4 by ANTLR 4.13.2
package main.java.visitors;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import main.java.visitors.ExprParser;


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
//public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
//	/**
//	 * Visit a parse tree produced by {@link ExprParser#program}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitProgram(ExprParser.ProgramContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link ExprParser#statement}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitStatement(ExprParser.StatementContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link ExprParser#assignment}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitAssignment(ExprParser.AssignmentContext ctx);
//	/**
//	 * Visit a parse tree produced by the {@code FloatExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitFloatExpr(ExprParser.FloatExprContext ctx);
//	/**
//	 * Visit a parse tree produced by the {@code MulDivExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitMulDivExpr(ExprParser.MulDivExprContext ctx);
//	/**
//	 * Visit a parse tree produced by the {@code VarExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitVarExpr(ExprParser.VarExprContext ctx);
//	/**
//	 * Visit a parse tree produced by the {@code IntExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitIntExpr(ExprParser.IntExprContext ctx);
//	/**
//	 * Visit a parse tree produced by the {@code ParenExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitParenExpr(ExprParser.ParenExprContext ctx);
//	/**
//	 * Visit a parse tree produced by the {@code AddSubExpr}
//	 * labeled alternative in {@link ExprParser#expr}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitAddSubExpr(ExprParser.AddSubExprContext ctx);
//}


public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	T visitProgram(ExprParser.ProgramContext ctx);
	T visitStatement(ExprParser.StatementContext ctx);
	T visitAssignment(ExprParser.AssignmentContext ctx);
	T visitFloatExpr(ExprParser.FloatExprContext ctx);
	T visitMulDivExpr(ExprParser.MulDivExprContext ctx);
	T visitVarExpr(ExprParser.VarExprContext ctx);
	T visitIntExpr(ExprParser.IntExprContext ctx);
	T visitParenExpr(ExprParser.ParenExprContext ctx);
	T visitAddSubExpr(ExprParser.AddSubExprContext ctx);
}