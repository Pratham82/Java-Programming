package Practice_Problems.Edabit_Practice_problems;
// Find the hamming difference
public class Question_59 {
    public static void main(String[] args) {
        System.out.println(hammingDistance("abcde", "bcdef"));//5
        System.out.println(hammingDistance("abcde", "abcde"));//0
    }

    public static int hammingDistance(String str1, String str2) {
        int diff =0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) !=str2.charAt(i)){
                diff++;
            }
        }
        return diff;

    }
}
