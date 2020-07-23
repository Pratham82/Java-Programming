package Practice_Problems.Edabit_Practice_problems;
//Write a function that takes an integer and returns a string with the given number of "a"s in Edabit.
public class Question_44 {
    public static void main(String[] args) {
        System.out.println(howManyTimes(5));
        System.out.println(howManyTimes(15));
    }

    public static String howManyTimes(int num){
//        String rep = "a";
//        String e = "Ed";
//        String b ="bit";
//
//        return e+rep.repeat(num)+b;
        return "Ed"+"a".repeat(num)+"bit";

    }
}
