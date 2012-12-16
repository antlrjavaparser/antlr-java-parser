package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.PackageDeclaration;
import net.java.antlrjavaparser.api.expr.NameExpr;

public class PackageDeclarationContextAdapter implements Adapter<PackageDeclaration, Java7Parser.PackageDeclarationContext> {
    public PackageDeclaration adapt(Java7Parser.PackageDeclarationContext context) {
        if (context == null) {
            return null;
        }

        PackageDeclaration packageDeclaration = new PackageDeclaration();
        packageDeclaration.setName(new NameExpr(context.qualifiedName().getText()));
        packageDeclaration.setAnnotations(Adapters.getAnnotationsContextAdapter().adapt(context.annotations()));

        return packageDeclaration;
    }
}
