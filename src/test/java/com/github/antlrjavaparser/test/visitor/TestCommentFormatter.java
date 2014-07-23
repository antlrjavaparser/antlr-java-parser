package com.github.antlrjavaparser.test.visitor;

import com.github.antlrjavaparser.api.Comment;
import com.github.antlrjavaparser.api.body.JavadocComment;
import com.github.antlrjavaparser.api.visitor.CommentFormatter;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike De Haan
 */
public class TestCommentFormatter {

    @Test
    public void testJavadocFormatter() {
        Comment comment = new JavadocComment("/**\n      * This is a test\n     */");

        CommentFormatter formatter = new CommentFormatter();

        String actualResult = formatter.format(comment, 1, CommentFormatter.CommentLocation.BEGINNING);

        String expectedResult =
                "    /**\n" +
                "     * This is a test\n" +
                "     */";

        Assert.assertEquals("Comment formatter results do not match.", expectedResult, actualResult);
    }

    @Test
    public void testUntaggedJavadoc() {
        String input = "This is a test\nLine two\n\"<b>Line3</b>\"";

        CommentFormatter formatter = new CommentFormatter();
        //System.out.println(formatter.formatStringAsJavadoc(input));

        Comment comment = new JavadocComment(formatter.formatStringAsJavadoc(input));
        String actualResult = formatter.format(comment, 1, CommentFormatter.CommentLocation.BEGINNING);

        String expectedResult =
                "    /**\n" +
                "     * This is a test\n" +
                "     * Line two\n" +
                "     * \"<b>Line3</b>\"\n" +
                "     */\n";

        Assert.assertEquals("Comment formatter results do not match.", expectedResult, actualResult);
    }
}
