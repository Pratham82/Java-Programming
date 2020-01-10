package Assignment_3;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Question4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose payment method: ");
        System.out.println("1.Debit card");
        System.out.println("2.Credit card");
        System.out.println("3.COD");
        System.out.println("Enter your choice: ");
        int c = scan.nextInt();
        switch(c){
            case 1:
                System.out.println("*********Debit card*********");
                System.out.println("Enter Debit card no: ");
                double dc = scan.nextInt();
                System.out.println("Enter expiry date: ");
                String d1 =scan.next();
                System.out.println("Enter CCV: ");
                int cv1=scan.nextInt();
                System.out.println("Enter OTP: ");
                int o1=scan.nextInt();
                System.out.println("Thank you for providing details");
                break;
            case 2:
                System.out.println("*********Credit card*********");
                System.out.println("Enter Credit card no: ");
                double dc2 = scan.nextInt();
                System.out.println("Enter expiry date: ");
                String d2 =scan.next();
                System.out.println("Enter CVV: ");
                int cv2=scan.nextInt();
                System.out.println("Enter OTP: ");
                int o2=scan.nextInt();
                System.out.println("Thank you for providing details");
                break;
            case 3:
                System.out.println("*********COD*********");
                break;
            default:
                System.out.println("Please enter correct choice");
                break;

        }
    }
}
