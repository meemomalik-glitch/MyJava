package scannerDemo;

import java.util.Scanner;

public class ScannerPractice {
    public void information(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name?");
        String name = scan.nextLine();


        //String name = "Marium";
        System.out.println("my name is " + name);



        System.out.println("Enter your age?");
        int age = scan.nextInt();
        //int age = 25;
        System.out.println("My age is " + age);

        System.out.println("Enter your height");
        //String location = "Texas";
        float height = scan.nextFloat();
        System.out.println(height);

        //char gender = 'F';
        //System.out.println(gender);
    }

    public static void main(String[] args) {
        ScannerPractice obj = new ScannerPractice();
                obj.information();
    }




}
