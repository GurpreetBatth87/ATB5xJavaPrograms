package src.oops_13th_jan_2024.Polly.methodoverloadding;

public class RC {

    //Method overloading
    //same name with diffrent argument
    public static void main(String[] args) {
        new Person().Speak("gur");
        new Person().Speak(56);
        new Person().Speak(3.14);
    }
}
