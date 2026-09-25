package oop.polymorphism;

public class MethodOverRiding3 extends MethodOverRiding1{

    @Override
    public void animalSounds(String animal){
        System.out.println(animal + " sounds woof");
    }


    public static void main(String[] args) {
        MethodOverRiding3 obj =new MethodOverRiding3();
        obj.animalSounds("dog");
    }
}
