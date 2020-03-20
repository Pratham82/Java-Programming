package Practice_Problems;

import java.util.TreeSet;

//Write a Java program to compare two tree sets.
public class Collections6 {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(453);
        ts1.add(324);
        ts1.add(354);
        ts1.add(254);
        ts1.add(947);
        ts1.add(648);
        ts1.add(119);
        System.out.println("Tree set 1: ");
        for(int i:ts1){
            System.out.println(i);
        }
        System.out.println("-------------");

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(453);
        ts2.add(354);
        ts2.add(394);
        ts2.add(954);
        ts2.add(147);
        ts2.add(748);
        ts2.add(819);
        System.out.println("Tree set 2: ");
        for(int i:ts2){
            System.out.println(i);
        }
        int count =0;
        System.out.println("-------------");
        for(int i:ts1){
            System.out.println(ts2.contains(i)? count++ +"Element contains in tree set":"Element does not contain in tree set");
        }

        System.out.println("Total matching elements: "+count );

    }
}
