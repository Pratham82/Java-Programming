package Day8;
import java.util.Scanner;

class ArrayMaxValue{
	public static void main(String []args){
		int [] a1= new int[7];
		int a1_Len= a1.length;
		int max =0;
		Scanner scan = new Scanner(System.in);
        	System.out.println("Enter the 7 numbers: ");

		for(int i=0; i<a1_Len; i++){
			a1[i]= scan.nextInt();
		}
		
		max =a1[0];
		for(int i=0; i<a1_Len; i++){
			if(a1[i]>max){
				max = a1[i];
			}
		}
		System.out.println("Maximum number entered: "+ max);
		scan.close();
	}

}
		
