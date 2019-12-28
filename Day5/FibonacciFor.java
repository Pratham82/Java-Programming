package Day5;

public class FibonacciFor {
	public static void main(String []args) {
		int num1= 0,num2=1, num3;
		
		System.out.print(num1+"\t");
		System.out.print(num2+"\t");
		
		for(int i=1; i<=10;i++) {
			num3= num1+num2;
			System.out.print(num3+"\t");
			num1= num2;
			num2= num3;
			
		}
	}

}
