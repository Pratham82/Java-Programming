package Day4;
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int year;
        System.out.println("Enter the year for checking if it is a Leap year or not: ");
        year=scan.nextInt();
        if((year%4==0 && year%100!=0) ||year%400==0){
            System.out.println("Entered year is a Leap year");
        }else{
            System.out.println("Entered year is not a Leap year");
        }
    }
}
