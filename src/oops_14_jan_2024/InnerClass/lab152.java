package src.oops_14_jan_2024.InnerClass;

public class lab152 {
    public static void main(String[] args) {

        car c = new car("lambo 137");

        car.Engine eng = c.new Engine("45025");
        eng.start();
        c.drive();

        // oc.IC ref = ocref.new IC();


    }

}

class car{

    String make; //Instance Variables

    // parameterimized constructor

    public car(String make){
        this.make=make;
    }

    void drive(){
        System.out.println("you can drive a car");
    }
    public class Engine{
        String hourPow;
        public Engine(String hourPow) {
            this.hourPow = hourPow;
        }

        void start(){
            System.out.println("Enginer is started" + make);
        }





    }

    public class Break{}

    public class Accme{}


}
