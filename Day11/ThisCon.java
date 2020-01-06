package Day11;

public class ThisCon{
	public static void main(String []args){
		ThisCon TC = new ThisCon();
		TC.printTC();
	}
	int EmpID;
	String EmpName;
	double EmpSalary;
        
	//Non paramterized constructor 
	ThisCon(){
		EmpID =3222;
		EmpName = "Jules";
		EmpSalary = 223424;
	}
	
	//Constructor with 1 parameter and this() 
	ThisCon(int EmpID){
		this();
	}
	
	//Constructor with 3 parmeters
	ThisCon(int EmpID, String EmpName,double EmpSalary){
		this(EmpID);
	}

	public void printTC(){
		System.out.println("Employee ID: "+EmpID);
		System.out.println("Employee Name: "+EmpName);
		System.out.println("Employee Salary: "+EmpSalary);
	}
}
		
