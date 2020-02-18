package Day34;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("String 1");
        l1.add('a');
        l1.add(4654);
        l1.add(54.2);

        System.out.println("List: ");
        for(Object o: l1){
            System.out.println(o);
        }
        System.out.println("--------------------------------");
        //Adding an object from a specific index:
        l1.add(1,"NewObject");

        System.out.println("List after adding an object: ");
        for(Object o: l1){
            System.out.println(o);
        }
        System.out.println("--------------------------------");


        //Removing an object from a specific index:
        l1.remove(2);
        System.out.println("list after removing an object: ");
        for(Object o: l1){
            System.out.println(o);
        }
        System.out.println("--------------------------------");


        //Shows number of objects present in list
        System.out.println("Size of list");
        System.out.println("Size of the list is: "+l1.size());
        System.out.println("--------------------------------");

        //prints true if list is Empty
        System.out.println("isEmpty method: ");
        System.out.println(l1.isEmpty());
    }
}
