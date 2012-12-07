package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.MemberValuePair;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/4/12
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElementValuePairAdapter implements Adapter<MemberValuePair, Java7Parser.ElementValuePairContext> {
    @Override
    public MemberValuePair adapt(Java7Parser.ElementValuePairContext context) {

        MemberValuePair memberValuePair = new MemberValuePair();
        memberValuePair.setName(context.Identifier().getText());




        return memberValuePair;
    }
}
