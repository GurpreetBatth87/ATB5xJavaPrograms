package src.oops_14_jan_2024.exception;

public class lab166 {
        public static void main(String[] args) {
    int a =10;
            try {
        int a1 = Integer.parseInt(args[0]);
    }
    catch (NumberFormatException exception) {
        exception.printStackTrace();
    }
    try {
        int b = 10 / a;
    }
    catch (ArithmeticException exception) {
        exception.printStackTrace();
    }
    try {
        String ip = args[0];
    }
    catch (ArrayIndexOutOfBoundsException exception) {
        exception.printStackTrace();
    }
}

}
