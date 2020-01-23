package Day16_New;
//Creating new package for our main class
//As we can check all the methods in Addition Multiplication and Power are public we are able to access them
//But once we make the method protected we will not be able to use it(It will not be visible for this class)
//So for using protected method we can extend our main class i.e (TestMainOperation) to the class with protected method
// Once we do that we have to create object of our main class and then access the protected class via that object
// Finally we can access that method
import Day16.Addition;
import Day16.Multiplication;
import Day16.Power;

public class TestMainOperation extends Addition{
	public static void main(String [] args){
		Addition a= new Addition();
		Multiplication m = new Multiplication();
		Power p = new Power();
		TestMainOperation  tmo = new TestMainOperation();
		//Add2Int is a Protected method
		//a.Add2Int(15,89);
		a.Add2Float(12.5f,98.2f);
		m.Multi2Int(100,300);
		m.Multi2Float(20.5f,12.5f);
		p.Square(25);
		p.Cube(12);

		//Now we can access the protected method
		tmo.Add2Int(15,63);



	}
}
