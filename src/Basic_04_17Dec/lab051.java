package src.Basic_04_17Dec;

import java.util.Scanner;

public class lab051 {
    public static void main(String[] args) {
        // Grade Calculator :
        // Write a program that calculator and display the latter for a given
        // numerical score (eg A,B,C,D OR F) based on the following
        // grade score
        /*
        A :90- 100
        B : 80 -89
        c : 70-79
        D : 60-69
        F : 0-59

        1: INPUT FROM A USER
        SCORE ()DATE TYPE) --> INT , -- GRADE (char or string)

        2. BASIC LOGIC OR BRUTTE FORCE LOGIC WRITE BASIC CODE

        3.WRITE THE REAL CODE */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student score");
        int score = sc.nextInt();

        if(score >= 90 && score <=100){
            System.out.println("Your score --> A");
        } else if (score >= 80 && score <=89) {
            System.out.println("Your score --> B");
        }
        else if (score >= 70 && score <=79) {
            System.out.println("Your score --> C");
        }
        else if (score >= 60 && score <=69) {
            System.out.println("Your score --> D");
        }
        else {
            System.out.println("you Score -- > F");
        }


        // 4.DEBUG THE COD

        //5. FIC THE CODE AND FINAL IT

    }
}
