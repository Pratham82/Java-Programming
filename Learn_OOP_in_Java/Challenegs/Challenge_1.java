package Learn_OOP_in_Java.Challenegs;

public class Challenge_1 {
    public static void main(String[] args) {
        SquareSum ss = new SquareSum();
        System.out.println(ss.squareSum(2,3,4));

    }
}

// Square Sum
class SquareSum {

    double square(double n) {
        return n * n;
    }

    // Method to sum the squares of three numbers
    double squareSum(double num1, double num2, double num3) {
        double sum = 0;

        // Write your code here
        sum = square(num1) + square(num2) + square(num3);

        return sum;
    }

}