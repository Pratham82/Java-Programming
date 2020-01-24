package Practice_Problems;

import java.util.Scanner;

public class InsertionSort{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Array length: ");
		int ArrLength = scan.nextInt();
		int[] Arr = new int [ArrLength];
		int temp =0;
		System.out.println("Enter "+ArrLength+" elements in the array");

		for(int i=0;i<Arr.length;i++){
			Arr[i] = scan.nextInt();
		}
		
		System.out.println("Sorted List: ");
		for(int i=0; i<Arr.length; i++){
			for(int j = i+1; j<Arr.length; j++){
				if(Arr[i]>Arr[j]){
					temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}

			System.out.println(Arr[i]);
		}
	}
}
