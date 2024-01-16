package src.oops_13th_jan_2024.Polly.methodoveridding;

public class RC {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Hound h = new Hound();
        h.bark();


        Dog f = new Hound(); // Dynamic Dispatch
        //Run time polymorphism
        h.bark();//

        //Hound a = new Dog(); //
        //latest java - 222 -



    }
}
