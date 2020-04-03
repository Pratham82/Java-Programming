package Practice_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Write a Java program to test if a map contains a mapping for the specified key.
//Remove that element
public class Collections4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(101,"Red");
        m1.put(102,"Green");
        m1.put(103,"Blue");
        m1.put(104,"Yellow");
        m1.put(105,"Orange");

        System.out.println(m1);
        System.out.print("Enter value to check in a map: ");
        String val = scan.next();
        
        //Set<Map.Entry<Integer,String>> s1 = m1.entrySet();
        if(m1.containsValue(val)){
            System.out.println("Map contains the specified value");
        }else{
            System.out.println("Map does not contain the specified value");
        }
        scan.close();
    }
}
