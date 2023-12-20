package src.Basic_03_16Dec;

public class lab038 {
    public static void main(String[] args) {
       //ternary Operator.

        // Int a = Condition ? if this is true print do this : if fals do this
       // Maz in two number ?

        int a = 40;
        int b = 50;
        int c = 82;

        // ---> ?
        // a>b && a>c -- > a
        //(a>c) ? a :c
        // (b>c) ? b : c
        int max = (a > b ) ? ((a > c) ? a : c) :(( b > c ) ? b : c );
        System.out.println(max);




    }
}
