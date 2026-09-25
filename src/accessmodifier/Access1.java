package accessmodifier;

public class Access1 {
    /* public properties can be use from anywhere in the project
    private properties can be access from its own class not by anyother class

    no access modifier/Package private can  be access only from its own package
    not from the other package
    'protected variable' can only be use if you extend the class to that class
     */



    public int year = 12;
    private int month = 30;
    int day = 24; // no access modifier/Package private
    protected int miuntes = 60;



    public void printYear(){
        System.out.println("public --- Method One Year = " + year + "months");
    }

    private void printMonth(){
        System.out.println("private ---- Method One Month = " + month+ "days");
    }

    void printDay(){
        System.out.println("package private --- Method One Day = " +day + "hours");
    }

    protected void Printminutes(){
        System.out.println(miuntes);
    }

    public static void main(String[] args) {
        Access1 obj = new Access1();
        System.out.println("public -- Variable one YEar = " + obj.year + "months");
        obj.printYear();
        System.out.println("private --- Variable One Month= "+ obj.month+ "days");
        obj.printMonth();
        System.out.println("package private --- Variable One Day= "+ obj.day+ "hours");
        obj.printDay();
    }
}
