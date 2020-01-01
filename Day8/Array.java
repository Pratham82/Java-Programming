package Day8;

import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        int a1[] = {10, 20, 30, 40, 50};
        int lenA1 = a1.length;
        System.out.println("Delaring Array in static way:");

        for (int i = 0; i < lenA1; i++) {
            System.out.println(a1[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Declaring Array in static way 2: ");
        int a2[] = new int[]{45, 56, 32, 76, 85, 92};
        int lenA2 = a2.length;

        for (int i = 0; i < lenA2; i++) {
            System.out.println(a2[0]);
        }
        System.out.println("------------------------------");

        int a3[] = new int[5];
        int LenA3 = a3.length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  the Values for array:");
        for (int i = 0; i < LenA3; i++) {
            a3[i] = scan.nextInt();
        }
        System.out.println("Values entererd in the array:");
        for (int i = 0; i < LenA3; i++) {
            System.out.println(a3[i]);
        }
    }
}
