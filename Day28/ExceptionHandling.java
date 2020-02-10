package Day28;

public class ExceptionHandling {
	public void ExceptionTest() {
		int[] A = new int[5];
		//Any code that can cause exception write it in "try" block.
		//Try block will check only one exception
		//Any code which is written after exception wll not be executed
		//You cannot write code between "try" and "catch" block.
		try{
			A[0] = 10;
			A[1] = 20;
			A[2] = 30;
			A[3] = 40;
			A[4] = 50;


			for (int i = 0; i <=A.length; i++) {
				System.out.println(A[i]);
			}
		}
		//"Catch" block except the ArrayIndexOutOfBoundsException and prints out the message "ArrayIndexOutOfBoundsException"
		// instead of terminating the code after exception
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("ArrayIndexOutOfBoundsException "+ai);
		}
		System.out.println("Code after catch");

	}

	public static void main(String[] args) {
		ExceptionHandling eh = new ExceptionHandling();
		eh.ExceptionTest();
	}

}
		
		
