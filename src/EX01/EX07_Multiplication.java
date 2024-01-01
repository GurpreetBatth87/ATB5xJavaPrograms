package src.EX01;

import java.util.Scanner;

public class EX07_Multiplication {
    public static void main(String[] args) {

        //Grade calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGHT OF THE TABLE");
        int m = sc.nextInt();
        System.out.println("ENTER THE TABLE NAME ");
        int table =sc.nextInt();

      //  int m = 10;

        for (int i=1;i<=m;i++){
            System.out.println(table+" * " +i + " = "+i*table);
        }



    }
}
