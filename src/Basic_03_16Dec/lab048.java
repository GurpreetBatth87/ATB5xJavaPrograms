package src.Basic_03_16Dec;


import java.util.Scanner;

public class lab048 {
    public static void main(String[] args) {
        //take two input from user and find the max value
        //a,b a>b --> a , else b

        Scanner sc = new Scanner(System.in); // oops
        System.out.println("enter the A and B Value ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("MAX -- > " + a);
        }else {
            System.out.println("Max --- > " + b);
        }















    }
}
