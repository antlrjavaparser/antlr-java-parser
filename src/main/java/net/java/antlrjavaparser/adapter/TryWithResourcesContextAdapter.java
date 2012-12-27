package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.Statement;
import net.java.antlrjavaparser.api.stmt.TryStmt;

public class TryWithResourcesContextAdapter implements Adapter<Statement, Java7Parser.TryWithResourcesContext> {
    public Statement adapt(Java7Parser.TryWithResourcesContext context) {

        /*
        tryWithResources
            :    TRY resourceSpecification block catches? (FINALLY block)?
            ;

        resourceSpecification
            :    '(' resources (';')? ')'                                                                      // ( Resources [;] )
            ;

        resources
            :    resource ( ';' resource )*                                                                // Resource { ; Resource }
            ;

        resource
            :    variableModifiers? type Identifier EQ expression                       // {VariableModifier} ReferenceType VariableDeclaratorId = Expression
            ;

         */

        TryStmt tryStmt = new TryStmt();
        tryStmt.setTryBlock(Adapters.getBlockContextAdapter().adapt(context.block(0)));

        // Set resources
        if (context.resourceSpecification() != null) {
            tryStmt.setResources(Adapters.getResourcesContextAdapter().adapt(context.resourceSpecification().resources()));
        }

        if (context.catches() != null) {
            tryStmt.setCatchs(Adapters.getCatchesContextAdapter().adapt(context.catches()));
        }

        if (context.FINALLY() != null) {
            tryStmt.setFinallyBlock(Adapters.getBlockContextAdapter().adapt(context.block(1)));
        }

        return tryStmt;
    }
}
