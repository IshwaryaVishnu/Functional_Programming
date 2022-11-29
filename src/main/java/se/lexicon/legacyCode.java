package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.integerOperator;

//MovingAnonymous Inner classes to fields
public class legacyCode {
     static DoStringStuff concatOperator = new DoStringStuff() {
        @Override
        public String operator(String s1, String s2) {
            return s1.concat(s2);
        }
    };
   static integerOperator addition = new integerOperator() {
        @Override
        public Integer apply(Integer n1, Integer n2) {
            return n1 + n2;
        }
    };

    public static void main( String[] args )
    {exe3();
    }

    //Anonymous Inner class
    public  static void exe1(){
        DoStringStuff concatOperator = new DoStringStuff() {
            @Override
            public String operator(String s1, String s2) {
                return s1.concat(s2);
            }
        };
        integerOperator addition = new integerOperator() {
            @Override
            public Integer apply(Integer n1, Integer n2) {
                return n1 + n2;
            }
        };
        }

    public static void exe3(){
        System.out.println(concatOperator.operator("Iswarya","Yaalan"));
        System.out.println(addition.apply(1,3));
            }

    public static  Integer calOperator(Integer n1,Integer n2,integerOperator operator) {
      return operator.apply(n1, n2);
    }
        }





