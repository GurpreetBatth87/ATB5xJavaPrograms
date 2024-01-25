package src.oops_20th_Jan_2024;

import java.util.List;

public class lab178_List {
    public static void main(String[] args) {
        //Collection Framework
        List fruites = List.of("Orange","Apple","Bananan","mango","pineapple");
        List Shopping = List.of("Mik","Bread","AATA","chips");
        List marks = List.of(89,69,78,52,45,100);
        List diffrent_datatype = List.of("Apple",89,true);

        System.out.println(fruites.get(0));
        System.out.println(fruites);
        System.out.println(fruites.isEmpty());
        System.out.println(fruites.size());

    }
}
