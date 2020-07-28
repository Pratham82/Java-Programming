package Practice_Problems.Edabit_Practice_problems;
// Create a function that takes a number as an argument and returns the amount of digits it has.
public class Question_78 {
    public static void main(String[] args) {
        System.out.println(findDigitAmount(454254));
    }
    public static int findDigitAmount(int num) {
        return String.valueOf(num).length();
    }

}
