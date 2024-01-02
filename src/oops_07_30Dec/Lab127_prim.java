package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab127_prim {

    public static void main(String[] args) {

      // Prime Number condition num%(i -- > 2 to num ) == 0 -- x
        // 0 -- > x
        // 1 -- > x
        // 2 ---  Prime
        //3 --- ?
        // 4 -0- ?

        int i = 0 ;
        int flag =0;
        int m = 0 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");

        int n = sc.nextInt();

        m = n/2;
        if ( n == 0 || n == 1 ){
            System.out.println("Not a prime number " + n);

        } else {
            for ( i =2; i <= m ; i++){
                if ( n % i == 0 ) {
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
if (flag == 0 ){
    System.out.println( " Prime number " + n);
}



    }

}


