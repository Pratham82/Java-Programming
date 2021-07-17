package Day16;

public class ThisAndSuper {
    public static void main(String []args){
	Programmer p = new Programmer(100,"Emp32",23000);
	p.printDetails();
    }
}

class Employee{
	int EmpID;
	String EmpName;

	Employee(){
	
	}

	Employee(int EmpID, String EmpName){
		this.EmpID = EmpID;
		this.EmpName = EmpName;
	}

	public void printDetails(){
		System.out.println("Employee ID: "+EmpID);
		System.out.println("Employee Name: "+ EmpName);
	}

}

class Programmer extends Employee{
	double Salary;
	
	Programmer(int EmpID, String EmpName, double Salary){
		super(EmpID , EmpName);
		this.Salary = Salary;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("Employee Salary: "+Salary);
	}
}




