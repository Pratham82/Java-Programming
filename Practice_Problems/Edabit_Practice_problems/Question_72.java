package Practice_Problems.Edabit_Practice_problems;
// Create a function that takes two numbers and a mathematical operator and returns the result.
public class Question_72 {
    public static void main(String[] args) {
        System.out.println(calculate(4, 9, "+"));
    }
    public static int calculate(int num1, int num2, String operation) {
        return operation.equals("+")? num1+num2:operation.equals("-")?
                num1-num2:operation.equals("*")?num1*num2:operation.equals(
                        "/")?num1/num2:operation.equals("%")?num1%num2:0;
    }

}
