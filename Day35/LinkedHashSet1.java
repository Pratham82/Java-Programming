package Day35;

import java.util.*;

public class LinkedHashSet1 {
    public static void main(String[] args) {
         /*Properties of LinkedHashSet:
        1) Follows insertion order while printing a set.
        2) Allows adding duplicate values but only one copy of that value will be printed
        3) Allows adding multiple null values for to an object, that null value will be printed only once(at the end of set).
        * */
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(675);
        lhs.add(256);
        lhs.add(154);
        lhs.add(364);
        lhs.add(754);
        lhs.add(754);
        lhs.add(364);
        lhs.add(null);
        lhs.add(null);
        lhs.add(754);

        for(Integer i: lhs){
            System.out.println(i);
        }
    }
}
