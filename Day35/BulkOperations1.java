package Day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperations1 {
    public static void main(String[] args) {
        List<String> ls1 = new ArrayList<String>(Arrays.asList("Arron","Beck","Carrel","Denis","Frank","George","Hank","Immanuel"));
        List<String> ls2 = new ArrayList<String>(Arrays.asList("Arron","Beck","Carrel"));
        List<String> ls3 = new ArrayList<String>(Arrays.asList("Jack","Kirk","Lupin"));

        System.out.println("List 1: ");
        for(String s: ls1){
            System.out.println(s);
        }
        System.out.println("------------");
        System.out.println("List 3: ");
        for(String s: ls2){
            System.out.println(s);
        }
        System.out.println("------------");
        System.out.println("List 3: ");
        for(String s: ls3){
            System.out.println(s);
        }
        System.out.println("------------");

        System.out.println("Contains all method: ");
        //Checks if list which is inside parentheses contains the elements of list which is outside
        System.out.println(ls1.containsAll(ls2));
        System.out.println(ls2.containsAll(ls1));
        System.out.println("---------------");

        System.out.println("add all method: ");
        //Adds the list which is inside the parentheses to the list which is outside.
        ls1.addAll(ls2);
        System.out.println("List 1: ");
        for(String s: ls1){
            System.out.println(s);
        }
        System.out.println("---------------");

        System.out.println("Remove all method: ");
        //Removes all the objects which are common in list outside and inside of the parenthesis
        ls1.removeAll(ls2);
        System.out.println("List 1: ");
        for(String s: ls1){
            System.out.println(s);
        }
        System.out.println("---------------");

        List<String> ls4 = new ArrayList<String>(Arrays.asList("Arron","Beck","Carrel","Denis"));
        List<String> ls5 = new ArrayList<String>(Arrays.asList("Arron","Beck"));
        System.out.println("Retain all method");
        //Prints out all the common objects between both the lists
        ls4.retainAll(ls5);
        for(String s: ls4){
            System.out.println(s);
        }
        System.out.println("---------------");

    }
}
