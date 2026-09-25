package oop.polymorphism;

public class MethodOverLoading {

//Method overloading in Java is a feature that allows
// a class to have multiple methods with the same name,
// but different parameter lists.

    public void method1(String str){
       // str = "Marium is good";
        System.out.println(str);
    }

    public void method1(String str,String str1){
        //str = "Marium is good";
        //str1 = "But she eats without us";
        System.out.println(str1 + str);
    }

    public void method1(String str, int a){
       // str = "Marium is not good";
       // a = 0;
        System.out.println(str + a);
    }

    public void method1(int a, String str){
       // a=0;
      //  str="Marium is not good";
        System.out.println(a + str);
    }


    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.method1("Marium is good");
        obj.method1(0,"MArium eats her kids food");
        obj.method1("Marium fights alot", 0);
    }
}
