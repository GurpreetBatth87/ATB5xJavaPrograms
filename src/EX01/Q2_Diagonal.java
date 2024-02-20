package src.EX01;

public class Q2_Diagonal {

    public static void main(String[] args) {

        int colum=3;

        int[][] arr = new int[3][4];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[0][3]=4;


        arr[1][0]=5;
        arr[1][1]=6;
        arr[1][2]=7;
        arr[1][3]=8;

        arr[2][0]=9;
        arr[2][1]=10;
        arr[2][2]=11;
        arr[2][3]=12;

//        for ( int i=0; i < arr.length ; i++){
//            System.out.println(arr[i][i]);
//
//        }
        // if user want to print 1 5 9 then use below code

//        for ( int i=0; i < arr.length ; i++){
//
//            for ( int j=0; j < arr[i].length ; j++){
//                if ( i == j) {
//                    System.out.println(arr[i][j]);
//                }
//            }

        //if user want 7  5  3 then use below code
        // 1 2 3
        // 4 5 6
        // 7 8 9

        for ( int i=0; i < arr.length ; i++){

            for ( int j=0; j < arr[i].length ; j++){
//                if ( n-j-1==i ) {
//                    System.out.println(arr[i][j]);
//                }
                if ( i+j==colum-1 ) {
                    System.out.println(arr[i][j]);
                }
            }

        }


    }

}


