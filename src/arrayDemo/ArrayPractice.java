package arrayDemo;

public class ArrayPractice {

    //Array can hold multiple elements
    // index always starting from '0'

    public void StringArray(){
        String [] name = {"Marium","Sabrina","Hassan","Asad"};
        int [] age = {20,25,30,40};
        float [] height = {5.44f, 5.00f, 4.98f, 6.00f};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);

        int length = name.length;
        System.out.println(length); //length starts with '1', length means how many numbers of a letter is there

        for(int i = 0; i<=name.length-1; i++){
            System.out.println(name[i]);
        }

        //for each loop
        for(String n:name){
            System.out.println(n);
        }
    }

    public void intArray(){
        int [] age = {20,25,30,40};
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);

        int length = age.length;
        System.out.println(length);

        for (int p= 0; p<=age.length-1; p++){
            System.out.println(age[p]);
        }

        for(int n:age){
            System.out.println(n);
        }

    }

    public void printmorethan25() {
        int[] age= {20, 25, 30, 40, 50, 55};

for(int i=0;i<= age.length-1;i++){
        if(age[i]>25){
        System.out.println(age[i]);
    }

        }
    }

    public void printEvennumber(){
        int []age ={20, 25, 30, 40, 50, 55};

        for(int i=0;i<= age.length-1;i++){
            if(age[i]%2==0){
                System.out.println(age[i]);
            }

        }
    }

    public void sumallnumber(){
        int []age ={20, 25, 30, 40, 50, 55};
        int s = 0;

        for (int i = 0; i < age.length; i++) {
            s = s+ age[i];
        }

        System.out.println(s);
    }

    public void average() {
        int[] age = {20, 25, 30, 40, 50, 55};
        int s = 0;

        for (Integer a : age) {
            s = s + a;
            System.out.println(s);
            System.out.println(s / age.length);
        }
    }

    public void addevennumbers(){
        int[] age = {20, 25, 30, 40, 50, 55};
        int sum = 0;

        for (int i = 0; i < age.length; i++) {
            if (age[i] % 2 == 0) {
                sum += age[i];
            }
        }

        System.out.println(sum);
    }



    public static void main(String[] args) {
        ArrayPractice obj = new ArrayPractice();
//        obj.StringArray();
//        obj.intArray();
       // obj.printmorethan25();
       // obj.printEvennumber();
      //  obj.sumallnumber();
        obj.addevennumbers();
    }


}
