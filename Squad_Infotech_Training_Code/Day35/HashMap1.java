package Day35;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String []args){
        /*Properties of Hashmap:
        1) Does not follow insertion order while printing map
        2) Allows adding duplicate values for but only one copy of that value will be printed
        3) If we are having duplicate keys then the latest value(value which is added last)of the key will be printed
        3) Allowed adding multiple null values but only one null value will be printed
        */
        Map<Integer,String> m1 = new HashMap<Integer,String>();
        m1.put(12,"Test 1");
        m1.put(10,"Test 6");
        m1.put(16,"Test 7");
        m1.put(11,"Test 9");
        m1.put(13,"Test 4");
        m1.put(15,"454");
        m1.put(15,"151");
        m1.put(15,"4564");
        m1.put(15,"999");
        System.out.println(m1);
    }
}
