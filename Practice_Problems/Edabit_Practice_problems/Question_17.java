package Practice_Problems.Edabit_Practice_problems;
// Create a function that adds up and returns the numbers in a array

public class Question_17 {
    public static void main(String args[]){
        int [] arr1 = new int[]{-50, -2, 285, 3};
        int [] arr2 = new int[]{2, 10, 200, 3};
        System.out.println(Question_17.countArray(arr1));
        System.out.println(Question_17.countArray(arr2));
    }

    public static int countArray(int [] a){
        int sum =0;
        for(int i =0; i<a.length; i++){
            sum +=  a[i];
        }
        return  sum;

    }

}


/*
  int sum = 0;

      for( int num : a) {
          sum = sum+num;
      }

		return sum;
* */