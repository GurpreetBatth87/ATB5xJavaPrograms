package src.Basic_05_23Dec_L;

import java.util.Scanner;

public class lab069 {
    public static void main(String[] args) {


        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = user_input.next();

        System.out.println("Enter the Age");
        int age = user_input.nextInt();

        System.out.println("Enter the sallery");
        double salery = user_input.nextDouble();

        System.out.println("please find the Details -- > "+name +age+salery);
        user_input.close();



    }
}
