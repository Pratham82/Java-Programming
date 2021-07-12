package Practice_Problems.Edabit_Practice_problems.Wam_up.How_many_vowels;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCount("Celebration"));

    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        str = str.toLowerCase();

        // Your code here
        String[] charArr = str.split("");
        String vowels = "aeiou";
        for (String s : str.split(""))
            if (vowels.contains(s)) vowelsCount += 1;
        return vowelsCount;
    }
}
