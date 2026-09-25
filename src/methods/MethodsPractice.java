package methods;

public class MethodsPractice {
 //creating a method
    // calling that method

    String name = "Marium";

    public static void loveReels (){
        System.out.println("I love watching reels too much");
    }

    public static void loveMovies (){
        loveReels();
        System.out.println( "I love watching movies too much");
    }

    public static void main(String[] args) {
        //loveReels();
        loveMovies();
    }
}
