package net.java.antlrjavaparser.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/2/12
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Adapter<J, A> {
    public J adapt(A context);
}
