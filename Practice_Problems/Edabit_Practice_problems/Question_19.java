package Practice_Problems.Edabit_Practice_problems;
// Write a function that takes a number n and returns the number of stacked boxes in a model n levels high, visible and invisible.
public class Question_19 {
    public static void main(String args[]){
        System.out.println(Question_19.stackBoxes(4));
        System.out.println(Question_19.stackBoxes(2));
    }

    public static int stackBoxes(int n){
        return (int) Math.pow(n, 2);
    }
}
