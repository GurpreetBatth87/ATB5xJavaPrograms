package src.oops_13th_jan_2024.abstraction.interfaces;

public interface Father {
    void loan1k();

    default void prin(){
        System.out.println("Im a Defaul Method");
    }

    static void prnt2(){
        System.out.println("Im Static Method");
    }

}
