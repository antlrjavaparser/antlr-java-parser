package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.ImportDeclaration;
import net.java.antlrjavaparser.api.expr.NameExpr;

public class ImportDeclarationContextAdapter implements Adapter<ImportDeclaration, Java7Parser.ImportDeclarationContext> {
    public ImportDeclaration adapt(Java7Parser.ImportDeclarationContext context) {

        ImportDeclaration importDeclaration = new ImportDeclaration();
        importDeclaration.setStatic(context.STATIC() != null);
        importDeclaration.setName(new NameExpr(AdapterUtil.dottedIdentifier(context.Identifier())));
        importDeclaration.setAsterisk(context.STAR() != null);

        return importDeclaration;
    }
}
