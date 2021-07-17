package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        /*
        - It follows double linked list structure it has every element is stored in a node.
          And this node points to previous and next node.
        - If we manipulate the elements in Linked list it will not affect the whole list
        - Linked list less time-consuming.
        - Adding and removing elements takes does not take that much of time.
        - Searching is slower in Linked list
        */
        LinkedList<Integer> ll1 = new LinkedList<>();
        //ArrayList<Integer> al3 = new ArrayList<>();
        ll1.add(54);
        ll1.add(12);
        ll1.add(61);
        ll1.add(21);
        ll1.add(32);
        System.out.println("Index of 54: "+ll1.indexOf(54));

        for(int i: ll1){
            System.out.println(i);
        }

        ll1.add(0,111);

    }
}
