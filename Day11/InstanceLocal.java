package Day11;

public class InstanceLocal{
	public static void main(String[]args){
		//Creating object for Non parameterized constructor
		InstanceLocal IL1 = new InstanceLocal();
                IL1.printIL();
		//Creating  object for parameterized constructor
		InstanceLocal IL2 = new InstanceLocal(12,"Clark",45000);
		IL2.printIL();

	}

	int EmpID;
	String EmpName;
	double EmpSalary;

	//Creating non parameterized constructor
	InstanceLocal(){
                System.out.println("This is Non parameterized constrcutor");	
		EmpID = 234;
		EmpName = "Emilia";
		EmpSalary = 120000;
	}

	//Creating Parameterized constructor
	InstanceLocal(int ID, String Name, double Salary){
		System.out.println("This is Parameterized Constructor");
		EmpID =ID;
		EmpName = Name;
		EmpSalary =Salary;
	}
	
	//Printing method
	public void printIL(){
		System.out.println("Employee Name: "+EmpName);
		System.out.println("Employee ID: "+EmpID);
		System.out.println("Employee Salary: "+EmpSalary);
	}
}
