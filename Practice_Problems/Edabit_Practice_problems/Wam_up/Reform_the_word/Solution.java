package Practice_Problems.Edabit_Practice_problems.Wam_up.Reform_the_word;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWord("seas", "onal"));

    }

    public static String getWord(String left, String right) {
        return left.toUpperCase().charAt(0) + left.substring(1) + right;
    }
}
