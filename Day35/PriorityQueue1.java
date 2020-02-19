package Day35;

import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
         /*Properties of HashSet:
        1) Sorts the queue while printing
        2) Allows adding duplicate values, and all the duplicate values will be printed
        3) Allows adding null value for to an object, but we will get nullPointerException while printing a queue.
        * */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(456);
        pq.add(111);
        pq.add(564);
        pq.add(634);
        pq.add(274);
        pq.add(994);
        pq.add(994);
        pq.add(994);
        //pq.add(null);
        //pq.add(null);

        for(Integer i:pq){
            System.out.println(i);
        }
        System.out.println("Offer method"); //Adds the object at the starting of queue
        pq.offer(222);
        for(Integer i:pq){
            System.out.println(i);
        }
        System.out.println("--------------");

        System.out.println("Poll method");
        System.out.println("First element in Queue: "+pq.poll());//Prints out the smallest element in queue
        System.out.println("--------------");
        //Deletes first element in the queue
        System.out.println("After removing the smallest element in the queue:  ");
        pq.poll();
        for(Integer i:pq){
            System.out.println(i);
        }
        System.out.println("--------------");
    }
}
