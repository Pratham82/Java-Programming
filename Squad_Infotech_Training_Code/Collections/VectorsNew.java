package Collections;

import java.util.*;

public class VectorsNew {
    public static void main(String[] args) {
        //Vector increases the value by 100% percent
        //It is thread safe (Because all methods are synchronized)
        //Vector is slow
        Vector<Integer> v = new Vector<>();
        v.add(45);
        v.add(31);
        v.add(87);
        v.add(74);
        v.add(34);
        v.add(12);
        v.add(53);
        v.add(94);
        v.add(22);
        v.add(64);



        System.out.println("Printing using Enum");
        Enumeration <Integer> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println("Printing using toString");
        System.out.println(v);

        System.out.println("Printing using for each method");
        v.forEach(System.out::println);

        System.out.println("Printing using enhanced for loop");
        for(Integer i:v){
            System.out.println(i);
        }
        System.out.println("Printing using Iterator");
        Iterator i = v.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("Printing using ListIterator");
        ListIterator li = v.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("Vector's methods:");
        //Initial capacity of vector is 10
        System.out.println("Initial capacity of vector: "+v.capacity());

        //After exceeding the vector's size it will be doubled
        v.add(34);

    }
}
