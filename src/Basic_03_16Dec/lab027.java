package src.Basic_03_16Dec;

public class lab027 {
    public static void main(String[] args) {

        //castig  -->Mold
        //Widening is the process of converting Lower type to highrt type
        byte b = 10;
        //int a = b; // Implicit casting -->JVM
        int a = (int)b; // Explicit castng --JVM
        //


        ////Narrowing is the process of converting highrt type to Lower type
        int a1 =300;
        //byte b1 = a1; // Invalid - Implicit casting

        byte b1 = (byte) a1;
        System.out.println(b1);
        /*
        323bits
        0 0 0 0 0 0 0 0 0 0 0 00 0 0 0 0 00 0 0 0 01
        will shoprted into the b
         0 0 1 0 1 1 0 0
         0 * 27 * 0 * 2 6 +1 *25+0-24+1
                   // 44
         */




    }
}
