package Practice_Problems.Edabit_Practice_problems.Wam_up.Equality_of_3_values;

public class Solution {
    public static void main(String[] args) {
        System.out.println(equal(1, 1, 1));
        System.out.println(equal(3, 4, 3));
        System.out.println(equal(3, 4, 1));
    }

    public static int equal(int a, int b, int c) {
        return (a == b) && (b == c) ? 3 : (a == b) || (a == c) ? 2 : 0;
    }
}
