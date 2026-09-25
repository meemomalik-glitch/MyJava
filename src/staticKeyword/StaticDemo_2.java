package staticKeyword;

public class StaticDemo_2 {





    public static void main(String[] args) {
        StaticDemo_1 obj4 = new StaticDemo_1();
        obj4.name="Ali";
        obj4.location="NewYork";
        obj4.gender='M';
        StaticDemo_1.isstudent=true;
        obj4.soccer();
        StaticDemo_1.study();

    }






}
