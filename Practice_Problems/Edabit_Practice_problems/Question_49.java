package Practice_Problems.Edabit_Practice_problems;
// Create a function to calculate the determinant of a 2 * 2 matrix. The determinant of the following matrix is: ad - bc:
//
//[[a, b], [c, d]]

import java.util.Arrays;

public class Question_49 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}};

    }

    public static int calcDeterminant(int [][]matrix){
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

}
