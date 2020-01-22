package Packages.Demo1;

/*Packages rules:
1) Public:  Public methods can be used anywhere
2)Protected: Protected methods can be used in same class, package and subclass present in different package
3)Default: Default methods can be accessed only in the same package
4)Private: Private methods can be used only in same class
IF we want to private method outside then we can store that method inside a public method.
Eg.
private method1(){
}

public method2(){
method1();
}

 */
public class Vehicle {
	protected void Drive() {
		System.out.println("This is private Drive method ");
	}

	public void Show() {
		Drive();
	}
}
