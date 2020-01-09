package Assignment_1;

import java.util.Scanner;

public class Question5 {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int r= scan.nextInt();

        System.out.println("Area of circle: "+(3.14)*(r*r));
        System.out.println("Perimeter of circle: "+(2)*(3.14)*(r));

    }

}
