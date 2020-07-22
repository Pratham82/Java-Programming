package Practice_Problems.Edabit_Practice_problems;

// Write a function to check if an array contains a particular number.
public class Question_30 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(check(arr1, 11));
    }

    public static boolean check(int[] arr, int el) {
        int c = 0;
        for (int value : arr) {
            if (el == value) {
                c++;
            }
        }
        return c > 0;
    }
}
