package oop.polymorphism;

public class MethodOverRiding1 {

    //created by Bashir


    public void animalSounds(String animal){
        System.out.println(animal + " make sounds");
    }





    public static void main(String[] args) {
        MethodOverRiding1 obj= new MethodOverRiding1();
        obj.animalSounds("snake");

    }


}
