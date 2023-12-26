    package src.Basic_05_23Dec_L;

public class lab082 {
    public static void main(String[] args) {


        // for( A, B, C)
        //A--> Initialization -- > JVM what variable, where you are Starting point
        //B - Condition -- >When you want this to stop
        //C --> Increment  / Decrement

        //Print the odd number in between 1 to 50;
        //if Else

        for (int i = 1;i<50;i++){
            if (i%2==1){
                System.out.println(" Prin the Odd number "+i);
            } else if (!(i%2==1)) {
                System.out.println("**** Even " +i);

            }
        }
        System.out.println("_________END _______");


    }
    }
