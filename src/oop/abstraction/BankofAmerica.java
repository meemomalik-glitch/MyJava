package oop.abstraction;

public class BankofAmerica extends Amazon{


    public void placeorder(){
        customerInfo();
        System.out.println(fullname);
        System.out.println(billingAddress);
        System.out.println(expDate);
        System.out.println(cvv);
        System.out.println(cardNumber);
        // connecting to Bank of America's database
    }

public void reducemoney(){
    System.out.println("reduce money");
}

    public static void main(String[] args) {
        BankofAmerica obj = new BankofAmerica();
        obj.placeorder();
        obj.reducemoney();
    }



}
