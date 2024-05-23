package src.INT;

public class INT02 {
    public static void main(String[] args) {
        //  How to print the 2d array

        int a[][] = new int[3][3];
        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;

        a[1][0] = 40;
        a[1][1] = 500;
        a[1][2] = 60;

        a[2][0] = 70;
        a[2][1] = 80;
        a[2][2] = 90;
        int r = 3;
        int c = 3;

        int max = a[0][0];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }


        //  How to find higest number from the Array

        int a1[][] = new int[3][3];
        a1[0][0] = 10;
        a1[0][1] = 20;
        a1[0][2] = 30;

        a1[1][0] = 40;
        a1[1][1] = 500;
        a1[1][2] = 60;

        a1[2][0] = 70;
        a1[2][1] = 80;
        a1[2][2] = 90;


        int maxi = a1[0][0];


        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                if (a1[i][j] > maxi) {
                    maxi = a1[i][j];
                }
                // System.out.print(a[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("Please find the max numnber " + maxi);


        //  How to find min number from the Array

        int b[][] = new int[3][3];
        b[0][0] = 10;
        b[0][1] = 20;
        b[0][2] = 30;

        b[1][0] = 40;
        b[1][1] = 500;
        b[1][2] = 60;

        b[2][0] = 70;
        b[2][1] = 00;
        b[2][2] = 90;


        int min = b[0][0];


                for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i][j] < min) {
                    min = b[i][j];
                }
                // System.out.print(a[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("Please find the min numnber " + min);
    }
}

