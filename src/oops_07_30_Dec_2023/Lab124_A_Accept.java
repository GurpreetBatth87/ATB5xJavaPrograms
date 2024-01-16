package src.oops_07_30_Dec_2023;

import java.util.Scanner;

public class Lab124_A_Accept {

    public static void main(String[] gurpreet) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int  n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the Elements");

        for ( int i = 0 ; i < n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println( "----------OUTPUT__");

        for (int i = 0; i <n ; i++){
            System.out.println(arr[i]);
        }

        sc.close();

    }

}


