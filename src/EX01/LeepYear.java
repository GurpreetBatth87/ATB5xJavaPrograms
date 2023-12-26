package src.EX01;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Year =sc.nextInt();
        System.out.println();

        if (Year%4==0 && Year%100==0 && Year%400==0){
            System.out.println("This is leap year"+Year);
        }
        System.out.println("___________END ___________");
    }
}
