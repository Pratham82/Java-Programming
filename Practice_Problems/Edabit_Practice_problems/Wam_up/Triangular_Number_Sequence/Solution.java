package Practice_Problems.Edabit_Practice_problems.Wam_up.Triangular_Number_Sequence;

public class Solution {
    public static void main(String[] args) {
        System.out.println(triangle(215));
    }

    public static int triangle(int n) {
        int next_num = 0;
        for (int i = 0; i <= n; i++) next_num += i;
        return next_num;
    }
}
