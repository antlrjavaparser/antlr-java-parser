package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.CompilationUnit;
import net.java.antlrjavaparser.api.ImportDeclaration;
import net.java.antlrjavaparser.api.body.TypeDeclaration;

import java.util.LinkedList;
import java.util.List;

public class CompilationUnitContextAdapter implements Adapter<CompilationUnit, Java7Parser.CompilationUnitContext> {
    public CompilationUnit adapt(Java7Parser.CompilationUnitContext context) {
        CompilationUnit compilationUnit = new CompilationUnit();

        compilationUnit.setPackage(Adapters.getPackageDeclarationContextAdapter().adapt(context.packageDeclaration()));

        List<ImportDeclaration> importDeclarationList = new LinkedList<ImportDeclaration>();

        for (Java7Parser.ImportDeclarationContext importDeclarationContext : context.importDeclaration()) {
            importDeclarationList.add(Adapters.getImportDeclarationContextAdapter().adapt(importDeclarationContext));
        }

        compilationUnit.setImports(importDeclarationList);


        List<TypeDeclaration> typeDeclarationList = new LinkedList<TypeDeclaration>();
        for (Java7Parser.TypeDeclarationContext typeDeclarationContext : context.typeDeclaration()) {
            typeDeclarationList.add(Adapters.getTypeDeclarationContextAdapter().adapt(typeDeclarationContext));
        }

        compilationUnit.setTypes(typeDeclarationList);

        return compilationUnit;
    }
}
