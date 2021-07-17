package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HasTableTest {
    public static void main(String[] args) {
        /*
        1. Does not follow insertion order because it also uses hashing algorithm while storing and retrieving values.
        2. It allows duplicate values.
        3. It allows null values.

        HashMap vs HashTable
        1. Hashmap is introduced in java 1.0
        2. It is threadsafe.
        3. It is slower than HashMap.
        4. Works with multiple threads.
        5. Does not allow null key.

        Why HashTable doesn’t allow null and HashMap does?
        To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method and the equals method.
        Since null is not an object, it can’t implement these methods and thus causes the NullPointerException.
        HashMap is an advanced version and improvement on the Hashtable.
        HashMap was created later.
         */
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(11,"User 1");
        ht.put(12,"User 2");
        ht.put(13,"User 3");
        ht.put(15,"User 3");
        ht.put(14,"User 4");
        ht.put(18,"User 4");
        ht.put(20,"User 4");
        ht.put(30,"User 4");
        //ht.put(null,"User 5");

        //Printing HashMap
        Set<Map.Entry<Integer,String>> es = ht.entrySet();
        System.out.println(es);
    }
}
