package oop.abstraction;

public abstract class Amazon {

    //Abstract class can hold abstract method//
    /* what is abstract method?
    a common method without body and body can be given by different classes.
     */
// there must be an abstract word before class and method
    // Abstract class can hold abstract and non abstract method
    /* An abstract class in Java is a restricted class declared with the
    abstract keyword that cannot be instantiated directly
    (meaning you cannot create an object of it using the new operator).
    It serves as a partial blueprint or common base for
    related subclasses to inherit from, enforce a contract, and share code.

    abstraction class id 0 to 100% abstraction

    abstraction: there are two types of abstraction
    1. abstract class ( example by in seleium)
     */



    String fullname;
    int cardNumber;
    int expDate;
    int cvv;
    String billingAddress;



    public abstract void placeorder();

    public abstract void reducemoney();

public void customerInfo(){
    fullname = "Bashir Uddin";
    cardNumber = 1234566654;
    expDate = 1231;
    cvv = 123;
    billingAddress = "144-25 roosevelt ave";
}




}
