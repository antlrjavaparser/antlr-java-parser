package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.ImportDeclaration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImportDeclarationAdapter implements Adapter<ImportDeclaration, Java7Parser.ImportDeclarationContext> {
    @Override
    public ImportDeclaration adapt(Java7Parser.ImportDeclarationContext context) {

        if (context == null) {
            return null;
        }

        ImportDeclaration importDeclaration = new ImportDeclaration();
/*
        importDeclaration.setAsterisk(context.STAR() != null);
        importDeclaration.setStatic(context.STATIC() != null);
        importDeclaration.setName(new NameExpr(context.qualifiedName().getText()));
*/
        return importDeclaration;
    }
}
