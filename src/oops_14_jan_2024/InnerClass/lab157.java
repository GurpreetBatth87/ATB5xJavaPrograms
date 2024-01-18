package src.oops_14_jan_2024.InnerClass;

public class lab157 {
    public static void main(String[] args) {
        Runnable runable= new Runnable() {
            @Override
            public void run() {
                System.out.println("I am thread");
            }
        };
    }
}
