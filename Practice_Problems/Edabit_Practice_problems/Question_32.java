package Practice_Problems.Edabit_Practice_problems;
// Convert string to int and vice versa
public class Question_32 {
    public static void main(String[] args) {
        System.out.println(toInt("77"));
        System.out.println(toStr(784));
        System.out.println(toInt("445"));
        System.out.println(toInt("781"));
        System.out.println(toStr(77));
    }
    public static int toInt(String str) {

        return Integer.parseInt(str);

    }

    public static String toStr(int num) {

        return String.valueOf(num);
    }
}
