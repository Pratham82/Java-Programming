package Day8;
import java.util.Scanner;
public class ArrayReverse{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int[] A1=new int[5];
		int LenA1=A1.length;
		System.out.println("Enter numbers to reverse: ");
                
		for(int i=0; i<LenA1; i++){
			A1[i]=scan.nextInt();
		}
		System.out.println("------------------------");
                System.out.println("Revrsed Array:");
		for(int i=LenA1-1; i>=0; i--){
			System.out.println(A1[i]);
		}
		scan.close();
	}
}
