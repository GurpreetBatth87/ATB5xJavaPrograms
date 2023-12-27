package src.Basic_06_24_DEC_A;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

//Take input user marks of 5 subject and print the marks
        Scanner sc =new Scanner(System.in);
        float []marks = new float[5];
        System.out.println("Enter the Marks of first Sunbect --");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the Marks of Second Sunbect --");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the Marks of third Sunbect --");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the Marks of Fourth Sunbect --");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the Marks of Fifth Sunbect --");
        marks[4]=sc.nextFloat();

        for (int i =0; i<marks.length;i++){
            if(marks[i]<35){
                System.err.println("your marks is less then 35 -- >"+marks[i]);
            }
            System.out.println(marks[i]);
        }
        sc.close();

    }
}
