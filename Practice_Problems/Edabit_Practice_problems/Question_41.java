package Practice_Problems.Edabit_Practice_problems;

public class Question_41 {
    public static void main(String[] args) {
        int a1 [] = new int[]{1, 2, 3, 4, 5};
        System.out.println(transform(a1));
    }
    public static  int[] transform(int [] arr){
        int [] newArr = new int [arr.length];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] %2 ==0){
                newArr[i] = arr[i]-1;
            }else{
                newArr[i] = arr[i]+1;
            }
            System.out.println(newArr[i]);
        }

        return newArr;
    }

}
