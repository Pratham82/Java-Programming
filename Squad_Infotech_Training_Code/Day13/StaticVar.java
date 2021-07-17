package Day13;

public class StaticVar{
	public static void main(String [] args){
		Student s = new Student();
		s.StudentID = 300;
		s.StudentName = "Student 1";
		s.print();

		s.StudentID = 301;
		s.StudentName = "Student 2";
		s.print();

		//We can change the value of constant variable
		Student.CollegeName = "Bhavans";  //The college name value will be replaced with Bhavans

		s.StudentID = 303;
		s.StudentName = "Student 3";
		s.print();
	}
}
	class Student{
		int StudentID;
		String StudentName;
         static String CollegeName ="Patkar";  //This is be constant thoughout the program

		public void print(){
			System.out.println("Student ID: " +StudentID);
			System.out.println("Student Name: "+ StudentName);
			System.out.println("College Name: "+CollegeName);
		}
	}
