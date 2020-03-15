package Day34;

import java.util.*;

public class ArrayListNew {
    public static void main(String[] args) {
        List al= new ArrayList<>();
        al.add('a');
        al.add("Strging 1");
        al.add(4564);
        al.add(8454.45);
        al.add(true);

        //Collections.sort(al);
        System.out.println(al);

        //Arraylist increases the capacity by 50%
        //It is not thread safe (Because methods are not synchronized)
        //Arraylist is fast
        ArrayList<Integer> al2 = new ArrayList<>();
        //ArrayList<Integer> al3 = new ArrayList<>();
        al2.add(54);
        al2.add(12);
        al2.add(61);
        al2.add(21);
        al2.add(32);
        al2.add(1,5);
        //Collections.sort(al2);

        //Printing list

        //ToString
        System.out.println("\nUsing to String");
        System.out.println(al2);

        //Enhanced for loop
        System.out.println("\nUsing Enhanced for loop");
        for(int i:al2){
            System.out.print(i+", ");
        }

        //forEach method
        System.out.println("\nUsing forEach method");
        al2.forEach(System.out::println);

        System.out.println("\n\nUsing Iterator");
        Iterator i = al2.listIterator();
        while(i.hasNext()){
            System.out.print(i.next() +", ");
        }

        System.out.println("\n\nUsing list Iterator");
        ListIterator li = al2.listIterator();
        while(li.hasNext()){
            System.out.print(li.next()+", ");
        }



    }
}
