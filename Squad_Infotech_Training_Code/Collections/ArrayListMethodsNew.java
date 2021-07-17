package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListMethodsNew {
    public static void main(String[] args) {
        ArrayList<Integer> al2 = new ArrayList<>();
        //ArrayList<Integer> al3 = new ArrayList<>();
        al2.add(54);
        al2.add(12);
        al2.add(61);
        al2.add(21);
        al2.add(32);
        System.out.println(al2);
        System.out.println("\n\nMethods in List:");



        //System.out.println(al2.get(10));;
        System.out.println("Size of a list: "+al2.size());

        //set (Index, value)
        al2.set(1,52);

        //get
        System.out.println(al2.get(1));

        //Contains method
        System.out.println("DOes this list contains 21:"+al2.contains(21));

        System.out.println(al2);

        System.out.println("Reverse method: ");
        System.out.println("The reversed array list: ");
        Collections.reverse(al2);
        for(int i: al2){
            System.out.println(i);
        }
        System.out.println("------------------------");

        System.out.println("Shuffle method: ");
        System.out.println("The shuffled array list: ");
        Collections.shuffle(al2);
        for(int i: al2){
            System.out.println(i);
        }
        System.out.println("------------------------");

        System.out.println("Sort method: ");
        System.out.println("The sorted array list: ");
        Collections.shuffle(al2);
        for(int i: al2){
            System.out.println(i);
        }
        System.out.println("------------------------");

        System.out.println("Max method: ");
        //Gives us the highest number in the array list
        //first we have to store that number in a variable, and then we can print it out
        int varMax = Collections.max(al2);
        System.out.println("The Highest number in array list: "+varMax);
        System.out.println("------------------------");

        System.out.println("Min method: ");
        int varMin = Collections.min(al2);
        System.out.println("The lowest number in array list: "+varMin);
        System.out.println("------------------------");

        System.out.println("Swap method");
        Collections.swap(al2,1,2);
        System.out.println("Index 1 swapped with index 2: ");
        for(int i: al2){
            System.out.println(i);
        }
        System.out.println("------------------------");

        //Sorting on the basis of the last number of the element
        //Collections.sort()
        //Collections.sort(al2);

        Collections.sort(al2,new CollectionsImpl());

        //Using lambda expression
        /*Comparator<Integer> ci = (o1, o2)->{
            return o1%10>o2%10 ?1 :-1;
        };

        Collections.sort(al2,ci);
        */
        for(int i:al2){
            System.out.println(i);
        }


        //Copying one list to another list(Copies al3 to al2)
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("111");
        list1.add("112");
        list1.add("113");
        list1.add("114");
        list1.add("115");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        System.out.println("Before copying");

        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);

        System.out.println("After copying:");
        Collections.copy(list1,list2);

        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);

        //Using copy method
        //list2 = (ArrayList<String>) list1.clone();

        //Comparing two lists
        for(String s: list1){
            System.out.println(list2.contains(s)?"Contains the value":"does not contain the value");
        }


    }
}
