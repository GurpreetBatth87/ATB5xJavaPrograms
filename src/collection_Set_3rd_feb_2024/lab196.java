package src.collection_Set_3rd_feb_2024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class lab196 {
    public static void main(String[] args) {
        Queue interQue = new PriorityQueue();
    interQue.add("A");
    interQue.add("B");
    interQue.add("C");
        System.out.println(interQue);
        System.out.println(interQue.poll());
        System.out.println(interQue);

        Iterator it = interQue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
