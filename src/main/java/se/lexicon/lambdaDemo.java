package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.integerOperator;

public class lambdaDemo {

    public static String DoStringStuff(String v1, String v2, DoStringStuff operator){
        return operator.operator(v1,v2);
    }

    public static void main(String[] args) {
        DoStringStuff concat =  (str1, str2) -> str1.concat(str2);
        DoStringStuff getBiggestString =  (str1, str2) -> str1.length() >= str2.length() ? str1 :str2;

        integerOperator addition = (num1, num2) -> num1 +num2;
    }
}
