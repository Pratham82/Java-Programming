package Practice_Problems.Edabit_Practice_problems;
// Check if the elements in array are factor of the given number
public class Question_61 {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 3, 4};
        int[] a2 = new int[]{1, 2, 3, 8};
        int[] a3 = new int[]{1, 2, 50};
        System.out.println(checkFactors(a1, 12));
        System.out.println(checkFactors(a2, 12));
        System.out.println(checkFactors(a3, 100));
    }

    public static boolean checkFactors(int[] factors, int num) {
        int check = 0;

        for (int i = 0; i < factors.length; i++) {
            if (num % factors[i] != 0) {
                check++;
            }
        }

        return check == 0;
    }
}
