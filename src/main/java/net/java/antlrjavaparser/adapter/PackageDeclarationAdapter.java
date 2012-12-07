package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.PackageDeclaration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class PackageDeclarationAdapter implements Adapter<PackageDeclaration, Object> {
    @Override
    public PackageDeclaration adapt(Object context) {
        /*
        if (context == null) {
            return null;
        }

        PackageDeclaration packageDeclaration = new PackageDeclaration();
        packageDeclaration.setName(new NameExpr(context.qualifiedName().getText()));

        if (context.annotations() != null) {
            List<AnnotationExpr> annotationExprList = new LinkedList<AnnotationExpr>();
            for (Java7Parser.AnnotationContext annotationContext : context.annotations().annotation()) {
                annotationExprList.add(Adapters.getAnnotationAdapter().adapt(annotationContext));
            }
            packageDeclaration.setAnnotations(annotationExprList);
        }

        return packageDeclaration;
        */

        return null;
    }
}
