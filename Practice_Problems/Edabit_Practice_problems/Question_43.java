package Practice_Problems.Edabit_Practice_problems;
// Write a function that returns true if k^k == n for input (n, k) and return false otherwise.
public class Question_43 {
    public static void main(String[] args) {
        System.out.println(kToK(4,2));
        System.out.println(kToK(3124,5));
    }

    public static boolean kToK(int n, int k){
        return Math.pow(k, k) == n;
    }
}
