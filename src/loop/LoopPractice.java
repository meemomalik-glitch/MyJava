package loop;

public class LoopPractice {
// there are few types of loop
    /*
    1. While loop
    2.For loop
     */
public static void loopPractice(){
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);


}
public static void whileloop(){
    int i = 1;
    while (i<=10){
        System.out.println(i);
        i++;
    }
}
public static void forloop(){
    for(int i = 1; i<=5; i++){
        System.out.println(i);
    }
}
//print10,15,20,25,
public static void forlooping() {

    for (int j = 10; j <= 40; j=j+5) {
        System.out.println(j);
    }
}

public static void forhello(){
    for (int k = 1; k <= 5; k++) {
        System.out.println("Hello");
    }
}

public static void evennumber() {
    for (int l = 1; l <= 10; l++) {
        if (l % 2 == 0) {
            System.out.println(l);
        }
    }
}
    public static void oddnumber(){
        for (int l = 1; l <= 10; l++) {
            if (l % 2 != 0) {
                System.out.println(l);
            }
        }
}
public static void multiplicationtable(){
        for (int m = 1; m <= 10; m++) {
            System.out.println("5 x " + m + " = " + (5 * m));
        }
    }

    public static void divide(){
    for (int p= 1; p<=30; p++){
      if(p%3==0){
          System.out.println(p + " is divible by 3");
      }
    }
    }
    //print sum of 1 to 10; 1+2+3+4+5+6+7+8+9+10
public static void sum(){
    int s = 0;
    for (int i = 1; i <= 10; i++) {
        s = s + i; // 0+1=1, 1+2=3, 3+3=6, 6+4=10, 10+5=15,
    }
    System.out.println(s);
}


    public static void main(String[] args) {
            loopPractice();
            //whileloop();
           // forloop();
            //forlooping();
           // forhello();
           // evennumber();
           // oddnumber();
          //  multiplicationtable();
//            divide();
            sum();

        }
    }