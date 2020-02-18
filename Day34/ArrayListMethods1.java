package Day34;

import java.util.*;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        //For sorting an array list we have to give the Datatype in diamond operators
        //If we are creating an object of same class then the Data type in < >Diamond operators must be same
        //If we don't provide the Datatype while crating an object after new keyword it will automatically take Datatype on left side
        ArrayList<String> al = new ArrayList<>();
        al.add("John");
        al.add("Sansa");
        al.add("Arya");
        al.add("Rob");
        al.add("Tyrion");
        al.add("Cercy");

        System.out.println("Array list: ");
        for(String  s: al){
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        System.out.println("Sorting array list: ");
        //sort method is taken from collections class
        //This will sort the list alphabetically
        Collections.sort(al);
        for(String s: al){
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        System.out.println("indexOfMethod: ");
        System.out.println("Index of object 986: "+al.indexOf("Sansa"));
        System.out.println("--------------------------------");

        System.out.println("contains method: ");
        System.out.println("Is 445 is presents in our list: "+al.contains("John"));
        System.out.println("--------------------------------");

        System.out.println("isEmpty method: ");
        System.out.println(al.isEmpty());
        System.out.println("--------------------------------");

        System.out.println("clear method"); //this will clear arraylist
        al.clear();
        System.out.println("After applying clear: ");
        System.out.println(al.isEmpty());
        System.out.println("--------------------------------");
    }
}
