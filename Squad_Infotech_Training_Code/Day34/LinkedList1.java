package Day34;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);

        System.out.println("Linked list: ");
        for(int i: ll){
            System.out.println(i);
        }
        System.out.println("--------------");
        //addFirst method: object will be added before list at the first
        ll.addFirst(10);

        //addLast method: object will be added after list at the last
        ll.addLast(16);

        System.out.println("After adding values: ");
        for(int i: ll){
            System.out.println(i);
        }
        System.out.println("--------------");

        //removeFirst method: object will be removed before list at the first
        ll.removeFirst();

        //removeLast method: object will be removed after list at the last
        ll.removeLast();

        System.out.println("After removing values: ");
        for(int i: ll){
            System.out.println(i);
        }
        System.out.println("--------------");

    }
}
