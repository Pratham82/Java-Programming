package Day35;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
          /*Properties of HashSet:
        1) Does not follow insertion order while printing a set.
        2) Allows adding duplicate values but only one copy of that value will be printed
        3) Allows adding multiple null values for to an object, that null value will be printed only once

        * */
        HashSet<Integer> hs = new HashSet<>();
        hs.add(675);
        hs.add(256);
        hs.add(154);
        hs.add(364);
        hs.add(754);
        hs.add(754);
        hs.add(null);
        hs.add(null);

        for(Integer i: hs){
            System.out.println(i);
        }
    }
}
