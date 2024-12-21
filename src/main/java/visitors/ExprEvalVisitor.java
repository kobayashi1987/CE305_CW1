package main.java.visitors;
// src/main/java/visitors/ExprEvalVisitor.java

import java.util.HashMap;
import java.util.Map;

public class ExprEvalVisitor extends ExprBaseVisitor<Double> {
    private Map<String, Double> memory = new HashMap<>();

    @Override
    public Double visitProgram(ExprParser.ProgramContext ctx) {
        Double result = null;
        for (ExprParser.StatementContext stmt : ctx.statement()) {
            result = visit(stmt);
        }
        return result;
    }

    @Override
    public Double visitStatement(ExprParser.StatementContext ctx) {
        if (ctx.assignment() != null) {
            return visit(ctx.assignment());
        } else {
            return visit(ctx.expr());
        }
    }

    @Override
    public Double visitAssignment(ExprParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Double value = visit(ctx.expr());
        memory.put(varName, value);
        return value;
    }

    @Override
    public Double visitMulDivExpr(ExprParser.MulDivExprContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        switch (op) {
            case "*":
                return left * right;
            case "/":
                if (right == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return left / right;
            default:
                throw new RuntimeException("Unknown operator: " + op);
        }
    }

    @Override
    public Double visitAddSubExpr(ExprParser.AddSubExprContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        switch (op) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            default:
                throw new RuntimeException("Unknown operator: " + op);
        }
    }

    @Override
    public Double visitParenExpr(ExprParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitVarExpr(ExprParser.VarExprContext ctx) {
        String varName = ctx.ID().getText();
        if (!memory.containsKey(varName)) {
            throw new RuntimeException("Undefined variable: " + varName);
        }
        return memory.get(varName);
    }

    @Override
    public Double visitIntExpr(ExprParser.IntExprContext ctx) {
        return Double.parseDouble(ctx.INT().getText());
    }

    @Override
    public Double visitFloatExpr(ExprParser.FloatExprContext ctx) {
        return Double.parseDouble(ctx.FLOAT().getText());
    }

    // Method to retrieve the current memory (symbol table)
    public Map<String, Double> getMemory() {
        return memory;
    }
}