package Practice_Problems.Edabit_Practice_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question_96 {
    public static void main(String[] args) {

      System.out.println(leftDigit("TrAdE2W1n95!"));
    }
    public static int leftDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                return Integer.parseInt(Character.toString(c));
        }
        return 0;
    }
}
