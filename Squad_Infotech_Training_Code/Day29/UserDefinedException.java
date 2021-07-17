package Day29;

import java.util.Scanner;

public class UserDefinedException{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		//Static input
		ValidAgeException va1 = new ValidAgeException();
		va1.AgeChecker(12);

		//Dynamic input
		int UserAge;
		System.out.print("Enter your age: ");
		UserAge = scan.nextInt();
		va1.AgeChecker(UserAge);
	}
}

//Here ValidAgeChecker is class created by us, and it is extending RuntimeException
class ValidAgeException extends RuntimeException{
	//ValidAgeChecker va = new ValidAgeChecker();
	public void AgeChecker(int Age){
		try{
			if(Age<18){
				System.out.println("Your entered age is "+ Age+ " that's why you are not eligible for graduation");
				//We are creating reference variable of throw ValidAgeChecker class and using it with throw keyword
				ValidAgeException va = new ValidAgeException();
				//The throw keyword in Java is used to explicitly throw an exception from a method or any block of code
				//The throw keyword is mainly used to throw custom exceptions.
				//If the entered age is lesser than 18 then throw clause will throw an exception instead of terminating our code.
				throw va;
			} else{
				System.out.println("Your age is valid you are eligible");
			}
			//When the exception is found in the try block the ValidAgeCheckerException will be thrown
			} catch(ValidAgeException va){
				System.out.println("ValidAgeException "+va);
			}
		}
	}
