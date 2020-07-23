package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;

// Create a function that adds a string ending to each member in an array.
public class Question_47 {
    public static void main(String[] args) {
        String str1[] = new String[]{"clever", "meek", "hurried", "nice"};
        String str2[] = new String[]{"new", "pander", "scoop"};

        System.out.println(addEnding(str1, "ly"));
        System.out.println(addEnding(str2, "er"));
    }

    public static String  addEnding(String[] arr, String ending){
        String [] newArr = new String[arr.length];
        for(int i =0; i< arr.length; i++){
            newArr[i] =  arr[i].concat(ending);

        }

        return Arrays.toString(newArr);
    }
}
