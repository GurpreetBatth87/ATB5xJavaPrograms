package src.collection_Set_3rd_feb_2024;

import java.util.HashSet;
import java.util.Set;

public class lab190_HasSet {
    public static void main(String[] args) {
        //HasSet is not stored any duplicate value
        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Bananan");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("mango");
       // fruits.add(1235);
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("orange"));

    }
}
