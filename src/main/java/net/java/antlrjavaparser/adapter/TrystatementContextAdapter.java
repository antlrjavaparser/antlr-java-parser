package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.Statement;
import net.java.antlrjavaparser.api.stmt.TryStmt;

public class TrystatementContextAdapter implements Adapter<Statement, Java7Parser.TrystatementContext> {
    public Statement adapt(Java7Parser.TrystatementContext context) {
        // TODO

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

        catches
            :   catchClause
                (catchClause
                )*
            ;

        catchClause
            :   CATCH LPAREN catchFormalParameter RPAREN block
            ;

        catchFormalParameter
            :    variableModifiers type (BAR type)* Identifier (LBRACKET RBRACKET)*
            ;

        trystatement
        locals [int statementType]
            :    TRY block                       {$statementType = 1;}
            |    TRY block catches FINALLY block {$statementType = 2;}
            |    TRY block catches               {$statementType = 3;}
            |    TRY block FINALLY block         {$statementType = 4;}
            |    tryWithResources                {$statementType = 5;}
            ;

         */

        TryStmt tryStmt = new TryStmt();

        if (context.statementType != 5) {
            tryStmt.setTryBlock(Adapters.getBlockContextAdapter().adapt(context.block(0)));
        }

        switch (context.statementType) {
            case 1:
                break;
            case 2:
                tryStmt.setCatchs(Adapters.getCatchesContextAdapter().adapt(context.catches()));
                tryStmt.setFinallyBlock(Adapters.getBlockContextAdapter().adapt(context.block(1)));
                break;
            case 3:
                tryStmt.setCatchs(Adapters.getCatchesContextAdapter().adapt(context.catches()));
                break;
            case 4:
                tryStmt.setFinallyBlock(Adapters.getBlockContextAdapter().adapt(context.block(1)));
                break;
            case 5:
                return Adapters.getTryWithResourcesContextAdapter().adapt(context.tryWithResources());
        }

        return tryStmt;
    }
}
