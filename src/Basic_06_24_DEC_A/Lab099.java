package src.Basic_06_24_DEC_A;

public class Lab099 {
    public static void main(String[] args) {

        //Array -- > java
        //Collection data
        //Collection of similar data
        //

        //Student -- > Prveen , gurpreet , rajesh
        //Collectin of students Name

        //{"gurpreet","singh,"batth }
        //store -10th markea --> 96,95,66,,65

        int j = 10;


        int []mark_10 = { 96 , 90, 87, 82, 56 };
        System.out.println(mark_10.length);
        System.out.println(mark_10[0]);
        System.out.println(mark_10[1]);
        System.out.println(mark_10[2]);
        System.out.println(mark_10[3]);
        System.out.println(mark_10[4]);
       // System.out.println(mark_10[5]); // Exception in thread main
        // inder --- > Starts from 0 to (length)

        int[] a = new int[4];
        // a---> [0,0,0,0]--Default value of int --->0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);//0to3

        a[0]=78;
        System.out.println(a[0]);
        a[1]=98;
        a[0]=88;
        a[2]=58;

      final int[] b = new int[4];
        // b---> [0,0,0,0]--Default value of int --->0
        b[0]=56;
        System.out.println(b[0]);







    }
}
