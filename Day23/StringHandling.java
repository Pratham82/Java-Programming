package Day23;

public class StringHandling{
	public static void main(String []args) {
		//Creating string object

		//Method 1:
		String s0 = new String();
		s0 =null;

		//Method 2 (Adding literals value)
		String s1 = new String("New Object");

		//Method 3 (Storing another ref var value)
		String s2 = new String(s1);

		//Method 4 (Using character Array)
		char[] c = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
		String s3 = new String(c);

		//Method 5 (Using literals)
		String s4 = "Java";

		System.out.println("s0 = "+ s0);
		System.out.println("s1 = "+ s1);
		System.out.println("s2 = "+ s2);
		System.out.println("s3 = "+ s3);
		System.out.println("s4 = "+ s4);
	}
}
