package Practice_Problems.Edabit_Practice_problems;
/*
Multi-division
Create a function, that will for a given a, b, c, do the following:

Add a to itself b times.
Check if the result is divisible by c.
Examples
abcmath(42, 5, 10) ➞ false
// 42+42 = 84,84+84 = 168,168+168 = 336,336+336 = 672, 672+672 = 1344
// 1344 is not divisible by 10

 */
public class Question_95 {
    public static void main(String []args){
        System.out.println(abcmath(42,5,10));// false
        System.out.println(abcmath(5, 2, 1));
    }
    public static boolean  abcmath(int a, int b, int c){
        int a2 = a;
        for(int i =1; i<= b;i++){
            a2 += a2;
        }
        return a2%c==0;

    }
}
