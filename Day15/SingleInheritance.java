package Day15;
import java.util.Scanner;
public class SingleInheritance{
	public static void main(String []args){
        EmployeePersonal ep = new EmployeePersonal();
       	ep.EnterCommDetails();
	ep.EnterPersonalDetails();
	ep.printCommDetails();
	ep.printPersonalDetails();	
	}
}

class EmployeeCommon{
	Scanner scan = new Scanner(System.in);
	int EmpID;
	String FName;
	String LName;

	public void EnterCommDetails(){
		System.out.print("Enter Employee ID: ");
		EmpID = scan.nextInt();
		System.out.print("Enter first name: ");
		FName = scan.next();
		System.out.print("Enter last name: ");
		LName = scan.next();
	}

	public void printCommDetails(){
		System.out.println("Employee ID: "+EmpID);
		System.out.println("First Name: "+FName);
	        System.out.println("Last Name: "+LName);
	}
}

class EmployeePersonal extends EmployeeCommon{
	Scanner scan= new Scanner(System.in);
	int EmpSalary;
	String EmpDept;
	String EmpDesignation;

	public void EnterPersonalDetails(){
		System.out.print("Enter Salary: ");
		EmpSalary = scan.nextInt();
		System.out.print("Enter Department: ");
		EmpDept = scan.next();
		System.out.print("Employer Designation: ");
		EmpDesignation = scan.next();
	}
	public void printPersonalDetails(){
		System.out.println("Salary :"+ EmpSalary);
		System.out.println("Department :"+EmpDept);
		System.out.println("Designation: "+EmpDesignation);
	}
}

