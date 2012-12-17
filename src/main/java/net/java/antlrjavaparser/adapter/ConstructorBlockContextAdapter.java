package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.BlockStmt;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/16/12
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConstructorBlockContextAdapter implements Adapter<BlockStmt, Java7Parser.ConstructorBlockContext> {
    @Override
    public BlockStmt adapt(Java7Parser.ConstructorBlockContext context) {
        return new BlockStmt();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
