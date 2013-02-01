package com.github.antlrjavaparser.test.visitor;

import com.github.antlrjavaparser.api.Comment;
import com.github.antlrjavaparser.api.body.JavadocComment;
import com.github.antlrjavaparser.api.visitor.CommentFormatter;
import org.junit.Test;

/**
 * @author Mike De Haan
 */
public class TestCommentFormatter {

    @Test
    public void testJavadocFormatter() {
        Comment comment = new JavadocComment("/**\n      * This is a test\n     */");

        CommentFormatter formatter = new CommentFormatter();

        System.out.println(formatter.format(comment, 1, CommentFormatter.CommentLocation.BEGINNING));
    }

    @Test
    public void testUntaggedJavadoc() {
        String input = "This is a test\nLine two\n\"<b>Line3</b>\"";

        CommentFormatter formatter = new CommentFormatter();
        //System.out.println(formatter.formatStringAsJavadoc(input));

        Comment comment = new JavadocComment(formatter.formatStringAsJavadoc(input));
        System.out.println(formatter.format(comment, 1, CommentFormatter.CommentLocation.BEGINNING));

    }
}
