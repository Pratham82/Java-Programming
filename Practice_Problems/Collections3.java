package Practice_Problems;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to remove a specified element from a linked list.
public class Collections3 {
    public static void main(String[] args) {

        ArrayList<Integer> al1= new ArrayList<>();
        al1.add(324);
        al1.add(654);
        al1.add(465);
        al1.add(289);
        al1.add(787);

        System.out.println("Before removal");
        for(int i:al1){
            System.out.println(i);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter index number to delete that element: ");
        int ind = scan.nextInt();

        System.out.println("After removal");
        al1.remove(ind);
        System.out.println("Number removed from the list");

        for(int i: al1){
            System.out.println(i);
        }


    }
}
