package main.java.visitors;

// src/main/java/visitors/ExprPrettyPrintVisitor.java


public class ExprPrettyPrintVisitor extends ExprBaseVisitor<String> {

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
        String exprPretty = visit(ctx.expr());
        return "(= " + varName + " " + exprPretty + ")";
    }

    @Override
    public String visitMulDivExpr(ExprParser.MulDivExprContext ctx) {
        String op = ctx.op.getText();
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        return "(" + op + " " + left + " " + right + ")";
    }

    @Override
    public String visitAddSubExpr(ExprParser.AddSubExprContext ctx) {
        String op = ctx.op.getText();
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        return "(" + op + " " + left + " " + right + ")";
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