package com.github.antlrjavaparser;

import com.github.antlrjavaparser.api.CompilationUnit;
import junit.framework.TestCase;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Mike De Haan
 * Date: 12/12/12
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestAll extends TestCase {

    //@Test
    public void testValidJavaFiles() {
        /*
        URL url = this.getClass().getResource("/testFiles/SimpleTest.java.txt");
        File file = new File(url.getFile());

        File testDirectory = new File("/tmp/java-src");

        listFiles(testDirectory, new Listener() {

            private boolean skip = false;

            @Override
            public void enterFile(File file) {

                //if (file.getPath().endsWith("\\tmp\\java-src\\src\\java\\util\\concurrent\\ScheduledFuture.java")) {
//                    skip = false;
//                }

                if (file.getName().endsWith(".java") && !skip) {

                    try {
                        System.out.println("Parsing file: " + file.getPath());
                        parseFile(file.getPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                        fail();
                    }
                }
            }
        });
        */
    }


    private void listFiles(File directory, Listener listener) {
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                listFiles(file, listener);
            } else {
                listener.enterFile(file);
            }
        }
    }

    private static interface Listener {
        void enterFile(File file);
    }

    private static void parseFile(String file) throws IOException {
        FileInputStream fileIn = new FileInputStream(file);

        Java7Lexer lex = new Java7Lexer(new ANTLRInputStream(fileIn));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Java7Parser parser = new Java7Parser(tokens);


        // Define new cache
        PredictionContextCache cache = new PredictionContextCache(); //parser.getInterpreter().getSharedContextCache();

        // Define new/clean DFA array
        DFA[] decisionToDFA = new DFA[parser.getATN().getNumberOfDecisions()];

        parser.setInterpreter(new ParserATNSimulator(parser, parser.getATN(), decisionToDFA, cache));

        long start = System.currentTimeMillis();

        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.setErrorHandler(new BailErrorStrategy());


        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        CompilationUnitListener listener = new CompilationUnitListener(tokens);
        walker.walk(listener, tree);
        CompilationUnit compilationUnit = listener.getCompilationUnit();

    }
}
