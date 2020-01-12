package Day14;

public class StaticMethod{
	public static void main(String [] args){
		Employee e = new Employee();
		e.EmpID = 322;
		e.EmpName = "John";
		e.EmpSalary = 230000;
		e.printDetails();
		Employee e1 = new Employee();
		e1.EmpID = 323;
		e1.EmpName = "Rock";
		e1.EmpSalary = 23100;
		e1.printDetails();

		Employee.EmpCompany ="CoderTech";
		Employee e2 = new Employee();
		e2.EmpID = 325;
		e2.EmpName = "Tanner";
		e2.EmpSalary = 212120;
		e2.printDetails();




	}
}

class Employee{
	int EmpID;
	String EmpName;
static  String EmpCompany ="Squad";//It will be same thoughout the program and we dont have to create and object for storing it while printing, We can also change it in the program by using ClassName.varName ="new value";
        int EmpSalary;

	public void printDetails(){
		System.out.println("Employee ID: "+EmpID);
		System.out.println("Employee Name: "+EmpName);
		System.out.println("Employee Compnay: "+EmpCompany);
		System.out.println("Employee Salary: "+EmpSalary);
		
    }
}
