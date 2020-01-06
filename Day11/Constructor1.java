package Day11;

public class Constructor1{
        
	public static void main(String []args){
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(121,"Jayesh",23444);
	}

	Constructor1(){
		//This is non parameterized constructor also called zero constructor
		System.out.println("This is non Parameterized Constructor");
	}

	Constructor1(int ID, String NAME, double SALARY){
		System.out.println("This is Parameterized Constructor");
	}

}
