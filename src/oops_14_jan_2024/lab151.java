package src.oops_14_jan_2024;

public class lab151  {
    public static void main(String[] args) {
        p01 p = new p01();
        p01 p2 = new p01();
        p.m2();
        p.m1();
    }
}
class p01{
    static {
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }
    int a = 20;

    static int b = 30;

    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }
    static void m2(){
       // System.out.println(a);
        System.out.println(b);
    }

}