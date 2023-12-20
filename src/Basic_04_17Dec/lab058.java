package src.Basic_04_17Dec;

import java.util.Scanner;

public class lab058 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the char i will tell you it is vowel or not");
        // a, e, i o u

        char user_input = sc.next().toCharArray()[0]; // will accpe only one Char
        System.out.println(user_input);

        switch (user_input){
            case 'a':
                System.out.println("this is a vowel");
                break;
            case 'e':
                System.out.println("this is a vowel");
                break;
            case 'i':
                System.out.println("this is a vowel");
                break;
            case 'o':
                System.out.println("this is a vowel");
                break;
            case 'u':
                System.out.println("this is a vowel");
                break;


            default:
                System.out.println("Not a vowel this is some thing another");
        }

    }
}
