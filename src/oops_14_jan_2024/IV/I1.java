package src.oops_14_jan_2024.IV;

public class I1 {
    public static void main(String[] args) {
        System.out.println(h.a);
        p l = new p();
        l.m1();
    }
}

interface h{

    //only satc variables
    int a = 10 ;
    int b = 20 ;
    void m1();//this is incomplete function
}
class p implements h {

    @Override
    public void m1() {

    }
}
