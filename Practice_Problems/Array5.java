package Practice_Problems;

import java.util.Arrays;
import java.util.HashSet;

//16. Write a Java program to remove duplicate elements from an array.
public class Array5 {
    public static void main(String[] args) {
        int[] Arr1 ={111,612,21,1,5454,612,111,41,21,5454,5454,612};
        System.out.println("Using arrays: ");
        System.out.println("Original Array: ");
        for(int i: Arr1){
            System.out.print(i+" ");
        }

        int lenA = Arr1.length;
        //Removing duplicate elements:
        for(int i= 0; i<lenA;i++){
            for(int j= i+1;j<lenA;j++){
                if(Arr1[i]==Arr1[j]){
                    Arr1[j] = Arr1[lenA-1];
                    lenA--;
                    j--;

                }
            }
        }
        int[] array1 = Arrays.copyOf(Arr1, lenA);

        System.out.println("\nArray without duplicate values: ");
        for(int i:array1){
            System.out.print(i+" ");
        }

        System.out.println("\n\nUsing hashset: ");

        int [] Arr2 ={22,55,541,3487,55,44,64,34,55,541,22};
        System.out.println("Original array: ");
        for(int i:Arr2){
            System.out.print(i+" ");
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i:Arr2){
            hs.add(i);
        }

        System.out.println("\nArray without duplicate values: ");
        for(Integer i: hs){
            System.out.print(i+" ");
        }
    }

}
