package Day14;


public class Final{
	public static void main(String []args){
		Circle c = new Circle();
		c.radius = 14;
	        c.Area();	

	}

}

class Circle{
	int radius;
static  float Pi = 3.14f;

	public void Area(){
		System.out.println("The Area of circle: "+(radius*Pi));
	}
}
