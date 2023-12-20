package src.Basic_04_17Dec;

import java.util.Scanner;

public class lab055 {
    public static void main(String[] args) {
        // Tringle Classifier
        //Write a program that classifier a triangle based on its side lenghts.
        // give three input value representing the lenght of the sides, determine

        // if the triangles is equilateral (all sides are equal);
        //isosceles (Exactly two side are equal),
        //scalene(no side are equal).
        // use an if-else statement to classify the triangle

        // side 1 , side2 , side 3 >> side 1 == side 2== side 3 >>equilateral
        // side 1 == side 2 , side 2 == side 3 >>>isosceles
        // scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sside 1, side 2, side 3, I will tell the Tringle ");
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();

        if ((side1== side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("EQ");
        } else if ((side1== side2) || (side2 == side3)||(side1 == side3)) {
            System.out.println("ISO");
        }else
            System.out.println("SCA");


    }
}
