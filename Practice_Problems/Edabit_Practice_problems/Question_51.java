package Practice_Problems.Edabit_Practice_problems;

//Create a function that takes an integer and returns the factorial of that integer. That is, the integer multiplied by all positive lower integers.
public class Question_51 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;

        }
        return fact;
    }
}
