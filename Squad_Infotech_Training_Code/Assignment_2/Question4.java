package Assignment_2;

import java.util.Scanner;

public class Question4 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the alphabet for checking if it is Vowel or Consonant: ");
		char c1 = scan.next().charAt(0);
		
		if(c1=='a'||c1=='A'||c1=='e'||c1=='E'||c1=='i'||c1=='I'||c1=='o'||c1=='O'||c1=='u'||c1=='U') {
			System.out.println("Entered alphabet is a Vowel");
		}
		else {
			System.out.println("Entered alphabet is a consonant");
		}
		scan.close();
	}

}
