package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;

public class concatOperator implements DoStringStuff {
    @Override
    public String operator(String s1, String s2) {
        return s1.concat(s2);
    }
}
