package Day12;

public class Square{
	int Side;

	public void Area(){
		System.out.println("Area of square: "+ Side*Side);
	}

	public int Perimeter(){
		System.out.println("Perimeter of Square: "+ 4*Side);
		return 101;
	}

	public String NameS(){
		System.out.println("This sqaure method is with String return type.");
		return "Spongebob";
	}
}
