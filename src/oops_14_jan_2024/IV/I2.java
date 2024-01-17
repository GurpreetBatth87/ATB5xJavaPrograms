package src.oops_14_jan_2024.IV;

public class I2 {
    public static void main(String[] args) {
        foo f  = new foo();
        R f1  = new foo();
        pp f2  = new foo();
        f.m1();
    }
}

interface pp{

    //only satc variables
    int a = 10 ;
    int b = 20 ;
    void m1();//this is non-static function
}
abstract class R implements pp{
    abstract void say();
}

class foo extends R{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("say");

    }
}