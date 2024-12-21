//Expr.g4
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
    : expr op=('*'|'/') expr      # MulDivExpr
    | expr op=('+'|'-') expr      # AddSubExpr
    | '(' expr ')'                # ParenExpr
    | ID                          # VarExpr
    | INT                         # IntExpr
    | FLOAT                       # FloatExpr
    ;

// Lexer Rules
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
INT     : [0-9]+ ;
WS      : [ \t\r\n]+ -> skip ;