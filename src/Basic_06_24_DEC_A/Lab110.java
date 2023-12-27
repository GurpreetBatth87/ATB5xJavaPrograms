package src.Basic_06_24_DEC_A;

public class Lab110 {
    public static void main(String[] args) {

        // 1D
        int a [] = {1,2,3}; // HORi --

        //2D
        int arr [][] = new int [3][3];

        //row 0 to 2
        arr[0][0] = 23;
         arr[0][1] = 63;
         arr[0][2] = 56;
// intilizatin the second row
        arr[1][0] = 03;
        arr[1][1] = 30;
        arr[1][2] = 56;
// intilizatin the Third  row
        arr[2][0] = 83;
        arr[2][1] = 64;
        arr[2][2] = 50;

        //System.out.println(arr[0][2]);

        for (int i=0; i < arr.length; i++){
            for (int j=0;j < arr[i].length;j++) {
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println( " ");
        }

        }


    }

