package Practice_Problems.Edabit_Practice_problems;
// Create a function that takes a number (from 1 - 60) and returns a corresponding string of hyphens.
public class Question_50 {
    public static void main(String[] args) {
        System.out.println(Go(5));
    }

    public static  String Go(int num ){
//        String pattern = "-".repeat(num);
//        return pattern;
        if(num <= 1) return "-";
        return "-" + Go(num - 1);
    }
}
