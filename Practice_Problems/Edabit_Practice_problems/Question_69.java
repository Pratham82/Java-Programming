package Practice_Problems.Edabit_Practice_problems;
// Create a function that takes in an array of numbers and returns the sum of its cubes.
public class Question_69 {
    public static void main(String[] args) {
        int a [] = new int[]{1, 5, 9};
        System.out.println(sumOfCubes(a));
    }
    public static int sumOfCubes(int[] nums) {
        int sums=0;
        for(int i: nums){
            sums += Math.pow(i,3);
        }
        return sums;
    }
}
