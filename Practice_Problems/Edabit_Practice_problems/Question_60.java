package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;

public class Question_60 {
    public static void main(String[] args) {
        String s1[] = new String[]{"one", "two"};
        String s2[] = new String[]{"edabit", "13", "true"};
        String s3[] = new String[]{"zero"};
        System.out.println(firstLast(s1));
        System.out.println(firstLast(s2));
        System.out.println(firstLast(s3));
    }

    public static String[] firstLast(String[] arr){
        String[] newArr = new String[2];
        if(arr.length==1){
//            return Arrays.toString(arr);
            return arr;
        }else{
            newArr[0] = arr[0];
            newArr[1] = arr[arr.length-1];
            //return Arrays.toString(newArr);
            return newArr;
        }




    }
}
