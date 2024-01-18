package src.oops_14_jan_2024.InnerClass;

public class lab156 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println(" I am THREAD ");
            }

        };
    }
}
