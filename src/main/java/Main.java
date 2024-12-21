package main.java;

// src/main/java/Main.java
import main.java.visitors.ExprLexer;
import main.java.visitors.ExprParser;
import main.java.visitors.ExprPostfixVisitor;
import main.java.visitors.ExprPrettyPrintVisitor;
import main.java.visitors.ExprEvalVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Map; // Added import for Map
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Read input from the user
        System.out.println("Enter expressions (end input with an empty line):");
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputBuilder = new StringBuilder();
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.trim().isEmpty()) {
                break;
            }
            inputBuilder.append(line).append("\n");
        }
        scanner.close();
        String input = inputBuilder.toString();

        // Create an input stream from the string
        CharStream charStream = CharStreams.fromString(input);

        // Instantiate the lexer
        ExprLexer lexer = new ExprLexer(charStream);

        // Remove default error listeners and add custom ones
        lexer.removeErrorListeners();
        lexer.addErrorListener(ExprErrorListener.INSTANCE);

        // Create a buffer of tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Instantiate the parser
        ExprParser parser = new ExprParser(tokens);

        // Remove default error listeners and add custom ones
        parser.removeErrorListeners();
        parser.addErrorListener(ExprErrorListener.INSTANCE);

        // Parse the input starting from 'program' rule
        ParseTree tree = parser.program();

        // Postfix Conversion
        ExprPostfixVisitor postfixVisitor = new ExprPostfixVisitor();
        String postfix = postfixVisitor.visit(tree);
        System.out.println("\nPostfix Expression:");
        System.out.println(postfix);

        // Pretty Print
        ExprPrettyPrintVisitor prettyPrintVisitor = new ExprPrettyPrintVisitor();
        String pretty = prettyPrintVisitor.visit(tree);
        System.out.println("\nPretty Print (LISP-like):");
        System.out.println(pretty);

        // Evaluation
        ExprEvalVisitor evalVisitor = new ExprEvalVisitor();
        try {
            Double result = evalVisitor.visit(tree);
            System.out.println("\nEvaluation Result:");
            System.out.println(result);

            // Print variable memory
            System.out.println("\nVariables:");
            for (Map.Entry<String, Double> entry : evalVisitor.getMemory().entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        } catch (RuntimeException e) { // Adjusted catch block
            System.err.println("Evaluation Error: " + e.getMessage());
        }
    }
}