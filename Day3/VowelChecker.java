package Day3;
import java.util.Scanner;

public class VowelChecker {
    public static void main(String []args){
        char char1;
        Scanner scan=  new Scanner(System.in);

        System.out.print("Enter any character: ");
        char1=scan.next().charAt(0);

        if (char1=='a'|| char1=='e'||char1=='i'||char1=='o'||char1=='u'||char1=='A'||char1=='E'||char1=='I'||char1=='O'||char1=='U')
        {
            System.out.println("Entered character is a Vowel");
        }
        else
        {
            System.out.println("Entered character is a Consonant");
        }
    }
}
