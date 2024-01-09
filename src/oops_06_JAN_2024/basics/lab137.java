package src.oops_06_JAN_2024.basics;

import java.util.Scanner;

public class lab137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, i will check for Palidrome");
        String user_input = sc.next();
        boolean result = ispalidrom(user_input);

        if (result){
            System.out.println("Palidrome");
        }else {
            System.out.println("Not a palidrom ");
        }





    }

    private static boolean ispalidrom(String userInput) {
        String Orignal_string = userInput;// gurpreet
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_str = sb.reverse().toString();// preeetgur
        return Orignal_string.equalsIgnoreCase(reverse_str);//amanteeprug
    }
}
