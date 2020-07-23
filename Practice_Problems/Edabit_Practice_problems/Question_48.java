package Practice_Problems.Edabit_Practice_problems;

// Given a year you must implement a function that returns true if it's a leap year, or false if it's not.
public class Question_48 {
    public static void main(String[] args) {
        System.out.println(isLeap(2020));
        System.out.println(isLeap(2000));
        System.out.println(isLeap(2019));
    }

    public static boolean isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
