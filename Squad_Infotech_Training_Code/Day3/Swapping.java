package Day3;

import java.util.Scanner;

public class Swapping {
    public static void main(String[]args)
    {
        Scanner scan =new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter First number: ");
        n1= scan.nextInt();
        System.out.print("Enter Second number: ");
        n2= scan.nextInt();

        //Using 3 variables
        n3= n1;  //n1's value will be stored in n3
        n1= n2;  //n2's value will be stored in n1
        n2= n3;  //n3(n1's ) value will be stored in n2
        //Using 2 variables
        /*n1= n1 + n2;
        n2= n1 - n2;
        n1= n1 - n2;
*/
        System.out.println("Swapped numbers: ");
        System.out.println("First number = "+n1);
        System.out.println("Second number = "+n2);

    }
}
