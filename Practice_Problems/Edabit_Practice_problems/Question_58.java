package Practice_Problems.Edabit_Practice_problems;
// A decimal number can be represented as a sequence of bits. To illustrate:
//
//6 = 00000110
//23 = 00010111
public class Question_58 {
    public static void main(String[] args) {
        System.out.println(bitwiseAND(6, 23));
        System.out.println(bitwiseOR(6, 23));
        System.out.println(bitwiseXOR(6, 23));
    }

    public static int bitwiseAND(int n1, int n2) {
        return n1 & n2;
    }

    public static int bitwiseOR(int n1, int n2) {
        return  n1 | n2;
    }

    public static int bitwiseXOR(int n1, int n2) {
        return n1 ^ n2;
    }
}
