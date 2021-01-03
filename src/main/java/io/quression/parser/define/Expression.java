package io.quression.parser.define;

import io.quression.parser.define.function.IFunction;
import io.quression.parser.define.value.IValue;

import java.util.List;

public class Expression {

    private List<IFunction<IValue>> functions;

    public Expression(List<IFunction<IValue>> functions) {
        this.functions = functions;
    }

    public List<IFunction<IValue>> getFunctions() {
        return functions;
    }

    public Expression setFunctions(List<IFunction<IValue>> functions) {
        this.functions = functions;
        return this;
    }

    public Expression addFunctions(IFunction<IValue> function) {
        this.functions.add(function);
        return this;
    }
}
