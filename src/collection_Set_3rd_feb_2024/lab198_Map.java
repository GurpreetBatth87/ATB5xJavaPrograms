package src.collection_Set_3rd_feb_2024;

import java.util.*;

public class lab198_Map {
    public static void main(String[] args) {
       Map <String , Integer> map = new WeakHashMap<>();
       // Map <String , Integer> map = new TreeMap<>();
       // Map <String , Integer> map = new LinkedHashMap<>();

        //Map <String , Integer> map = new HashMap<>();
        map.put("id",03);
        map.put("id1",13);
        map.put("id2",53);
        map.put("id3",34);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(66));
        System.out.println(map.containsValue(53));
        System.out.println(map.get("id2"));
        System.out.println(map.keySet());
        System.out.println("**"+ map.values());

        for (Map.Entry<String , Integer> guru : map.entrySet()) {
            System.out.println(guru.getKey() +"---"+guru.getValue());
        }


    }
}
