package Practice_Problems.Edabit_Practice_problems;
// Compare strings caseInsensitive
public class Question_25 {
    public static void main(String[] args) {
        System.out.println(match("hello", "hELLo"));
        System.out.println(match("motive", "emotive"));
    }

    public static boolean match(String str1, String str2){
        return str1.equalsIgnoreCase(str2);
    }
}
