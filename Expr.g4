// src/main/antlr/Expr.g4
grammar Expr;

// Parser Rules
program
    : statement+ EOF
    ;

statement
    : assignment ';'
    | expr ';'
    ;

assignment
    : ID '=' expr
    ;

expr
    : additiveExpr
    ;

additiveExpr
    : multiplicativeExpr (('+' | '-') multiplicativeExpr)*
    ;

multiplicativeExpr
    : primaryExpr (('*' | '/') primaryExpr)*
    ;

primaryExpr
    : '(' expr ')'
    | ID
    | INT
    ;

// Lexer Rules
ID  : [a-zA-Z_][a-zA-Z0-9_]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;