package src.collection_Set_3rd_feb_2024;

import java.util.Enumeration;
import java.util.Hashtable;

public class lab199 {
    public static void main(String[] args) {
        Hashtable<Integer, String> h1 = new Hashtable<>();

        h1.put(1,"gurpreet");
        h1.put(2,"Batth");
        h1.put(3,"gur");

        Enumeration<Integer> e = h1.keys();

        while (e.hasMoreElements()){
            int key = e.nextElement();
            System.out.println("rank : "+ key + " name " + h1.get(key));

        }
    }
}
