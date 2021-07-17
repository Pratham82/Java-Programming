package Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        /*
        1. It gives us sorted elements.
        2. It does not allow duplicates.
        3. Null values are not allowed in TreeSet, it will cause NullPointerException.
        4. Access and retrieval is fast in tree set.

        * NullPointerException reason:
        1. It uses natural ordering means it is implementing Comparable interface by default to
           sort value by comparing this value.
        2. TreeSet adds elements to it according to natural order. Tis internally compares the
           elements using compareTo(or compare) method.
        3. If you try to compare any object with a null value using one of these methods,
           a NullPointerException will be thrown.
        4. Therefore, if you try to add null values to a TreeSet
           it generates a NullPointerException at the run time.
         */

        TreeSet<Integer> ts  = new TreeSet<Integer>();
        ts.add(54);
        ts.add(21);
        ts.add(65);
        ts.add(36);
        ts.add(87);

        //Printing treeSet
        for(int i: ts){
            System.out.println(i);
        }

        //program to find the numbers less than x in a tree set.
        TreeSet<Integer> hsnew = (TreeSet<Integer>) ts.headSet(35);
        System.out.println(hsnew);

    }
}
