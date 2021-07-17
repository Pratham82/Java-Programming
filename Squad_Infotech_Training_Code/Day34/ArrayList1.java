package Day34;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        //Collection l1 = new ArrayList();
        List l1 = new ArrayList();
        l1.add("String 1");
        l1.add('a');
        l1.add(4654);
        l1.add(54.2);

        System.out.println("Printing collections:\n ");
        System.out.println("Method 1: Using toString");
        System.out.println(l1);
        System.out.println("--------------------------------");

        System.out.println("Method 2: Using Iterator");
        Iterator i1 = l1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("--------------------------------");

        System.out.println("Method 3: Using list Iterator");
        /*for using lisIterators with collections:
        ListIterator li = ((ArrayList) l1).listIterator();*/
        ListIterator li = l1.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("Reversing arrayList: ");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

        System.out.println("--------------------------------");

        System.out.println("Method 4: Using for each loop");
        for(Object o: l1){
            System.out.println(o);
        }
        System.out.println("--------------------------------");

        System.out.println("Method5: Using forEach method");
        l1.forEach(System.out::println);

    }
}
