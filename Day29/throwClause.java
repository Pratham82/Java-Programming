package Day29;

public class throwClause{
	public static void main(String []args){
		int num1 = 150;
		int num2 = 0;

		try{
			//The throw keyword in Java is used to explicitly throw an exception from a method or any block of code
			//The throw keyword is mainly used to throw custom exceptions.
			System.out.println("num1: " + num1);
			System.out.println("num2: " + num2);
			//On this line we are going to get exception that's why we are writing it in "try" block and
			//Using throw keyword for matching a valid exception as we know we are going to get ArithmeticException
			// that's why we are catching an ArithmeticException in catch block
			System.out.println("num1/num2: "+(num1/num2));

			ArithmeticException ae = new ArithmeticException();
			//We can only write one exception with throw keyword
			//We have to write throw keyword inside the method
			throw ae;
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticExceptionException "+ ae);
		}
	}
}
