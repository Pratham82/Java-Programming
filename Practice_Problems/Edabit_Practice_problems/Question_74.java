package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;

//Given an array of integers, return the difference between the largest and smallest integers in the array.
public class Question_74 {
    public static void main(String[] args) {
        int a[] = new int[]{10, 15, 20, 2, 10, 6};
        System.out.println(difference(a));
    }
    public static int difference(int []nums){
        int sorted [] = nums.clone();
        Arrays.sort(sorted);
        return sorted[sorted.length-1] - sorted[0];
    }


}
