package Practice_Problems.Edabit_Practice_problems;

/*
 * Create a method that takes an integer as an argument. Add up all the numbers from 1 to the number you passed to the function.
 * For example, if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.
 * */
public class Question_42 {
    public static void main(String[] args) {
        System.out.println(add_up(4));
    }

    public static int add_up(int num) {
        int fin = 0;
        for (int i = 1; i <= num; i++) {
            fin += i;
        }
        return fin;
    }
}
