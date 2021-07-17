package Assignment_1;

import java.util.Scanner;

public class Question4 {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side of square:  ");
        int s= scan.nextInt();

        System.out.println("Area of square : "+s*s);
        System.out.println("Perimeter of square: "+(s*4));
        scan.close();

    }
}
