package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;

/*
This is a reverse coding challenge. Normally you're given explicit directions with
 how to create a function. Here, you must generate your own function to satisfy the relationship between the inputs and outputs.

Your task is to create a function that, when fed the inputs below, produce the sample outputs

[5, 7, 8, 2, 1], 2 ➞ [1, 1, 0, 0, 1]

[9, 8, 16, 47], 4 ➞ [1, 0, 0, 3]

 */
public class Question_63 {
    public static void main(String []args){
        int[] a1 = new int[]{5, 7, 8, 2, 1};
        int[] a2 = new int[]{9, 8, 16, 47};

        System.out.println(mysteryFunc(a1,2));
        System.out.println(mysteryFunc(a1,4));

    }
    public static int[] mysteryFunc(int [] arr, int num){
        int[] newArr = new int[arr.length];
        for(int i=0; i< arr.length; i++){
                newArr[i] = arr[i] %num;
        }
        //return Arrays.toString(newArr);
        return newArr;
    }
}
