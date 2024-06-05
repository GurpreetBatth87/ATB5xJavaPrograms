package src.INT;

import java.util.HashMap;
import java.util.Map;

public class coun_the_number_of_word {
    // Java Program to find the occurrence
// of words in a String using HashMap.

        public static void main(String[] args)
        {

            String str = "Gurpreet is boy and Manpreet is girl";

            Map<String, Integer> hashMap = new HashMap<>();

            String[] words = str.split(" ");

            for (String word : words) {
                // containsKey(key) will return a boolean value
                // i.e. true if it contains the key and false if
                // it doesn't.
                if (hashMap.containsKey(word))
                    hashMap.put(word, hashMap.get(word) + 1);

                else
                    hashMap.put(word, 1);
            }

            System.out.println(hashMap);
        }
    }


