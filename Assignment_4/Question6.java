package Assignment_4;
//6.	WAP to take any number from user any find its factors and count it.
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to find its factors: ");
        int num = scan.nextInt();
        int count =0;
        System.out.println("Factors of "+num+": ");
        for(int i=1; i<=num;i++){
            if(num%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total factors of "+num+": "+count);
    }
}
