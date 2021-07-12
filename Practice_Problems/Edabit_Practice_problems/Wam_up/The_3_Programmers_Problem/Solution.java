package Practice_Problems.Edabit_Practice_problems.Wam_up.The_3_Programmers_Problem;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(programmers(23, 55, 32));
        System.out.println(programmers(147, 33, 526));

    }

    public static int programmers(int one, int two, int three) {
        int[] salaries = new int[]{one, two, three};
        Arrays.sort(salaries);
        return salaries[2] - salaries[0];
    }
}
