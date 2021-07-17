package Day10;
import java.util.Scanner;

public class MethodTest{
	public static void main(String [] args){
		//Creating object of Student class
		Student1 Stu = new Student1();
			System.out.println("Enter Student details (ID, Name and Marks) :");
			Stu.TakeInput();
			Stu.PrintDetails();
	}

	}

	class Student1{
		int StuID;
		String StuName;
		double StuMarks;

                Scanner scan = new Scanner(System.in);
		public void TakeInput(){
			StuID= scan.nextInt();
			StuName= scan.next();
			StuMarks= scan.nextDouble();
		}

		public void PrintDetails(){
			System.out.println("Student details entered by the user: ");
			System.out.println("Student ID: "+StuID+ "\nStudent Name: "+StuName+"\nStudent Marks: "+StuMarks);
		}
		
	}
