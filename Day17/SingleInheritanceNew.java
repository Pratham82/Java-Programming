package Day17;

public class SingleInheritanceNew{
	public static void main(String []args){
		Student s= new Student(101,"Prathamesh",88,22);
		s.show();
	}
}
class Person1{
	String Name;
	int Age;

	Person1(String Name, int Age){
		this.Name = Name;
		this.Age = Age;
	}

	public void show(){
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
	}
}

class Student extends Person1{
	int RollNo;
	int Marks;

	Student(int RollNo, String Name,int Marks, int Age){
		super(Name, Age);
		this.RollNo = RollNo;
		this.Marks = Marks;
	}

	public void show(){

		System.out.println("RollNo: "+RollNo);
		super.show();
		System.out.println("Marks: "+Marks);
	}

}


