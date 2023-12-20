package src.Basic_04_17Dec;

import java.util.Scanner;

public class lab056 {
    public static void main(String[] args) {
        //if, swithc - Condition Based
        // Loops --> Which will repeat something - for ,while , do while

        // switch-condition based - multiple condition

        // which day is today !!
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of day i will tell you which day it is");
        // 1 -->Monday 7 --> sunaday , invalid --> are you mad
        int daynumber = sc.nextInt();


        switch (daynumber){
            case 1:
                System.out.println("Mon");
                break;
                case 2:
                    System.out.println("THUS");
                    break;
                case 3:
                System.out.println("WED");
                    break;
                case 4:
                System.out.println("THRU");
                       break;
                case 5:
                System.out.println("FRI");
                    break;
                case 6:
                System.out.println("SAT");
                    break;
                case 7:
                System.out.println("SUN");
                    break;

            default:
                System.out.println("I dont know");
                break; // This break optional if default is last option
        }
        System.out.println("---End of the program");



    }
}
