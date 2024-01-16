package src.oops_13th_jan_2024.Polly.methodoverloadding;

public class Person {
    // Method Overloading --> Multiple Method with same name,but diffrent argument

    void Speak(String a){
        System.out.println("A is a String " +a);
    }

    int Speak(int x){
        System.out.println("x is a int " +x);
        return x;
    }
    void Speak(double x){
        System.out.println("x is a double " +x);
    }


}
