package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.Parameter;

import java.util.List;

public class FormalParametersContextAdapter implements Adapter<List<Parameter>, Java7Parser.FormalParametersContext> {
    public List<Parameter> adapt(Java7Parser.FormalParametersContext context) {
        return null;
    }
}
