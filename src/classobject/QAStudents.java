package classobject;

public class QAStudents {

//class is blueprint of objects,,
// class in Java is a logical template to create objects that share common properties and methods

// There can be many objects in a class...

// Example: Students is a class
// Objects: Mariam, Hassan, Arafat...
    //instance/global/object variable

String name;
String location;
char gender;
boolean isstudent;



public void lovesfacebookreels(){
    System.out.println( "I love facebook reels");
}

public void soccer(){
    System.out.println("i love soccer");
}

public void stayinghome(){
    System.out.println("I love staying at home. ");
}

    public static void main(String[] args) {
        QAStudents obj1 = new QAStudents(); //creating an object of the classs
        //obj1 is a refrence variable

       obj1.name =  "Marium";
       obj1.location = "Texas";
       obj1.gender ='F';
       obj1.isstudent = true ;

        System.out.println(obj1.name + " , " + obj1.location + " , " + obj1.gender + " , " + obj1.isstudent);
        obj1.lovesfacebookreels();
        System.out.println("---------------------");



        QAStudents obj2 = new QAStudents();
        obj2.name = "Hassan";
        obj2.location = "Texas";
        obj2.gender = 'M';
        obj2.isstudent = true;

        System.out.println(obj2.name + " , " + obj2.location + " , " + obj2.gender + " , " + obj2.isstudent);
        obj2.soccer();
        System.out.println("---------------------");




        QAStudents obj3 = new QAStudents();
        obj3.name = "Sabrina";
        obj3.location = "New Jersey";
        obj3.gender = 'F';
        obj3.isstudent = true;

        System.out.println(obj3.name + " , " + obj3.location + " , " + obj3.gender + " , " + obj3.isstudent);
        obj3.stayinghome();
        System.out.println("---------------------");
    }

}
