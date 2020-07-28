package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;

/*
You're in the midst of creating a typing game.

Create a function that takes in two arrays: the array of user-typed words, and
the array of correctly-typed words and outputs an array containing 1s
(correctly-typed words) and -1s (incorrectly-typed words).

Inputs:
User-typed Array: ["cat", "blue", "skt", "umbrells", "paddy"]
Correct Array: ["cat", "blue", "sky", "umbrella", "paddy"]

Output: [1, 1, -1, -1, 1]

*/
public class Question_76 {
    public static void main(String[] args) {
        String u1 [] = new String[]{"cat", "blue", "skt", "umbrells", "paddy"};
        String c1 [] = new String[]{"cat", "blue", "sky", "umbrella", "paddy"};
        System.out.println(correctStream(u1,c1)); // [1, 1, -1, -1, 1]
    }
    public static int[] correctStream(String[] user, String[] correct) {
        int[] arr = new int[correct.length];
        for(int i =0; i<correct.length; i++){
            if(user[i].equals(correct[i])){
                arr[i] =1;
            }else{
                arr[i]=-1;
            }
        }

        return arr;
    }
}

















