package src.Basic_04_17Dec;

import java.util.Scanner;

public class lab050 {
    public static void main(String[] args) {
        // if else condetion
        // yes  NO

//        if(true){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }
//
//        if (true){
//            System.out.println("only if");
//        }

        //what if -number -- >20, <20,<10 --> ? 11 to 19 number
        // if ,else , if else
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >20){
            System.out.println("Number is >20");
        } else if (num>10) {
            System.out.println("Number is >10");

        }else {
            System.out.println("NUmber is <20");
        }

    }
}
