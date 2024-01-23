package src.oops_20th_Jan_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab171 {
    public static void main(String[] args) throws FileNotFoundException {
readfile("c://batth.txt");

    }

     static void readfile(String  filename ) throws FileNotFoundException {
         File f = new File(filename);
         FileReader fileReader = new FileReader(filename);
         if (filename.length()==0){
             throw new FileNotFoundException();
         }
         System.out.println("not vl codde");
         int a =10/0;



    }
}
