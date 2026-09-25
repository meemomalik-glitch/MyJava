package oop.polymorphism;

public class MethodOverRiding2 extends MethodOverRiding1{

    @Override
    public void animalSounds(String animal){
        System.out.println(animal + " sound meow");
    }


    public static void main(String[] args) {
        MethodOverRiding2 obj = new MethodOverRiding2();
        obj.animalSounds("cat");
    }
}
