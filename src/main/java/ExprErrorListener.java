package main.java;

// src/main/java/ExprErrorListener.java
import org.antlr.v4.runtime.*;

public class ExprErrorListener extends BaseErrorListener {
    public static final ExprErrorListener INSTANCE = new ExprErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        String error = "Syntax Error at line " + line + ":" + charPositionInLine + " - " + msg;
        System.err.println(error);
        System.exit(1);
    }
}