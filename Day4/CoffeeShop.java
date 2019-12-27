package Day4;

import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        char Choice;

        System.out.println("Welcome to our Coffee Shop :) ");
        System.out.println("Coffees on the menu: ");
        System.out.println("A. Americano\nB. Latte\nC. Cappuccino\nD. Espresso\nE. Long Black\nF. Mocha");
        System.out.print("Choose any option off the menu: ");
        Choice=scan.next().charAt(0);

        switch(Choice){
            case 'A':
                System.out.println("Americano =  $ 40");
                break;
            case'B':
                System.out.println("Latte = $ 45");
                break;
            case 'C':
                System.out.println("Cappuccino = $ 51");
                break;
            case'D':
                System.out.println("Espresso = $ 55");
                break;
            case'E':
                System.out.println("Long Black = $ 60");
                break;
            case'F':
                System.out.println("Mocha = $ 65");


                break;
            default:
                System.out.println("Please choose correct option");
        }



    }
}
