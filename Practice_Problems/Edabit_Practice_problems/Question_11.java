package Practice_Problems.Edabit_Practice_problems;
// Create a function that takes an integer and return true if it's divisible by 100, otherwise return false.
public class Question_11 {
    public static void main(String args[]){
        System.out.println(Question_11.divisible(111));
        System.out.println(Question_11.divisible(1000));
    }

    public static boolean divisible(int num){
        return num %100 ==0;
    }
}
