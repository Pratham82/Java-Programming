package Practice_Problems;

import java.util.HashMap;
import java.util.Scanner;

//Write a java program to remove a value from the map.

public class Collections5 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,String> hm2 = new HashMap<>();
        hm2.put(101,"Red");
        hm2.put(102,"Green");
        hm2.put(103,"Blue");
        hm2.put(104,"Yellow");
        hm2.put(105,"Orange");

        System.out.println(hm2);

        System.out.print("Enter the key to delete value from a hashmap: ");
        int num =scan.nextInt();

        hm2.remove(num);

        System.out.println("Hashmap after removal:");
        System.out.println(hm2);
    }
}
