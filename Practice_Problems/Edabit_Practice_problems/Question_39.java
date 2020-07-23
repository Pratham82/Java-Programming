package Practice_Problems.Edabit_Practice_problems;
// Convert array to additive inverse
import java.util.Arrays;

public class Question_39 {
    public static void main(String[] args) {
        int a1[] = new int[]{5, -7, 8, 3};
        int a2[] = new int[]{1, 1, 1, 1, 1};
        int a3[] = new int[]{-5, -25, 35};

        System.out.println(additiveInverse(a1));
        System.out.println(additiveInverse(a2));

    }

    public static String additiveInverse(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                newArr[i] = Math.abs(arr[i]);
            }else{
                newArr[i] = -arr[i];
            }

//            System.out.println(newArr[i]);
        }
        // This will return the location in memory
//        return newArr;

        // For returning an array we can wrap it around toString method
        // This will also affect our return type we have to change our return type to a String for this
        return Arrays.toString(newArr);

    }


}
