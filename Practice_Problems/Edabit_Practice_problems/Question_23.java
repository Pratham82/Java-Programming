package Practice_Problems.Edabit_Practice_problems;

public class Question_23 {
    public static void main(String[] args) {
        System.out.println(Question_23.lessThanOrEqualToZero(5));
        System.out.println(Question_23.lessThanOrEqualToZero(0));
        System.out.println(Question_23.lessThanOrEqualToZero(-15));
    }

    public static boolean lessThanOrEqualToZero(int num) {
        return num <= 0;
    }
}
