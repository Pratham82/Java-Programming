package Practice_Problems.Edabit_Practice_problems;

public class Question_13 {
    public static void main(String []args){
        System.out.println(Question_13.isEvenOrOdd(45));
        System.out.println(Question_13.isEvenOrOdd(124));
        System.out.println(Question_13.isEvenOrOdd(78));
    }

    public static String isEvenOrOdd(int num){
        return num %2==0?"even":"odd";
    }
}
