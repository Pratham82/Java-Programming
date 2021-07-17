package Assignment_4;
//5.	WAP to take any number from user and display its table
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number for finding its table till 10: ");
        int n = scan.nextInt();
        int t=0;

        System.out.println("Table of "+n+": ");
        for(int i=1; i<=10; i++){
            System.out.println(t =n*i);
        }
    }
}
