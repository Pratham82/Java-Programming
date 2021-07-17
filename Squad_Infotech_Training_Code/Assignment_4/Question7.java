package Assignment_4;
//7.	WAP to take any number from user and check whether its prime or not
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int count =0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Enter number is a prime number");
        }
        else{
            System.out.println("Entered number is not a prime number");
        }

    }
}
