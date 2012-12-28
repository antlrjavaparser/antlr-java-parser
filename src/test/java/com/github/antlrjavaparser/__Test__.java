package com.github.antlrjavaparser;

import com.github.antlrjavaparser.api.CompilationUnit;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.InputStream;


public class __Test__ {

    private CompilationUnit compilationUnit = new CompilationUnit();

    public static void main(String args[]) throws Exception {
        __Test__ tester = new __Test__();
        tester.test();
    }

    public void test() throws Exception {
        InputStream in = getClass().getClassLoader().getResourceAsStream("testFiles/SimpleTest.java.txt");

        if (in == null) {
            System.err.println("Unable to find test file.");
            return;
        }

        Java7Lexer lex = new Java7Lexer(new ANTLRInputStream(in));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        //printTokens(lex);

        Java7Parser parser = new Java7Parser(tokens);
        long start = System.currentTimeMillis();

        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        ParseTree tree = null;

        tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();

        // Fills out the compilationUnit object
        CompilationUnitListener listener = new CompilationUnitListener();
        walker.walk(listener, tree);
        compilationUnit = listener.getCompilationUnit();

        System.out.println("==========================================================================");

        long end = System.currentTimeMillis();

        System.out.println((end - start) + "ms");


        //System.out.println(compilationUnit.toString());
    }

    private void printTokens(Java7Lexer lex) {
        // Print tokens
        Token token = null;
        while ((token = lex.nextToken()) != null) {

            if (token.getType() == Token.EOF) {
                break;
            }

            if (token.getChannel() == Token.HIDDEN_CHANNEL) {
                continue;
            }

            System.out.println("Token: [" + token.getText() + "][" + token.getType() + "]");
        }

        lex.reset();
    }
}
