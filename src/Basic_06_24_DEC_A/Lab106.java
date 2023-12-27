package src.Basic_06_24_DEC_A;

import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) {

//Take input user marks of 5 subject and print the marks
        int [] makrs = new int[4];
        // int [] makrs = {2,6,6,5};
        makrs[0]=98;
        makrs[1]=58;
        makrs[2]=68;
        makrs[3]=48;

        // 1D---->
        //2D ---->|<-----
        //3D
        //4D

        int i =0;
        while (i<makrs.length){
            System.out.println(makrs[i]);
            i++;
        }
        System.out.println("---END--");

    }
}
