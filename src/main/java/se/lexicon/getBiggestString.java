package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;

public class getBiggestString implements DoStringStuff {
    @Override
    public String operator(String s1, String s2) {
        if(s1.length() >= s2.length()) {
            return s1;
        }else{
                return s2;
            }
        }
    }

