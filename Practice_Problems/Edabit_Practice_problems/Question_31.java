package Practice_Problems.Edabit_Practice_problems;

// Create a function that searches for the index of a given item in an array. If the item is present, it should return the index, otherwise, it should return -1.
public class Question_31 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4, 6, 8, 10};
        System.out.println(search(arr1, 89));
    }

    public static int search(int arr[], int item) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                a = i;
            } else {
                b++;
            }
        }
        if (b == arr.length) {
            a = -1;
        }

        return a;

    }
}
