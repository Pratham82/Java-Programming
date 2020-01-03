package Day10;
import java.util.Scanner;

class MethodWithParamets{
	public static void main(String []args){
		//Static ways of using parameters in mathod
		Employee emp = new Employee();
	     /*	System.out.println("Eneter details for Employee: ");
	        emp.Input(12, "Geralt", 30000);	   
		System.out.println("Employee details entered by user: ");
		emp.PrintDetails();*/

		//Dynamic way of using parameters
                //Declaring data types of the parameters's vlaues
		int ID;
		String Name;
		double Salary;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details for Employee(ID, Name and Salary: ");
		ID = scan.nextInt();
		Name = scan.next();
		Salary = scan.nextDouble();
		emp.Input(ID, Name, Salary);			
		System.out.println("Employee details entered by user: ");
		emp.PrintDetails();
	}
}

class Employee{
	int EmpID;
	String EmpName;
	double EmpSalary;

	public void Input(int id, String name, double Salary){
		EmpID = id;
		EmpName = name;
		EmpSalary = Salary;
	}

	public void PrintDetails(){
		System.out.println("Employee ID: "+EmpID+"\nEmployee Name: "+EmpName+"\nEmployee salary: "+EmpSalary);
	}
}
