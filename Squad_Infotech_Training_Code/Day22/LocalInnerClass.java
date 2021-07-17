package Day22;

public class LocalInnerClass{
	public static void main(String []args){
		Outer1 o1 = new Outer1();
		o1.LocalMethod();


		}
}

class Outer1{
	
	public void LocalMethod(){
		class Inner1{
			int InNum1 =234;
			int InNum2 =234;

			public void InnerMethod(){
				System.out.println("This is inner method of Local Inner class");
				System.out.println("This is 1st variable of Inner class: "+InNum1);
				System.out.println("This is 2nd variable of Inner class: "+InNum2);
			}

		}

		Inner1 i1 = new Inner1();
		i1.InnerMethod();
	}
}

	
