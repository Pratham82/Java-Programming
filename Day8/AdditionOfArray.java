package Day8;

import java.util.Scanner;

class AdditionOfArray {
    public static void main(String[] args) {
        int a1[] = new int[5];
        int LenA1 = a1.length;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers to add in Array");

        for (int i = 0; i < LenA1; i++) {
            a1[i] = scan.nextInt();
            sum = sum + a1[i];
        }
        System.out.println("Addition of all numbers: " + sum);
    }
}



