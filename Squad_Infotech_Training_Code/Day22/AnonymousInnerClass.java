package Day22;

public class AnonymousInnerClass{
	public static void main(String []args){
	Parent p1 = new Child();
	//This will give us child's method which  is overrided
	p1.MethodParent();	
	
	//Implementing Anonymous inner class for inheritance and method overriding:
	Parent p2 = new Parent()
	{
		public void MethodParent(){
			System.out.println("This is anonymous class's method");
		}	
	};

	p2.MethodParent();
	}
}

class Parent {
	public void MethodParent() {
		System.out.println("This is parent's method");
	}
	}

	class Child extends Parent{
		//Method overriding	
		public void MethodParent(){
			System.out.println("This is child's method");
		}
	}

