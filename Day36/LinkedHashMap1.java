package Day36;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMap1 {
    public static void main(String []args){
        /*Properties of LinkedHashMap:
        1) Follow insertion order while printing map
        2) Allows adding duplicate values for but only one copy of that value will be printed
        3) If we are having duplicate keys then the latest value(value which is added last)of the key will be printed
        3) Allowed adding multiple null values but only one null value will be printed
        */
        LinkedHashMap<Integer,String> m1 = new LinkedHashMap<Integer,String>();
        m1.put(12,"Test 1");
        m1.put(10,"Test 6");
        m1.put(16,"Test 7");
        m1.put(11,"Test 9");
        m1.put(13,"Test 4");
        m1.put(15,"454");
        m1.put(15,"151");
        m1.put(null, null);
        m1.put(null, null);
        m1.put(null, "92110sa");
        m1.put(15,"4564");
        m1.put(15,"999");
        System.out.println(m1);

        System.out.println("Printing HashMap: ");
        System.out.println("Using raw implementation: ");
        Set s = m1.entrySet();
        System.out.println(s);
        System.out.println("--------------------------");

        System.out.println("Printing keys:");
        Set<Integer> s1 = m1.keySet();
        System.out.println(s1);
        System.out.println("--------------------------");

        System.out.println("Printing values:");
        Collection<String> s2 = m1.values();
        System.out.println(s2);
        System.out.println("--------------------------");

        System.out.println("Printing HashMap using Iterator, Entry(I): ");
        Iterator<Entry<Integer, String>> i1 = m1.entrySet().iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("--------------------------");

        System.out.println("Printing HashMap using entry");
        for(Entry e: m1.entrySet()){
            System.out.println(e);
        }
        System.out.println("--------------------------");

        System.out.println("Printing HashMap using map and entry");
        for(Map.Entry me: m1.entrySet()){
            System.out.println(me);
        }
        System.out.println("--------------------------");
    }
}
