package src.oops_20th_Jan_2024;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class lab182_Iterator {
    public static void main(String[] args) {
        List<String> mylist = new LinkedList();
        mylist.add("Gurpreet");
        mylist.add("Gur");
        mylist.add("preet");
        mylist.add("Manpreet");
        System.out.println(mylist);

        List<Integer> list = new LinkedList();
        //now add element to the linkdlist
        list.add(56);
        list.add(78);
        list.add(45);
        list.add(22);

        // Iteratoer
        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
