package ifEsle;

import java.util.Scanner;

public class ConditionalStatements {
    Scanner scan = new Scanner(System.in);//so every method will take this on their own

    public void ifStatement() {
        String day = "Monday";

        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("We need to work");
        }
    }

    public void ifElseStatement() {
        String day = "Sunday";
        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("We need to work");
        } else {
            System.out.println("Sleep");
        }
    }

    public void if_Elseif_Else() {

        String day = "Sunday";
        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("This is Monday");
        }
        if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("This is tuesday");
        }

        if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("This is Wednesday");
        } else {
            System.out.println("None match");
        }

    }

    public void grade() {

        System.out.println("Enter your grade?");
        int grade = scan.nextInt();
        //int grade = 70; not to be written because we are asking for grade


        if(grade>=60) {
            System.out.println("pass");
        }
        else if(grade<60){
            System.out.println("fail");
        }
}

//public void age(){

    //System.out.println("Enter your age?");
    //int age = scan.nextInt();

    //if(age>=18){
       // System.out.println("Eligible to vote");
    //} else if (age<18) {
        //System.out.println(" Not eligible to vote");

   // }

//}

//Take a mark and if Mark 90 or above → Grade A
//Mark 80–89 → Grade B
//Mark 70–79 → Grade C
//Mark 60–69 → Grade D
//Below 60 → Fail

    public void mark(int mark){
        if(mark>=90){
            System.out.println("GRADE A");
        }
        else if((mark>=80)&&(mark<=89)){
            System.out.println("GRADE B");
        }
        else if ((mark>=70)&& (mark<=79)){
            System.out.println("GRADE C");
        }
        else if ((mark>=60) && (mark<=69)){
            System.out.println("GRADE D");
        }
        else {
            System.out.println("FAIL");
        }
    }

//Take a age of someone then check if
//
//Age below 13 → Child
//Age 13–19 → Teenager
//Age 20–59 → Adult
//Age 60 or above → Senior

    public void age(int age){
        if(age<13){
            System.out.println("child");
        } else if ((age>=13) && (age<=19)) {
            System.out.println("Teenager");

        } else if ((age>=20) && (age<=59)) {
            System.out.println("Adult");

        }
        else if (age>=60) {
            System.out.println("Senior");
        }


    }
//2.Take a temparature and check if Above 90 → Very Hot
//70–90 → Warm
//50–69 → Cool
//Below 50 → Cold

    public void temparature(int temparature){
        if(temparature<90){
            System.out.println("Very Hot");
        } else if ((temparature>=70) && (temparature<=90)){
            System.out.println("Warm");

        } else if ((temparature>=50) && (temparature<=69)) {
            System.out.println("Cool");
        } else if (temparature<50) {
            System.out.println("cold");

        } else {
            System.out.println("Invalid");
        }

    }

    //3take a employee performance score and check if Score is 90 or above → Excellent
    //Score 75–89 → Good
    //Score 60–74 → Average
    //Below 60 → Needs Improvement

public void performance(int score){

        if(score>=90){
            System.out.println("Excellent");
        } else if ((score>=75) && (score<=89)){
            System.out.println("Good");
        } else if ((score>=60) && (score<=74)){
            System.out.println("Average");
        } else if (score<60) {
            System.out.println("Needs Improvement");

        }


}
    public static void main(String[] args) {
        ConditionalStatements obj = new ConditionalStatements();
        obj.ifStatement();
        obj.ifElseStatement();
        //obj.if_Elseif_Else();
        //obj.grade();
        //obj.age();
        //obj.mark(79);
        obj.age(62);
        obj.temparature(90);
        obj.performance(75);
    }




}
