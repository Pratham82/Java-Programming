package Day5;

import java.util.Scanner;

public class PrimeFor {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number to find if it is Prime or not: ");
        int num1= scan.nextInt();
        int count =0;

        for(int i =1;i<=num1;i++){
            if(num1%i==0){
                count++;
        }
        }if(count==2){
            System.out.println("Entered number is a Prime number");
        }else{
            System.out.println("Entered number is not a Prime number");
        }
    }
}
