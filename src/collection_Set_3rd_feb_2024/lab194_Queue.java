package src.collection_Set_3rd_feb_2024;

import java.util.PriorityQueue;
import java.util.Queue;

public class lab194_Queue {
    public static void main(String[] args) {
        Queue que = new PriorityQueue();
        //FIFO -- > 1 by 1
        // A , B ,C  , D

        //offer - Add
        //PQ -- > natural shorted

        que.offer(20);
        que.offer(10);
        que.offer(15);
        que.offer(5);
        que.offer(41);
        que.offer(50);

        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.peek());



    }
}
