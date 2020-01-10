package Assignment_3;

import java.util.Scanner;

public class Question3 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("**********Welcome to OnShop.. Enter your choice**********");
        System.out.println("1. Men");
        System.out.println("2. Women");
        System.out.print("Enter your choice: ");
        char  c = scan.next().charAt(0);

        switch(c){
            case'1':
                System.out.println("**********Welcome to men department************");
                System.out.println("1. Clothes");
                System.out.println("2. Footwear");
                break;

            case'2':
                System.out.println("**********Welcome to women department************");
                System.out.println("3. Clothes");
                System.out.println("4. Footwear");
                break;
            default:
                System.out.println("Please enter correct choice");

        }
        System.out.print("Enter your choice: ");
        char  c1 = scan.next().charAt(0);
        switch(c1){
            case'1':
                System.out.println("***********Welcome to men clothes dept***********");
                System.out.println("1. H&M");
                System.out.println("2. Jack and Jones");
                break;
            case'2':
                System.out.println("***********Welcome to men footwear dept***********");
                System.out.println("3. Nike");
                System.out.println("4. Reebok");
                break;

            case'3':
                System.out.println("***********Welcome to women clothes dept***********");
                System.out.println("5.Biba");
                System.out.println("6.Zara");
                break;
            case'4':
                System.out.println("***********Welcome to men footwear dept***********");
                System.out.println("7. Louis V");
                System.out.println("8. Gucci");
                break;



        }
        System.out.print("Enter your choice: ");
        char  c2 = scan.next().charAt(0);
        switch(c2){
            case'1':
                System.out.println("**********welcome to H&M collection*********");
                System.out.println("Price: 1500");
                System.out.print("Enter quantity: ");
                int q1 = scan.nextInt();
                System.out.println("**********Thank you for shopping***********");
                if(q1>0){
                    System.out.println("Total: "+(q1*1500));
                }
                break;
            case'2':
                System.out.println("**********welcome to Jack and Jones collection*********");
                System.out.println("Price: 1600");
                System.out.print("Enter quantity: ");
                int q2= scan.nextInt();
                System.out.println("**********Thank you for shopping***********");
                if(q2>0){
                    System.out.println("Total: "+(q2*1600));
                }
                break;
            case'3':
                System.out.println("**********welcome to Nike footwear*********");
                System.out.println("Price: 1650");
                System.out.print("Enter quantity: ");
                int q3= scan.nextInt();
                System.out.println("**********Thank you for shopping***********");
                if(q3>0){
                    System.out.println("Total: "+(q3*1650));
                }
                break;
            case'4':
                System.out.println("**********welcome to Reebok footwear*********");
                System.out.println("Price: 1700");
                System.out.print("Enter quantity: ");
                int q4= scan.nextInt();
                System.out.println("**********Thank you for shopping***********");
                if(q4>0){
                    System.out.println("Total: "+(q4*1700));
                }
                break;
            case'5':
                System.out.println("**********welcome to Biba collection*********");
                System.out.println("Price: 1800");
                System.out.print("Enter quantity: ");
                int q5 = scan.nextInt();
                System.out.println("**********Thank you for shopping***********");
                if(q5>0){
                    System.out.println("Total: "+(q5*1800));
                }
                break;
            case'6':
                System.out.println("**********welcome to Zara collection*********");
                System.out.println("Price: 1780");
                System.out.print("Enter quantity: ");
                int q6 = scan.nextInt();
                System.out.println("**********Thank you for shopping***********");
                if(q6>0){
                    System.out.println("Total: "+(q6*1780));
                }
                break;
            case'7':
                System.out.println("**********welcome to Louis V footwear*********");
                System.out.println("Price: 1890");
                System.out.print("Enter quantity: ");
                int q7 = scan.nextInt();
                System.out.println("**********Thank you for shopping***********");
                if(q7>0){
                    System.out.println("Total: "+(q7*1890));
                }
                break;
            case'8':
                System.out.println("**********welcome to Gucci footwear*********");
                System.out.println("Price: 1945");
                System.out.print("Enter quantity: ");
                int q8 = scan.nextInt();
                System.out.println("**********Thank you for shopping***********");
                if(q8>0){
                    System.out.println("Total: "+(q8*1945));
                }
                break;

        }
       // System.out.println("Enter quantity: ");


        //System.out.println("Total: ");

    }

}
/*
Sample OP:
* **********Welcome to OnShop.. Enter your choice**********
1. Men
2. Women
Enter your choice: 4
Please enter correct choice
Enter your choice: 1
***********Welcome to men clothes dept***********
1. H&M
2. Jack and Jones
Enter your choice: 2
**********welcome to Jack and Jones collection*********
Price: 1600
Enter quantity: 6
**********Thank you for shopping***********
Total: 9600
*/