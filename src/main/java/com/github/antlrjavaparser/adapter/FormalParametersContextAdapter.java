/*
 * This file is part of antlr-java-parser.
 *
 *     antlr-java-parser is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     antlr-java-parser is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.body.Parameter;

import java.util.List;

public class FormalParametersContextAdapter implements Adapter<List<Parameter>, Java7Parser.FormalParametersContext> {
    public List<Parameter> adapt(Java7Parser.FormalParametersContext context, AdapterParameters adapterParameters) {

        /*
        formalParameters
            :   LPAREN
                (formalParameterDecls
                )?
                RPAREN
            ;
         */

        if (context.formalParameterDecls() != null) {
            return Adapters.getFormalParameterDeclsContextAdapter().adapt(context.formalParameterDecls(), adapterParameters);
        }

        return null;
    }
}
