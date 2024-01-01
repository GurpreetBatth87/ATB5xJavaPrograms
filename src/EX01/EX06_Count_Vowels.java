package src.EX01;

import java.util.Locale;
import java.util.Scanner;

public class EX06_Count_Vowels {
    public static void main(String[] args) {

        //Grade calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGHT OF THE TABLE");
        String name = sc.next();
        name=name.toLowerCase(Locale.ROOT);
               int vol=0;
        int cons=0;


        for (int i=0;i<name.length();i++){
            if (name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'|| name.charAt(i)=='o'||name.charAt(i)=='u' ) {
                vol++;
            } else if (name.charAt(i)<'a' || name.charAt(i)>'z') {
                System.out.println("this alphanumeric "+name.charAt(i));

            } else {
                cons++;
            }

        }
        System.out.println("TOTAL volus is "+ vol);
        System.out.println("Total const is "+cons);



    }
}
