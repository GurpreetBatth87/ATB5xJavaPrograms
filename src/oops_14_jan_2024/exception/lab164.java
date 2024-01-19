package src.oops_14_jan_2024.exception;

import java.io.FileInputStream;

public class lab164 {
    public static void main(String[] args) {
        //Un-checked Exception, run time error

        String name= null ;
    name.trim();



        //checked Exception, Compile time /JVM if knows about it - checked Exception
        try {


            FileInputStream f = new FileInputStream("data.txt");
        }catch (Exception d){

        }

    }
}
