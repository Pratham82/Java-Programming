package Day16;
//Method Overriding(Run time polymorphism)
//Declaring a method in sub class which is already present in parent class is known as method overriding. 
//Overriding is done so that a child class can give its own implementation to a method which is already provided by the parent class.
//In this case the method in parent class is called overridden method
//The method in child class is called overriding method. 
//Rules: 
//1)Method name should be same
//2)Method parameters should be same either data type of the parameter or sequence
//3)Access modifiers can be same (but must not reduce visibility of parent class's method, for that use access modifiers in following order:
// protected --> public
//4)Return type:
//Primitive: should be same like original method
//Non primitive method: Co variants are allowed (If super class's method is returning any object then subclass's overriding method can return
//object of its subclass type(Added in Java5)

public class MethodOverriding{
	public static void main(String []args){
	Car c = new Car();
	c.printDetails();	
	}
}

class Vehicle{

	public void printDetails(){
		System.out.println("Method of Vehicle");
	}

}

class Car extends Vehicle{

	public void printDetails(){
		//This will print parent class method	
		super.printDetails();
		System.out.println("Method of Car");
	}
}
