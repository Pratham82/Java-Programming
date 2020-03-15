package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        /*
        1. Does not follow insertion order because it also uses hashing algorithm while storing and retrieving values.
        2. It allows duplicate values.
        3. It allows null values.

        HashMap vs HashTable
        1. Hashmap is introduced in java 1.2
        2. It is not thread safe.
        3. It is faster than HashTable.
        4. Works with single thread
        5. Allows one null key.
         */
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(11,"User 1");
        hm.put(12,"User 2");
        hm.put(13,"User 3");
        hm.put(14,"User 4");
        hm.put(null,"User 5");


        //Printing HashMap
        Set<Map.Entry<Integer,String>> es = hm.entrySet();
        System.out.println(es);
    }
}
