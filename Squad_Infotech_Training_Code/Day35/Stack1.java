package Day35;

import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.addElement("String");
        s1.addElement(454);
        s1.addElement(93.5);
        s1.addElement('c');
        s1.addElement(true);

        System.out.println("Printing using for each loop: ");
        for(Object o: s1){
            System.out.println(o);
        }
        System.out.println("------------------------------");

        System.out.println("Printing using Iterator: ");
        Iterator i1 = s1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("------------------------------");

        System.out.println("Printing using foreach method: ");
        s1.forEach(System.out::println);
        System.out.println("------------------------------");

        System.out.println("Reversing stack: ");
        Collections.reverse(s1);
        for(Object o: s1){
            System.out.println(o);
        }

        Stack<Integer> s2 = new Stack<>();
        s2.add(454);
        s2.add(352);
        s2.add(247);
        s2.add(748);
        s2.add(634);
        s2.add(158);

        for(int i: s2){
            System.out.println(i);
        }
        System.out.println("------------------------------");

        System.out.println("Sorting stack: ");
        Collections.sort(s2);
        s2.forEach(System.out::println);
        System.out.println("------------------------------");

        System.out.println("Max method: ");
        int max = Collections.max(s2);
        System.out.println("The highest value in a stack: "+max);
        System.out.println("------------------------------");

        System.out.println("Min method: ");
        int min = Collections.min(s2);
        System.out.println("The lowest value in a stack: "+min);
        System.out.println("------------------------------");

    }
}
