package src.oops_7th_jan_2024.inheritance;

public class lab146 {
    public static void main(String[] args) {


        //what is Inheritance
        //Inheritance provides a way to create a new class from an existing class
        // superclass  | parent class |Base class
        // subclass | child class | derived class
        // The extends keyword

        // SubClass Extends SuperClass{
        //Content of subclass

        Programing p = new Programing(); // parent class /super class /base class
        // how the JVM understand
p.printInfo();
        //Programing - class
        // p -- refer the object
        // new programing () - object
        //DC is called
        Programing p2 = new Programing("javascript ", 12);
p2.printInfo();

    }

}
