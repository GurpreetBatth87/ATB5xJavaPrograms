package src.oops_14_jan_2024.exception;

public class lab165 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;

        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            //exception.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("i will run anyhow ");
        }

    }
}
