package Day16;
//Method Overloading(Compile time polymorphism)
//Method Overloading is a feature that allows a class to have more than one method having the same name
//Rules: 
//1)Number of parameters can be same but the data types should be different if the parameters are same
//2)Number of data types can be same if the two methods have same data types then both of them need to have different number of parameters
//3)Sequence of parameters and data types must not be same even method can have same number of parameters
//4)Return Type:
//Primitive data type: Return type should be same for the same for the parent and child method
//Non primitive data type: Co variants are allowed (either same type or Parent and Child)
public class MethodOverLoading{
	public static void main(String []args){
	AllArea a = new AllArea();
	a.Area(21.0);
	a.Area(34,54);
	a.Area(20);
	a.Area(64,30.0);
	a.Area(34.3,75);	
	}
}

class AllArea{
	
	public void Area(double r){
		System.out.println("Area of Circle : "+(3.14*r*r));
	}

	public void Area(int l, int b){
		System.out.println("Area of Rectangle: "+(l*b));
	}
	
	public void Area(int s){
		System.out.println("Area of Square: "+(s*s));
	}
	
	public void Area(int A, double B){
		System.out.println("Area of Rectangle 1:" +(A*B));
	}
	
	public void Area(double B, int A){
		System.out.println("Area of Rectangle 2: "+(A*B));
	}	
}	
