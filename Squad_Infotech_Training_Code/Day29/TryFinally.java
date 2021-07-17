package Day29;

public class TryFinally{
	public static void main(String[]args){
		int num1 = 10;
		int num2 = 0;
		try{
			System.out.println("num1/num2: "+(num1/num2));
		}
		//Finally block will be executed even if there is an exception in our try block
		finally{
			System.out.println("This is fially block");
		}
		}
	}	
