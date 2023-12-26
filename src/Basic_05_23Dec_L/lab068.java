package src.Basic_05_23Dec_L;

import java.util.Scanner;

public class lab068 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        sc.next()-->String;
//        sc.nextInt() -- Int
//            sc.nextDouble();
//        sc.nextBoolean();
//        sc.nextFloat();


        System.out.println("Enter the x");
        double x = sc.nextDouble();

        System.out.println("Enter the x");
        double y = sc.nextDouble();
        System.out.println("Enter the x");
        double z = sc.nextDouble();

         // 3/ x^2 + y^2 - |Z|
        //A+b-c --> A-x^2,y^2 , -Z

        double result =0;
        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
        //scanner Stem should be closed after we done
        //JVM wiil do , Garbage collector -- who will do it for u
        //It is not a good Pratic -->
        sc.close();

    }
}
