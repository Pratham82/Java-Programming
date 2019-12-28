package Day5;

import java.util.Scanner;

public class TableFor {
     public static void main(String []args) {
    	 Scanner scan= new Scanner(System.in);
    	 int n,t;
    	 System.out.print("Enter the number for getting its table from 1 to 10:");
    	 n=scan.nextInt();
    	 for(int i=1;i<=10;i++) {
    		 t=n*i;
    		 System.out.println(n +" * "+i+" = "+t);
    		 //System.out.println(t);
    		 //System.out.print("\t");
    		 
    	 }	 
    	 
     }

}
