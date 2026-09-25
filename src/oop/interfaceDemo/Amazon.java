package oop.interfaceDemo;

public interface Amazon {

    /*interface cannot hold non abstract method
    since it can hold abstract method we donnt to write  abstract word
    all he variables in the interface is by defult final
    100%abstract
    cannot create and object of interface
    cannot use non abstract mnethod
    but after java version 8 we can create a non-abstract method
    using the word default...
     */

        String fullname = "Bashir Uddin";
        int cardNumber =  123466545;
        int expDate = 1231;
        int cvv = 123;
        String billingAddress = "144-25 Roosevelt ave";



        public void placeorder();

        public void reducemoney();

}
