package src.oops_13th_jan_2024.abstraction.interfaces.RealtimeExapmples;

public class Car implements Enginee , Break{
    void Start(){
        System.out.println("Starting the car");
        Startengne();
        Break();

    }

    @Override
    public void Startengne() {
        System.out.println("Start Enginee");
    }

    @Override
    public void Break() {
        System.out.println("Break is working fine");
    }
}
