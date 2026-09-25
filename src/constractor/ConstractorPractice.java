package constractor;

public class ConstractorPractice {

    // constructor is a special method that can hold the class Name
    // we can initialize the variables when we create an object of the class.
    // Constructor method called automatically when we create an object of the class
    // when do we need to use 'this' keyword?
    // when we assign local variable to global variable

    String name;
    int age;
    char gender;


    public ConstractorPractice (String name,int age, char gender){
     this. name = name;
     this.age =age;
     this.gender = gender;
    }


    public static void main (String[] args){
        ConstractorPractice obj1= new ConstractorPractice("Nusrat", 26, 'F');


        System.out.println(obj1.name + " " + obj1.age + " " + obj1.gender);


        ConstractorPractice obj2= new ConstractorPractice("hassan", 28, 'M');
        /*obj2.name = "Hassan";
        obj2.age = 28;
        obj2.gender= 'M';*/

        System.out.println(obj2.name + " " + obj2.age + " " + obj2.gender);


        ConstractorPractice obj3= new ConstractorPractice("Ali", 29, 'M');
//        obj3.name = "Ali";
//        obj3.age = 29;
//        obj3.gender= 'M';

        System.out.println(obj3.name + " " + obj3.age + " " + obj3.gender);
    }

}
