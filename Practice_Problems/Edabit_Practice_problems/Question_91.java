package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;

/*
Generate a Countdown of Numbers in an Array
Create a function that takes a number as an argument and returns an array of numbers counting down from this number to zero.
 */
public class Question_91 {
    public static void main(String[] args) {
        System.out.println(countdown(10));
        //[10,9,8,7,6,5,4,3,2,1,0]
    }
    public static int[] countdown(int start) {
        int a[] = new int[start+1];
        int j = 0;
        for(int i =start; i>=0; i--){
            a[j] = i;
            System.out.println(a[i]);
            j++;
        }
        return a;

    }

}
