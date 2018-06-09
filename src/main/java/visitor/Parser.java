package visitor;

import expressions.RegularExpr;

public interface Parser {
    RegularExpr parse(String code);
}
