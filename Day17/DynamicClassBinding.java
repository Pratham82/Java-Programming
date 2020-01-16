package Day17;

public class DynamicClassBinding {
	public static void main(String[]args){
	//Upcasting is casting to a supertype, 
	//Dog to an Animal is an upcast,because a Dog is-a Animal
	Animal a; //Creatting refernce of Animal class
	a= new Animal();
	a.eat();  //This will print method of Animal
	a = new Dog();
	a.eat(); //This will print method of Dog
	//downcasting is casting to a subtype, it will give us ClassCastExceptoion
	//because animal's runtime type is Animal, and so when you tell the runtime to perform 
	//the cast it sees that animal isn't really a Dog and so throws a ClassCastException.
	//Dog d;
	//d= new Animal();
	//d.eat();
	}
}

class Animal{
	public void eat(){
		System.out.println("This is method of an Animal");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("This is method of a Dog");
	}
}
