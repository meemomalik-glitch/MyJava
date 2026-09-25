package javaOperators;

public class Operators_Demo {





    /* there are dfferent operators in java
    1. Arithmatic operators = +, -, *, /
    2. Comparative operators >, <, =, <=, >=, ==, !=
    3. Logical Operators = AND / OR

    Expression 1               Expression 2     final result
    true            and         true            = true
    true            and         false           = false
    false           and         true            = false
    false           and         false           = false

    true            or          true            = true
    true            or          false           = true
    false           or          true            = true
    false           or          false           = false


     */

    int a=20;
    int b=9;
    int c=10;


    public void arithmatic(){
        int result1 = a + b;
        System.out.println(result1);
        int result2 = a-b;
        System.out.println(result2);
        int result3 = a*b;
        System.out.println(result3);
        float result4 = (float) a/b;
        System.out.println(result4);
    }

    public void camparativeOperator(){
        //comparative operators always return in true or false (boolean value)
   boolean result1 = a+b>c;
        System.out.println(result1);

        boolean result2 = a+b>c;
        System.out.println(result2);

    }
public void logicaloperator(){
        // return true or false
    //&& AND
    // || OR
        /* int a=20;
        int b = 9;
        int c = 10;
         */
    boolean result1 = ((a-b>c)&& (a+b<c));
    System.out.println(result1);

    boolean result2 = ((a*c>b) || (b+c>a));
    System.out.println(result2);

    boolean result3 = ((a-b)==c) || ((b-c)>a);
    System.out.println(result3);
    }


    public static void main(String[] args) {
        Operators_Demo obj = new Operators_Demo();
       // obj.arithmatic();
 //obj.camparativeOperator();
        obj.logicaloperator();
    }
}
