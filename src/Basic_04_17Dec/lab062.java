package src.Basic_04_17Dec;

public class lab062 {
    public static void main(String[] args) {
        //JDK 13 and above it is working
        int a =002;
        switch (a){
            case 001,002,003:
                System.out.println("it is an electroic device ");
                break;
            case 004,005:
                System.out.println("it is a machanical device ");
                break;

            default:
                System.out.println("default it is a software product");
        }

    }
}
