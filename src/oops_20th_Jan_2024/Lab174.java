package src.oops_20th_Jan_2024;

import java.io.File;
import java.io.FileReader;

public class Lab174 {
    public static void main(String[] args) throws CustomException {

        Bank Fedo = new Bank("USA",100);

        Bank hdfc =new Bank("INR " , 100 );
        Bank sbi =new Bank("INR " , 100 );
        System.out.println(hdfc.add(Fedo));
        System.out.println(hdfc.add(sbi));
        //Custome exception
    }

    }

