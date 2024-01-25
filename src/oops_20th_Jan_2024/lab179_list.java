package src.oops_20th_Jan_2024;


import java.util.ArrayList;
import java.util.List;

public class lab179_list {
    public static void main(String[] args) {
        //List mylist = new List();
        List mylist = new ArrayList();
        mylist.add("Gurpreet");
        mylist.add(123);
        mylist.add(true);
        mylist.add(45.65);
        mylist.add(676688l);
        System.out.println(mylist);
        mylist.set(2,"manpreet");
        System.out.println(mylist);
        mylist.remove(1);
        System.out.println(mylist);

        for (int i = 0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }
        System.out.println("_______________________");

        for (Object g :mylist){
            System.out.println(g);
        }


    }
}
