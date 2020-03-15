package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        /*
        HashSet
        *  It follows the concept of hashSet that's why it is not following the insertion order
            Hashset uses hashing concept which applies an algorithm on the values which are stored on the heap memory.
            And that's why when we fetch the values it will directly fetch the values which are nearest.
        1. It does not follow insertion order.
        2. It does not allow duplicate values.
        3.

         */

        /*
        Use of HashCode:
        hashCode() is used for bucketing in Hash implementations like HashMap, HashTable, HashSet, etc.

        The value received from hashCode() is used as the bucket number for storing elements of the set/map.
        This bucket number is the address of the element inside the set/map.

        When you do contains() it will take the hash code of the element, then look for the bucket where hash code points to.
        If more than 1 element is found in the same bucket (multiple objects can have the same hash code),
        then it uses the equals() method to evaluate if the objects are equal, and then decide if contains() is true or false,
        or decide if element could be added in the set or not.
        * */
        HashSet<Integer> hs  = new HashSet<Integer>();
        hs.add(54);
        hs.add(21);
        hs.add(65);
        hs.add(36);
        hs.add(87);

        //Cloning method
        Set<Integer> hs2  = new HashSet<Integer>();
        hs2 = (HashSet<Integer>)hs.clone();

        for(int i:hs){
            System.out.println(i);
        }

        System.out.println(hs2);

        //hashCode
        System.out.println("Hashcode of hs2: "+hs2.hashCode());

        //Converting HashSet to TreeSet
        TreeSet<Integer> ts = new TreeSet<>(hs2);
        System.out.println("TreeSet: "+ts);

        //Converting hashset to array:
        Integer [] Array1 = new Integer[hs.size()];
        hs.toArray(Array1);
        for(int i: Array1){
            System.out.println(i);
        }

        //Comparing two hash set
        for(int i: hs){
            System.out.println(hs2.contains(i)?"True":false);
        }



    }
}
