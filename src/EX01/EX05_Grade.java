package src.EX01;

import java.util.Scanner;

public class EX05_Grade {
    public static void main(String[] args) {

        //Grade calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First subject Score");
        float A = sc.nextFloat();// A> 91 to 100;


        if (A>91 && A<100){
            System.out.println("Your Gade is A *** --- > " +A);
        } else if (A>81 && A<90) {
            System.out.println("Your Gade is B ***--- > " +A);

        }else if (A>71 && A<80) {
            System.out.println("Your Gade is C ***--- > " +A);

        }else if (A>61 && A<70) {
            System.out.println("Your Gade is D ***--- > " +A);
        }
         else {
            System.out.println("Bhai sahab apke number kam hai 60 se");
        }

    }
}
