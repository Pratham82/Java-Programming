package Day11;

public class ConstructorPrint{

	public static void main(String []args){
        ConstructorPrint C1 = new ConstructorPrint(400,"Jayesh",47700);
        C1.printCon();
	}
	int EmpID;
	String EmpName;
	double EmpSalary;

	//Creating constructor without Parameters
	ConstructorPrint(){
		System.out.println("This is non parameterized constructor");
	}

	//Creating constructor with parameters in it
	ConstructorPrint(int ID, String Name, double Salary){
		System.out.println("This is parameterized constructor");
		EmpID =ID;
		EmpName=Name;
		EmpSalary=Salary;
	}

	//Crating method for printing
	public void printCon(){
		System.out.println("Employee Name: "+ EmpName);
		System.out.println("Employee ID: "+ EmpID);
		System.out.println("Employee Salary: "+ EmpSalary);
	}

}
		
