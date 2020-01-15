package Assignment_4;
//10.	WAP to find following sum of series
//a)	1+2+3+......+n
//b)	12+22+33+.......+n3
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Question a:
        System.out.println("Enter the number to find addition in series : ");
        int num = scan.nextInt();
        int sum =0;
        for (int i=1; i<=num; i++) {
            sum = sum + i;
        }
        System.out.println("Addition till "+num+": "+sum);


    }
}
