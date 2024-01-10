package src.oops_7th_jan_2024;

public class Dog {
    String name ; // Instance varible

    Dog(){
        System.out.println("Dc");
    }

    Dog(String nameref){
        this.name=nameref;
        System.out.println("PC");
    }

    void bark(){
        int age =30;//Local variable
        System.out.println("bark");
        System.out.println("Dog Name " + this.name);
    }







}
