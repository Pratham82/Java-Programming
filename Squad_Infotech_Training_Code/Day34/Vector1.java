package Day34;

import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.addElement(45);
        v1.addElement(12);
        v1.addElement(78);
        v1.addElement(56);
        v1.addElement(23);

        System.out.println("Printing vectors: ");

        //Enumeration is legacy class which can be used to print out vector elements
        System.out.println("Printing values using Enumeration: ");
        Enumeration<Integer> en = v1.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        System.out.println("------------------------------------");

        System.out.println("Printing values using Iterator: ");
        Iterator i1 = v1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("------------------------------------");

        System.out.println("Printing values using forEach loop: ");
        for(int i: v1){
            System.out.println(i);
        }
        System.out.println("------------------------------------");

        //We can give the initial capacity of vector in parentheses
        Vector<Integer> v2 = new Vector<>(2);

        System.out.println("Size method: ");
        System.out.println("Size of vector v2: "+v2.size());
        System.out.println("------------------------------------");

        System.out.println("Capacity method: ");
        System.out.println("Initial capacity of vector v2: "+v2.capacity());

        //If the initial capacity is exceeded then the capacity will be doubled
        v2.addElement(54);
        v2.addElement(64);
        v2.addElement(63);
        //The initial capacity was 2, and here 3 elements are added and initial capacity was exceeded
        //Now the capacity was doubled
        System.out.println("The capacity of vector v2 after adding 3 elements: "+v2.capacity());

    }
}
