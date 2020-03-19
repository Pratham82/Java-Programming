package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        /*
        1. Does not follow insertion order because it also uses hashing algorithm while storing and retrieving values.
        2. It allows duplicate values.
        3. It allows null values.(but while iterating it will cause NullPointerException if we are using for each loop )

        HashMap vs HashTable
        1. Hashmap is introduced in java 1.2
        2. It is not thread safe.
        3. It is faster than HashTable.
        4. Works with single thread
        5. Allows one null key.(but while iterating it will cause NullPointerException if we are using for each loop)
         */
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(11, "User 1");
        hm.put(12, "User 2");
        hm.put(13, "User 3");
        hm.put(14, "User 4");
        hm.put(null, "User 5");


        //Printing HashMap
        Set<Map.Entry<Integer, String>> es = hm.entrySet();
        System.out.println(es);
        System.out.println("-----------------------");


        //Iterate through hashmap using for each loop
        //it will cause NullPointerException because our map has null value
        /*for (Map.Entry<Integer, String> es2 : hm.entrySet()) {
            int key = (int) es2.getKey();
            String value = (String) es2.getValue();

            System.out.println(key + ": " + value);
        }
        System.out.println("-----------------------");*/

        //Iterate through hashmap using for each method
        System.out.println("Using for each method");
        hm.forEach((k,v)-> System.out.println(k+": "+v));

    }
}
