package Day12;

public class ShapesMain{
	public static void main(String [] args){
	Rectangle r = new Rectangle(); 
        r.Length = 34;
        r.Breadth = 30;
        r.Area();
        
        System.out.println("-----------------------------");
       
       	Rectangle2 r2 = new Rectangle2();
        r2.Length = 20;
        r2.Breadth = 30;
        r2.Area(50,60);
        r2.PrintDetails();
	System.out.println("______________________________");
        	
        Square s = new Square();
        s.Side= 20;
	s.Area();
	s.Perimeter();
	s.NameS();
	System.out.println("Printing return type values: ");
	System.out.println(s.Perimeter());
	System.out.println(s.NameS());
		
	}
}
