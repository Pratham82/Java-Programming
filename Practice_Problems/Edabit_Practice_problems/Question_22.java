package Practice_Problems.Edabit_Practice_problems;

// Create a method that accepts an array and returns the last item in the array.
public class Question_22 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        System.out.println(Question_22.getLasItem(a));
    }

    public static int getLasItem(int nums[]) {
        return nums[nums.length - 1];
    }

}
