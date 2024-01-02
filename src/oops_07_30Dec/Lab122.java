package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab122 {

    public static void main(String[] gurpreet) {
        System.out.println("ENTER THE a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("ENTER THE ALUE OF b");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of A and B is " + a + "_" + b);




    }

}


