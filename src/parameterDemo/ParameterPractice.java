package parameterDemo;

import java.util.Scanner;

public class ParameterPractice {

    public void parameter() {
//Take a number.
//Divisible by 2 → Even
//Otherwise → Odd
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();

        if (number%2==0)  {
            System.out.println("Even");
        } else if (number%2!=0){
            System.out.println("Odd");
        }

    }
    //Take a number.
   // Greater than 0 → Positive
   // Less than 0 → Negative

    public void lessgreater(int number) {
        if (number > 0) {
            System.out.println("positive");

        } else {
            System.out.println("negative");
        }
    }


    //Take a purchase amount.
    //$100 or above → 10% discount
    //Below $100 → No discount

    public void purchase(int amount){ //parameter
        if (amount >= 100) {
            System.out.println("10% discount");

        } else if(amount<100){
            System.out.println("no discount");
        }
    }


    public static void main(String[] args) {
        ParameterPractice obj = new ParameterPractice();
        obj.parameter();
        obj.lessgreater(9);
        obj.purchase(26); //argument

    }
}