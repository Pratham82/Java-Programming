package Practice_Problems.Edabit_Practice_problems;

// Create a function that returns the minimum number of removals to make the sum of all elements in an array even.
public class Question_73 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(minimumRemovals(a));
    }

    public static int minimumRemovals(int arr[]) {
        int sum = 0;
        int res = 0;
        for (int i =0;i< arr.length;i++) {
            sum += arr[i];
        }
//        if (sum % 2 == 0) {
//            return res;
//        } else {
//            int arrSum = 0;
//            for (int i = arr.length - 1; i >= 0; i--) {
//                sum -= arr[i];
//                if (sum % 2 == 0) {
//                    return 1;
//                }
//            }
            return sum % 2 == 0?0:1;
        }

    }

