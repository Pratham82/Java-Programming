package Day22;

public class AnonymousInnerWithAbstract{
	public static void main(String []args){
		//Creating anonymous class of abstract class
		Parent1  p1 = new Parent1()
		{
			@Override
			public void ParentMethod() {
				System.out.println("This is Anonymous class's method which is updated");
			}
		};
		p1.ParentMethod();

		//Creating anonymous class of interface
		ChildOfInterface1 ci = new ChildOfInterface1()
		{
			@Override
			public void InterfaceMethod() {
				System.out.println("This is child's method");
			}
		};
		ci.InterfaceMethod();
	}
}

abstract class Parent1{
		public void ParentMethod(){
			System.out.println("This si Parent class's method");
		}
	}

interface  Interface1{
	public void InterfaceMethod();
}

class ChildOfInterface1 implements Interface1{

	@Override
	public void InterfaceMethod() {

	}
}




