package Assignment_4;
import java.util.Scanner;
//9.	WAP to take any number from user and find n^m
public class Question9{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		System.out.print("Enter power: ");
		int power = scan.nextInt();
		int Result = 1;

		for (int i=power; i!=0; i--){
			Result = Result*num;
		}

		System.out.println(num+"^"+power+": "+Result);
	}
}
		
		
