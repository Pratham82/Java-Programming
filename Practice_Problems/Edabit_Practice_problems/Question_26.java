package Practice_Problems.Edabit_Practice_problems;

// Write a function that returns the length of a string. Make your function recursive.
public class Question_26 {
    public static void main(String[] args) {
        System.out.println(length("12345"));
    }

    public static int length(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return length(str.substring(1)) + 1;
        }


    }
}
