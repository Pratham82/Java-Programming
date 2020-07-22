package Practice_Problems.Edabit_Practice_problems;
//Create a function that takes two strings as arguments and return either true or false depending on whether the total number of characters in the first string is equal to the total number of characters in the second string.

public class Question_27 {
    public static void main(String[] args) {
        System.out.println(comp("ABC", "DE"));
        System.out.println(comp("hello", "edabit"));
    }
    public static boolean comp(String str1, String str2){
        return str1.length() == str2.length();
    }
}
