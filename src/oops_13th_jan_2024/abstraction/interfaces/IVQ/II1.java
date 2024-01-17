package src.oops_13th_jan_2024.abstraction.interfaces.IVQ;

public class II1 {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.say();
        h.hello();

    }
}

interface II {
    void say();

    default void hello(){
        System.out.println("hello default");
    }

        }
        interface P{}

class Hello implements II{

    @Override
    public void hello() {
        System.out.println("Hello oh hello");
    }

    @Override
    public void say() {
        System.out.println("SAy!!!");

    }
}