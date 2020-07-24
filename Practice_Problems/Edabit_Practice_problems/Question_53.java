package Practice_Problems.Edabit_Practice_problems;
// Write a function that calculates the factorial of a number recursively.
public class Question_53 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
//        if(n == 0){
//            return 1;
//        }else{
//           return n* factorial(n-1);
//        }
        return n==0?1: n*factorial(n-1);

    }
}
