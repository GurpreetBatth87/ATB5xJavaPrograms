    package src.Basic_05_23Dec_L;

public class lab087 {
    public static void main(String[] args) {

        //Continue--? using it in for Loop
        //if this is true >>>continoue else dont >>>contionue

        for (int i = 0; i < 10; i++) {// 10 time , i-->>0 to 9
            if (i % 2== 0) {
                System.out.println("EVEN NUMBER PRINT " + i);
                continue;
            }
            System.err.println("Odd number Print ----> "+i);

        }
    }}
