package oop.inheritance;

public class InheritanceDemo_2 extends InheritanceDemo_1{
 //extends means extension of first

    String properties_1 = "house";

    public void acquireJob(){
        System.out.println("I got a Job at bank");
    }


    public static void main(String[] args) {
        InheritanceDemo_2 obj = new InheritanceDemo_2();
        System.out.println(obj.properties);
        obj.brilliantStudent();
        System.out.println(obj.properties_1);
        obj.acquireJob();
    }

}
