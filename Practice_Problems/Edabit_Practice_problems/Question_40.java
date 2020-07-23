package Practice_Problems.Edabit_Practice_problems;
// Return array into length on every index
import java.util.Arrays;

public class Question_40 {
    public static void main(String[] args) {
        int a1[] = new int[]{2, 3, 1, 0};
        int a2[] = new int[]{4, 1, 1};

        System.out.println(MultiplyByLength(a1));
        System.out.println(MultiplyByLength(a2));
    }

    public static int[] MultiplyByLength(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i =0; i< arr.length; i++) {
            newArr[i] = arr[i] * arr.length;
        }
        System.out.println("New Array: "+ Arrays.toString(newArr));
        return newArr;

    }
}
