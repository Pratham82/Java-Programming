package HeadFirst;

public class Loopy{
	public static void main(String [] args){
		int x =1;
		System.out.println("Before the Loop");

		while(x<4){
			System.out.println("In the loop");
			System.out.println("Value of x is "+ x);
			x = x + 1;
		}
		System.out.println("This is after loop");
	}
}
