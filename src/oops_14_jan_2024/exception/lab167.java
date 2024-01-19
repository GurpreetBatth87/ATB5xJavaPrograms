package src.oops_14_jan_2024.exception;

public class lab167 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b =10/0;
        }catch (Exception e){
            System.out.println("exit");
            System.exit(0);//JVM to stop
        }finally {
            System.out.println("I am final ");
        }
    }
}
