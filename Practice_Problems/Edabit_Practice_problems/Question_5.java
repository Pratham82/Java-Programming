// Create a function that takes an array and returns the first element.

package Practice_Problems.Edabit_Practice_problems;

public class Question_5 {
    public static void main(String [] args){
        int [] array = new int []{41,55,52};
        System.out.println(Question_5.getFirstValue(array));
    }
    public static int getFirstValue( int [] arr ){
        return arr[0];
    }
}
