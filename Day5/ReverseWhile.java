package Day5;
import java.util.Scanner;
public class ReverseWhile {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number for reversing it: ");
        int num= scan.nextInt();
        int remainder;
        int reversedNo= 0;   //Initializing the reverse with 0

        while(num>0){
            remainder= num%10;                    //Dividing num by 10 and storing the remainder value
            reversedNo= reversedNo*10 +remainder; //Multiplying reverse value into 10 and adding remainder to it
            num = num/10;                         //Dividing the num by 10, and storing the updated num value after
        }
        System.out.println(reversedNo);
    }
}
