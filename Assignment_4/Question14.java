package Assignment_4;
//14.	WAP to print Fibonacci series
//e.g. 0+1+1+2+3+5+8+13+21
import java.util.Scanner;
public class Question14 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to of instances to get Fibonacci series: ");
        int num = scan.nextInt();
        int num1=0;
        int num2=1;
        int num3;

        System.out.print(num1+" ");
        System.out.print(num2+" ");

        for(int i=1;i<=num;i++){
            num3 = num1+num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
        }

    }
}
