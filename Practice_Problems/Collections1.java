package Practice_Problems;

import java.util.ArrayList;
import java.util.Collections;

///Write a program to sort ArrayList in descending order
public class Collections1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(32);
        al.add(97);
        al.add(61);
        al.add(21);
        al.add(51);
        System.out.println("Before reversing: ");

        for(int i: al){
            System.out.println(i);
        }
        System.out.println("-------------------");

        Collections.sort(al,Collections.reverseOrder());
        for(int i: al){
            System.out.println(i);
        }


    }
}
