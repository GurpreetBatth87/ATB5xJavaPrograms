package src.oops_7th_jan_2024.inheritance.hierarchical;

public class Vehical {
    Vehical(){
        System.out.println("DC Vehical");
    }


     void vehicalHasTopSpeed(){
         System.out.println("Yeah from " + getClass().getSimpleName());
     }
}
