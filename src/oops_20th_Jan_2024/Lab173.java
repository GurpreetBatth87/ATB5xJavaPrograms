package src.oops_20th_Jan_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab173 {
    public static void main(String[] args)  {
        int a = 10 / 0 ; // unchecked - JVM dont know

        //Checked
        try {
            FileReader f = new FileReader(new File("c://gurpreetbatth.txt"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    }

