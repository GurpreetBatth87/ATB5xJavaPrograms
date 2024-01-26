package src.oops_20th_Jan_2024;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab180_List_for_Each_Loop {
    public static void main(String[] args) {
        //List mylist = new List();
        List <String> mylist = new ArrayList<>();
        mylist.add("Gurpreet");
        mylist.add("hello");
        mylist.add("batth");
//        mylist.add(123);
//        mylist.add(true);
//        mylist.add(45.65);
//        mylist.add(676688l);
        System.out.println(mylist);
        mylist.set(2,"manpreet");
        System.out.println(mylist);
        mylist.remove(1);
        System.out.println(mylist);

        //for Loop
        for (int i = 0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }
        System.out.println("_______________________");
        
       //for Each Loop
        for (String g :mylist){
            System.out.println(g);
        }
        System.out.println("******************************");

        // Iteratoer
        Iterator itr= mylist.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
