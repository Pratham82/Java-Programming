package Day5;
import java.util.Scanner;
public class FibonacciFor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Choose the index for fibonacci series: ");
        int num=scan.nextInt();
        int num1 =0;
        int num2 =1;
        int num3;
        System.out.println("Fibonacci series till "+num+ "index");
        System.out.print(num1+" ");
        System.out.print(num2+" ");

        for(int i=0;i<=num;i++){
            num3=num1+num2;
            System.out.print(num3+" ");
            num1= num2;
            num2= num3;
        }
    }
}
