package Day35;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        /*Properties of Set:
        1) Does not follow insertion order while printing a set.
        2) Allows adding duplicate values but only one copy of that value will be printed
        3) Allows adding multiple null values for to an object, that null value will be printed at the start of the set
        **Allows adding null value for to an object, but we will get nullPointerException while printing a set.
        * */
        Set s1 = new HashSet<>();
       /* s1.add(675);
        s1.add(256);
        s1.add(154);
        s1.add(364);
        s1.add(754);
        s1.add(754);*/

       s1.add(545);
       s1.add(26.51);
       s1.add("String 5645");
       s1.add('d');
       s1.add('d');
       s1.add(null);
       s1.add(null);

        for(Object o: s1){
            System.out.println(o);
        }
    }
}
