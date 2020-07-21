package Practice_Problems.Edabit_Practice_problems;
// Given two integers, a and b, return true if a can be divided evenly by b. Return false otherwise.
public class Question_8 {
    public static void main(String []args){
        System.out.println(Question_8.dividesEvenly(85,5));
    }
    public static boolean dividesEvenly(int a,  int b){

        return a %b == 0;
    }
}
