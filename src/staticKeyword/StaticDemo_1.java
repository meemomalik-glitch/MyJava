package staticKeyword;

import classobject.QAStudents;

public class StaticDemo_1 {

    //static keyword can be use before variable and methods which is common for all objects. this belongs to the class not perticularly to any object
//if i want to use any static keyword from anyother class i need to write claa name first
    String name;
    String location;
    char gender;
    static boolean isstudent;



    public void lovesfacebookreels(){
        System.out.println( "I love facebook reels");
    }

    public void soccer(){
        System.out.println("i love soccer");
    }

    public void stayinghome(){
        System.out.println("I love staying at home. ");
    }

    public static void study(){
        System.out.println("I love to study");
    }

    public static void main(String[] args) {
        StaticDemo_1 obj1 = new StaticDemo_1(); //creating an object of the classs
        //obj1 is a refrence variable

        obj1.name =  "Marium";
        obj1.location = "Texas";
        obj1.gender ='F';
        isstudent = true ;

        System.out.println(obj1.name + " , " + obj1.location + " , " + obj1.gender + " , " + isstudent);
        obj1.lovesfacebookreels();
        study();
        System.out.println("---------------------");



        StaticDemo_1 obj2 = new StaticDemo_1();
        obj2.name = "Hassan";
        obj2.location = "Texas";
        obj2.gender = 'M';
        isstudent = true;

        System.out.println(obj2.name + " , " + obj2.location + " , " + obj2.gender + " , " + isstudent);
        obj2.soccer();
        study();
        System.out.println("---------------------");




        StaticDemo_1 obj3 = new StaticDemo_1();
        obj3.name = "Sabrina";
        obj3.location = "New Jersey";
        obj3.gender = 'F';
        isstudent = true;

        System.out.println(obj3.name + " , " + obj3.location + " , " + obj3.gender + " , " + isstudent);
        obj3.stayinghome();
        study();
        System.out.println("---------------------");
    }







}
