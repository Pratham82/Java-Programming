package Practice_Problems.Edabit_Practice_problems;

// Write a function that takes two numbers and returns if they should be added, subtracted, multiplied or divided to get 24. If none of the operations can give 24, return "none".
public class Question_33 {
    public static void main(String[] args) {
        System.out.println(operation(528, 22));
    }

    public static String operation(int num1, int num2) {
        String op = "";
        if (num1 + num2 == 24) {
            op = "added";
        } else if (num1 - num2 == 24) {
            op = "subtracted";
        } else if (num1 * num2 == 24) {
            op = "multiplied";
        } else if (num1 / num2 == 24) {
            op = "divided";
        }else{
            op = "none";
        }
        return op;
    }
}
