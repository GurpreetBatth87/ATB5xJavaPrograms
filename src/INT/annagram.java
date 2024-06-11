package src.INT;

import java.lang.reflect.Array;
import java.util.Arrays;

public class annagram {
    public static void main(String[] args) {
        String A = "lives";
        String B = "elvise";

        A = A.toLowerCase();
        B = B.toLowerCase();

        if (A.length()!= B.length()) {
            System.out.println("Both the String are not anagram");
        }
        else {
            char String1[] = A.toCharArray();
            char String2[] = B.toCharArray();

            Arrays.sort(String1);
            Arrays.sort(String2);

            if (Arrays.equals(String1, String2)==true){
                System.out.println("Both the String are anagram");

            }else {
                System.out.println("Both the String are not anagram *&** ");
            }

        }


    }

}
