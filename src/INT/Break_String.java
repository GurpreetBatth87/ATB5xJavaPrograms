package src.INT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Break_String {
    // Java Program to find the occurrence
// of words in a String using HashMap.

    public static void main(String[] args)
    {

        String str = "Gurpreet is boy and Manpreet is girl";
     String v=   str.replace("i","g");
        System.out.println(v);
        System.out.println(str.substring(0,str.length()-1));
        System.out.println(str.indexOf("e"));


        String[] words = str.split(" ");
        String ans= "";
//        String a= "";

        for (int i = words.length-1;i>=0;i--){
            ans +=words[i] + " ";
//            a = a+str.charAt(i);

        }
       // System.out.println(a);
        System.out.println(ans.substring(0,ans.length()));



    }
}


