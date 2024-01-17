package src.oops_13th_jan_2024;

public class IV2 {
    public static void main(String[] args) {


        Person2 h1 = new Person2();
        Person2 h2 = new Person2();
        Person2 h3 = null;
      //  h3.run();
        h2.run();
    }

}

class Person2{
    int a;
    void run(){
        System.out.println("run called");
    }
}
