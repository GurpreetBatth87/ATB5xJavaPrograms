package src.Basic_06_24_DEC_A;

public class Lab107_F {
    public static void main(String[] args) {
        //FizzBuzz problem.
        // write a program that print the number from 1 to 100 ;
        // for multiple of 3 ,print "Fizz" insted of the number;
        //and for the multiples of 5 print "Buzz".
        //***** print first --- for number which is multple of both 3 and 5 print
        // Print "FIZZ BUZZ " ;

        // Cooding -->
        //1. user input
        //2.Rough logic-->for 1 to 100 , i%3 == 0-- fizz , i%5==0 -- buzz , i%3 == 0 && i%5==0 --Fizz buzz
        //3.Brute force
        //4.Logic correction

        for (int i = 1 ; i<=100; i++){
            if ( i %3 == 0 && i % 5== 0){
                System.out.println("Fizz-Buzz");
            } else if (i %3 ==0) {
                System.out.println("Fizz");
            } else if (i %5 ==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }


        }





    }
}
