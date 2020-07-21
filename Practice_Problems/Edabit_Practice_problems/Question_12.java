package Practice_Problems.Edabit_Practice_problems;
// Create a function that returns true if a string is empty and false otherwise.
public class Question_12 {
    public static void main(String args[]){
        System.out.println(Question_12.isEmpty("  "));
        System.out.println(Question_12.isEmpty(""));
        System.out.println(Question_12.isEmpty("  dgdfg"));
    }

    public static boolean isEmpty(String str){
        return str.isEmpty();
    }
}
