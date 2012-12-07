package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.CompilationUnit;
import net.java.antlrjavaparser.api.ImportDeclaration;
import net.java.antlrjavaparser.api.body.TypeDeclaration;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompilationUnitAdapter implements Adapter<CompilationUnit, Java7Parser.CompilationUnitContext> {
    @Override
    public CompilationUnit adapt(Java7Parser.CompilationUnitContext context) {
/*
        CompilationUnit compilationUnit = new CompilationUnit();

        compilationUnit.setPackage(Adapters.getPackageDeclarationAdapter().adapt(context.packageDeclaration()));

        List<ImportDeclaration> importDeclarationList = new LinkedList<ImportDeclaration>();

        for (Java7Parser.ImportDeclarationContext importDeclarationContext : context.importDeclaration()) {
            importDeclarationList.add(Adapters.getImportDeclarationAdapter().adapt(importDeclarationContext));
        }

        compilationUnit.setImports(importDeclarationList);

        List<TypeDeclaration> typeDeclarationList = new LinkedList<TypeDeclaration>();
        for (Java7Parser.TypeDeclarationContext typeDeclarationContext : context.typeDeclaration()) {
            typeDeclarationList.add(Adapters.getTypeDeclarationAdapter().adapt(typeDeclarationContext));
        }
        compilationUnit.setTypes(typeDeclarationList);

        return compilationUnit;

        */

        return null;
    }
}
