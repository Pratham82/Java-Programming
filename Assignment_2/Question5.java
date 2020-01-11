package Assignment_2;

		import java.util.Scanner;

public class Question5 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		//String s= "Squad";
		System.out.println("Stored value: Squad");

		System.out.println("Enter the string to check if it is same as Stored string: ");
		String s1= scan.next();

		if(s1.equals("Squad")) {
			System.out.println("Entered String is same");
		}
		else {
			System.out.println("Entered String is not same");
		}


	}

}
