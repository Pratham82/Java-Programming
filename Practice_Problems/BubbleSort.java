package Practice_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n;
        int temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Array Length");
        n=sc.nextInt();

        int[] arr =new int[n];

        System.out.println("Enter The Array Element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted List: ");
        for(int i=1;i<arr.length;i++) {
            for(int j=0;j<arr.length-1;j++) {

                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorting :"+ Arrays.toString(arr));
    }
}


