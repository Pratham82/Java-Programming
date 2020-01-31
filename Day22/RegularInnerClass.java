package Day22;

public class RegularInnerClass{
	public static void main(String []args){

		//Creating object of outer class:
		Outer o1 = new Outer();
		o1.Method1Out();

		//Creating object of inner class: 
		//Object creation method 1: (For using this method first we have to create the object of outer class)
		Outer.Inner i1 = o1.new Inner();
		i1.MethodIn();

		//Object creation method 2:
		Outer.Inner i2 = new Outer().new Inner();
		i2.MethodIn();
	}
}	


class Outer{
	int OutNum1 = 234;
	int OutNum2 = 364;

	public void Method1Out(){
		System.out.println("This is Outer class's method");
	}

	class Inner{
		int InNum1 = 3424;
		int InNum2 = 2312;

		public void MethodIn(){
			System.out.println("This is Inner class's method");
		}
	}
}

