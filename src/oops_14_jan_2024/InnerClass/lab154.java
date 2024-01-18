package src.oops_14_jan_2024.InnerClass;

public class lab154 {
    public static void main(String[] args) {
        gur g = new gur();
        gur.Ipad g1 = new gur.Ipad();
        g1.eating();
    }

}

class gur{
    int age = 89;
    void eay(){
        System.out.println("I am eaing ");
    }

   static class Ipad{
        void eating(){
            System.out.println("Im a  IPAD");
           // System.out.println(age);
        }
    }
}
