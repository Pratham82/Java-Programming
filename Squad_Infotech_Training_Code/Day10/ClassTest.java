package Day10;
import java.util.Scanner;

public class ClassTest{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		//Creating object of the class
		Student st = new Student();   //Student() is a constructor

		System.out.println("Enter Student deatils(ID, Name and Marks:");
		st.StudentID = scan.nextInt();
		st.StudentName = scan.next();
		st.StudentMarks = scan.nextDouble();

		System.out.println("Entered student details are as follows:");
		System.out.println("Student ID: "+ st.StudentID+"Student name: "+st.StudentName+"Student marks: "+st.StudentMarks);
	}
}

class Student{
	int StudentID;
	String StudentName;
	double StudentMarks;
}

