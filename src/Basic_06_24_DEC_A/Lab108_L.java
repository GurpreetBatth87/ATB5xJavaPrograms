package src.Basic_06_24_DEC_A;

import java.time.Year;

public class Lab108_L {
    public static void main(String[] args) {
        //Create program that determine whater the given year is a Leep year.
        // A leep year divided by 4;
        // But not Divided by 100 unless it is also divisible by 400;
        // use an if else statement to make this determination


        // Cooding -->
        //1. user input
        //2.Rough logic-->(Year % 4==0 )--leep and ((year%100 !==0 or year %400 !==0));
        //3.Brute force
        //4.Logic correction

        int year =2000;

        if ((year%4==0 && year % 100 != 0)|| year % 400 ==0){
            System.out.println("Leep year ");
        }else {
            System.out.println("Not a Leep year");
        }





    }
}
