package src.oops_07_30_Dec_2023;

import java.util.Scanner;

public class Lab121 {

    public static void main(String[] gurpreet) {
        System.out.println("ENTER THE a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("ENTER THE ALUE OF b");
        int b = sc.nextInt();

        int temp =a;
        a =b;
        b=temp;

        System.out.println("Value of A and B is " + a + "_" + b);




    }

}


