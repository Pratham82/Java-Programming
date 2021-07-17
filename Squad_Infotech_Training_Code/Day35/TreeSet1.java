package Day35;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
          /*Properties of TreeSet:
        1) All the values in set will be sorted.
        2) Allows adding duplicate values but only one copy of that value will be printed
        3) Allows adding null value for to an object, but we will get nullPointerException while printing a set
        * */
        ts.add(675);
        ts.add(256);
        ts.add(154);
        ts.add(364);
        ts.add(754);
        ts.add(754);
        //ts.add(null);
        //ts.add(null);

        for(Integer i: ts) {
            System.out.println(i);
        }
    }
}
