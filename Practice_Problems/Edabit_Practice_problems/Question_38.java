package Practice_Problems.Edabit_Practice_problems;

// Return the sum of all items in an array, where each item is multiplied by its index (zero-based). For empty arrays, return 0.
public class Question_38 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{-3, 0, 8, -6};
        System.out.println(indexMultiplier(a1));
        System.out.println(indexMultiplier(a2));

    }

    public static int indexMultiplier(int[] arr) {
        int indexMul = 0;
        for (int i = 0; i < arr.length; i++) {
            indexMul += arr[i] * i;
        }
        return indexMul;
    }


}
