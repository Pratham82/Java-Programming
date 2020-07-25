package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;
import java.util.List;

// Take an array of integers (positive or negative or both) and return the sum of the absolute value of each element.
public class Question_68 {
    public static void main(String[] args) {
        int a []= {2, -1, 4, 8, 10};
        System.out.println(getAbsSum(a));//25
    }
    public static int getAbsSum(int[] nums) {
        int sum =0;
        for(int i : nums){
            sum +=  Math.abs(i);
        }
        return sum;
    }

}
