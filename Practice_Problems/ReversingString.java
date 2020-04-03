package Practice_Problems;

import java.util.Scanner;

public class ReversingString{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string for reversing: ");
		String file = scan.next();
		String revFile = "";
		
		for(int i = file.length()-1; i>=0; i--){
			revFile = revFile + file.charAt(i);
		}
		System.out.println("Entered string: "+file);
		System.out.println("Reversed string: "+revFile);
		scan.close();
	}
}