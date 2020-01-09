package Assignment_1;

import java.util.Scanner;

public class Question3 {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int l= scan.nextInt();
        System.out.println("Enter breadth of rectangle:");
        int b = scan.nextInt();
        System.out.println("Area of rectangle: "+l*b);
        System.out.println("Perimeter of rectangle: "+(l+b)*2);

    }
}
