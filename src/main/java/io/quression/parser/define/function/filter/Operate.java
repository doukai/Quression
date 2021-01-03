package io.quression.parser.define.function.filter;

public enum Operate {

    EQ("="),
    NEQ("!="),
    GT(">"),
    GE(">="),
    LT("<"),
    LE("<="),
    LK("%"),
    SL("%^"),
    EL("^%"),
    NLK("!%"),
    NSL("!%^"),
    NEL("!^%"),
    IN("@"),
    NIN("!@"),
    ISN("^"),
    NN("!^");

    Operate(String mark) {
    }
}
