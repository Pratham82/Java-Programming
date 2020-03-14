package Day34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

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
    }
}
