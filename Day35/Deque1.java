package Day35;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {
    public static void main(String[] args) {
        /*Properties of Dequeue:
        1) Queue follows insertion order while printing
        2) Allows adding duplicate values, and all the duplicate values will be printed
        3) Allows adding null value for to an object, but we will get nullPointerException while printing a queue.
        * */
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(456);
        dq.add(564);
        dq.add(634);
        dq.add(274);
        dq.add(994);
        dq.add(994);
        dq.add(144);
        //dq.add(null);
        //dq.add(null);

        System.out.println("Priority queue: ");
        for(Integer i:dq){
            System.out.println(i);
        }
        System.out.println("--------------");

        System.out.println("Poll first method"); //Prints out the first element in queue
        System.out.println(dq.pollFirst());
        System.out.println("--------------");

        System.out.println("Poll first method"); //Prints out the last element in queue
        System.out.println(dq.pollLast());
        System.out.println("--------------");

        System.out.println("Offer first method"); //Adds the object at the starting of queue
        dq.offerFirst(222);
        for(Integer i:dq){
            System.out.println(i);
        }
        System.out.println("--------------");

        System.out.println("Offer last method"); //Adds the object at the ending of queue
        dq.offerLast(111);
        for(Integer i:dq){
            System.out.println(i);
        }
        System.out.println("--------------");

    }
}
