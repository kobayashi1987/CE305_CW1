// src/main/java/visitors/ExprPostfixVisitor.java
package main.java.visitors;

import java.util.ArrayList;
import java.util.List;

public class ExprPostfixVisitor extends ExprBaseVisitor<String> {

    @Override
    public String visitProgram(ExprParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (ExprParser.StatementContext stmt : ctx.statement()) {
            sb.append(visit(stmt)).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitStatement(ExprParser.StatementContext ctx) {
        if (ctx.assignment() != null) {
            return visit(ctx.assignment());
        } else {
            return visit(ctx.expr());
        }
    }

    @Override
    public String visitAssignment(ExprParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        String exprPostfix = visit(ctx.expr());
        return exprPostfix + " " + varName + " =";
    }

    @Override
    public String visitMulDivExpr(ExprParser.MulDivExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return left + " " + right + " " + op;
    }

    @Override
    public String visitAddSubExpr(ExprParser.AddSubExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return left + " " + right + " " + op;
    }

    @Override
    public String visitParenExpr(ExprParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitVarExpr(ExprParser.VarExprContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitIntExpr(ExprParser.IntExprContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitFloatExpr(ExprParser.FloatExprContext ctx) {
        return ctx.FLOAT().getText();
    }
}