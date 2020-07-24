package Practice_Problems.Edabit_Practice_problems;

// Write a function that recursively finds the sum of the first n natural numbers.
public class Question_54 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
//        if(n!=0){
//            return n+ sum(n-1);
//        }else{
//            return n;
//        }

        return n != 0 ? n + sum(n - 1) : n;
    }
}
