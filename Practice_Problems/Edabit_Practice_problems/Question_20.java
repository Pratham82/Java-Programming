package Practice_Problems.Edabit_Practice_problems;

// Write a function that takes two integers (hours, minutes), converts them to seconds, and adds them.
public class Question_20 {
    public static void main(String args[]) {
        System.out.println(Question_20.convert(1, 3));
    }

    public static int convert(int hours, int minutes){
        return hours*60*60 + minutes *60;
    }

}
