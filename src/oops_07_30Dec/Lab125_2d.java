package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab125_2d {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;

        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;

        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

        for ( int i=0; i < arr.length ; i++){
            System.out.println(arr[i][i]);

        }



    }

}


