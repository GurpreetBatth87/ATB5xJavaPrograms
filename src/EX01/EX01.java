package src.EX01;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X , Y ,Z  value");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        System.out.println("Result -- > "+(Math.cbrt(x*x+y*y-Math.abs(z))));





        }

    }

