package Practice_Problems.Edabit_Practice_problems;

//For each of the 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. Create a function that takes n cups bought and return as an integer the total number of cups I would get.
public class Question_34 {
    public static void main(String[] args) {
        System.out.println(totalCups(12));
        System.out.println(totalCups(213));
    }

    public static int totalCups(int n) {
        return n / 6 + n;
    }

}
