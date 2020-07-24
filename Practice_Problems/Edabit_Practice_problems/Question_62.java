package Practice_Problems.Edabit_Practice_problems;
// return sum of even numbers in the given range
public class Question_62 {
    public static void main(String[] args) {
        System.out.println(sumEvenNumsInRange(10, 20));
        System.out.println(sumEvenNumsInRange(51, 150));
    }

    public static int sumEvenNumsInRange(int start, int stop) {
        int sum =0;
        for(int i =start; i<=stop; i++ ){
            if(i%2==0) {
                sum+= i;
            }
        }
        return sum;
    }
}
