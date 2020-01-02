package Day9;

public class ForEach2{
	public static void main(String [] agrs){
		String [] Str = new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("Days in the Week: ");
		for( String s: Str){
			System.out.print(s+ " ");
		}
	}
}
