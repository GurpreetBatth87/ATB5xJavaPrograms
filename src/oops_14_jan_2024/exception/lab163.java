package src.oops_14_jan_2024.exception;

public class lab163 {
    public static void main(String[] args) {
        String sh = args[0]; // 137 -- String
        int x = Integer.parseInt(sh);// 2 m--. String to primtive
        int a = 10/x;
        System.out.println(x);
        System.out.println(a);
    }
}


// JVM Will be Initialized
// creates and starts the main thread.

//main Thread will do the following task
// 1) Collects the command line Arguments
//2) creates the String arrayy with CLA
//3)calls main method by passing String array as parameter:
//lab 163.main(5,15)
//now Control will be transfered from the main thread to the main method

//Control will come back to the main thread in two ways
// an Awhen problem comes in the main -- >JVM
// Creates the object of Identified Exception class
//AritmaticException a = new AritmaticException():
