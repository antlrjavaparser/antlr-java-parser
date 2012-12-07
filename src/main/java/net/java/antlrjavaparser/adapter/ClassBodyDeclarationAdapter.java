package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/4/12
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClassBodyDeclarationAdapter implements Adapter<BodyDeclaration, Java7Parser.ClassBodyDeclarationContext> {
    @Override
    public BodyDeclaration adapt(Java7Parser.ClassBodyDeclarationContext context) {
/*
        BodyDeclaration bodyDeclaration = null;

        if (context.SEMI() != null) {
            return new EmptyMemberDeclaration();
        } else if (context.block() != null) {
            InitializerDeclaration initializerDeclaration = new InitializerDeclaration();
            initializerDeclaration.setBlock(Adapters.getBlockAdapter().adapt(context.block()));
            return initializerDeclaration;
        } else if (context.member() != null) {

            if (context.member().methodDeclaration() != null) {
                MethodDeclaration methodDeclaration = Adapters.getMethodDeclarationAdapter().adapt(context.member().methodDeclaration());
                if (context.modifiers() != null) {

                    int modifiers = 0;
                    for (Java7Parser.ModifierContext modifierContext : context.modifiers().modifier()) {

                        //modifierContext.annotation()

                        if (modifierContext.FINAL() != null) {
                            modifiers |= ModifierSet.FINAL;
                        }

                        if (modifierContext.ABSTRACT() != null) {
                            modifiers |= ModifierSet.ABSTRACT;
                        }

                        if (modifierContext.NATIVE() != null) {
                            modifiers |= ModifierSet.NATIVE;
                        }

                        if (modifierContext.PRIVATE() != null) {
                            modifiers |= ModifierSet.PRIVATE;
                        }

                        if (modifierContext.PROTECTED() != null) {
                            modifiers |= ModifierSet.PROTECTED;
                        }

                        if (modifierContext.PUBLIC() != null) {
                            modifiers |= ModifierSet.PUBLIC;
                        }

                        if (modifierContext.STATIC() != null) {
                            modifiers |= ModifierSet.STATIC;
                        }

                        if (modifierContext.STRICTFP() != null) {
                            modifiers |= ModifierSet.STRICTFP;
                        }

                        if (modifierContext.SYNCHRONIZED() != null) {
                            modifiers |= ModifierSet.SYNCHRONIZED;
                        }

                        if (modifierContext.TRANSIENT() != null) {
                            modifiers |= ModifierSet.TRANSIENT;
                        }

                        if (modifierContext.VOLATILE() != null) {
                            modifiers |= ModifierSet.VOLATILE;
                        }
                    }
                    methodDeclaration.setModifiers(modifiers);
                }

                //context.

                //methodDeclaration.setBody(Adapters.getBlockAdapter().adapt(context.member().methodDeclaration().methodDeclarationRest().methodBody()));

                return methodDeclaration;
            }
        }
*/
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
