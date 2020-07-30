package Practice_Problems.Edabit_Practice_problems;

public class Question_93 {
    public static void main(String[] args) {
        int a[] =new int[]{4, 8};
        System.out.println(squaresAndCubes(a));
    }

    public static boolean squaresAndCubes(int []arr){
        return Math.sqrt(arr[0]) == Math.cbrt(arr[1]);
    }
}
