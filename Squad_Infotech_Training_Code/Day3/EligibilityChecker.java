package Day3;
import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String []args){
        int age;
        String qualification;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age= scan.nextInt();
        System.out.print("Enter you qualification: ");
        qualification=scan.next();

        if (age>=18 && (qualification.equals("B.E.")))
        {
            System.out.println("You are eligible");
        }
        else
        {
            System.out.println("You are not eligible");
        }


    }
}
