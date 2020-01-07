package Day12;

public class Rectangle2{
	int Length, Breadth;

	public void Area(int Length, int Breadth){
		this.Length = Length;
		this.Breadth = Breadth;
	}

	public void PrintDetails(){
		System.out.println("Length of the Rectangle: "+ Length);
		System.out.println("Breadth of the Rectangle: "+ Breadth);
	}
}
