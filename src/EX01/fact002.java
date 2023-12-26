package src.EX01;

import java.util.Scanner;

public class fact002 {
    public static void main(String[] args) {
        //Fact
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        long flat = 1;

        int i=1;
        while (i <= Number){
            flat=flat*i;
            i++;
        }
        System.out.println("flote --->" +flat);

    }
}
