package src.oops_14_jan_2024.exception;

public class lab162 {
    public static void main(String[] args) {
try {
    String name = null;
    name.trim(); // 1000 used GB  Error
    System.out.println("I am gurpreet");
}catch (Exception e){
    System.out.println("you are trying to trim null string ");
}
        System.out.println("Hi I am end");
    }
}
// event that occurs during the execution of a program that disrupts the
//normal flow of instructions
//