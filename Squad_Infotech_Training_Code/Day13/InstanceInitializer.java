package Day13;

public class InstanceInitializer{
	public static void main(String [] args){
		InstanceInitializer i = new InstanceInitializer();
		i.print();
	}

	InstanceInitializer(){
		System.out.println("This is constructor 1");
	}

	InstanceInitializer(int ID){
		System.out.println("This is constructor with 1 parameter");
	}

	{
		System.out.println("This is 1st anonymous block" );
	}

	{
		System.out.println("This is 2nd anonymous block" );
	}

	{
		System.out.println("This is 1st anonymous block" );
	}

	public void print(){
		System.out.println("This is Print method");
	}
}	
