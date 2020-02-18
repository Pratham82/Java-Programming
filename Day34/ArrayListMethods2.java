package Day34;

import java.util.*;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(445);
        al1.add(256);
        al1.add(345);
        al1.add(178);
        al1.add(965);
        al1.add(847);

        System.out.println("Array list: ");
        for(int i: al1){
            System.out.println(i);
        }
        System.out.println("------------------------");

        System.out.println("Reverse method: ");
        System.out.println("The reversed array list: ");
        Collections.shuffle(al1);
        for(int i: al1){
            System.out.println(i);
        }
        System.out.println("------------------------");

        System.out.println("Shuffle method: ");
        System.out.println("The shuffled array list: ");
        Collections.shuffle(al1);
        for(int i: al1){
            System.out.println(i);
        }
        System.out.println("------------------------");

        System.out.println("Sort method: ");
        System.out.println("The sorted array list: ");
        Collections.shuffle(al1);
        for(int i: al1){
            System.out.println(i);
        }
        System.out.println("------------------------");

        System.out.println("Max method: ");
        //Gives us the highest number in the array list
        //first we have to store that number in a variable, and then we can print it out
        int varMax = Collections.max(al1);
        System.out.println("The Highest number in array list: "+varMax);
        System.out.println("------------------------");

        System.out.println("Min method: ");
        int varMin = Collections.min(al1);
        System.out.println("The lowest number in array list: "+varMin);
        System.out.println("------------------------");

        System.out.println("Swap method");
        Collections.swap(al1,1,2);
        System.out.println("Index 1 swapped with index 2: ");
        for(int i: al1){
            System.out.println(i);
        }
        System.out.println("------------------------");

        //Retrieving values from specific index
        System.out.println("Object present on index 1: "+al1.get(1));

        //Changing object value of specific index
        al1.set(1,999);
        System.out.println("Array list after chaining value: ");
        for(int i:al1){
            System.out.println(i);
        }
    }
}
