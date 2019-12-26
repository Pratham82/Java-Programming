package Day3;

import java.util.Scanner;

public class EligibilityCheckerNested {
    public static void main(String []args){
        int age;
        String qualification;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age= scan.nextInt();

        if (age>=18 )  //If the age is 18 then and only then the loop gets executed
        { //Qualification will be checked only if the age is above or equal to 18
            System.out.print("Enter you qualification: ");
            qualification=scan.next();

            if((qualification.equals("B.E."))) // .equals("Character to be compared") is used to compare the character
            {
                System.out.println("You are eligible");
            }
        }
        else // If the age is not 18 then you are not eligible even though your qualification meets
        {
            System.out.println("You are not eligible");
        }
    }
}
