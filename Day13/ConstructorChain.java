package Day13;

public class ConstructorChain{

	public static void main(String [] args){
		ConstructorChain C = new ConstructorChain(104,"EMpoloyee 231", "email@345");

	}

	ConstructorChain(){
		System.out.println("This is constructor without parameters");
	}

	ConstructorChain( int ID){
	       this();	
		System.out.println("This is constructor with 1 parameter");
	}

	ConstructorChain(int ID, String Name){
	        this(ID);	
		System.out.println("This is constructor with 2 paramters");
	}

	ConstructorChain(int ID, String Name, String Email){
		this(ID, Name);
		System.out.println("This is constructor with 3 parameters");
	}
}
