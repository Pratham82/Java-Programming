package Practice_Problems.Edabit_Practice_problems;
/*
Create a method that takes a positive integer and returns the nth "star number".

A star number is a centered figurate number a centered hexagram (six-pointed star), such as the one that Chinese checkers is played on.
* */
public class Question_57 {
    public static void main(String[] args) {
        System.out.println(starNumber(2)); //13
        System.out.println(starNumber(3)); //13
    }

    public static int starNumber(int n){
        return 6*n*(n-1)+1;
    }
}
