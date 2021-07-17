package Day11;

public class ThisVar{
	public static void main(String []args){
		ThisVar tv = new ThisVar(232,"James",230000); //This is local variable
		tv.printTV();
	}
        //This is instance variable
	int EmpID= 455;
	String EmpName = "Lloyd";
	double EmpSalary = 344000;

	ThisVar(int EmpID, String EmpName, double EmpSalary){
                //If we print EmpID =EmpID then the instance variable's vlaue will be stored
		//To store the latest value of local varibale which is prvided with parameters we have to use 
		//'this' keyword so when we write this.EmpID then it will refer to class and store the value
		//of local variable to Instance variable	
		this.EmpID = EmpID;
	       	this.EmpName = EmpName;
		this.EmpSalary = EmpSalary;
	}

	public void printTV(){
		System.out.println("Employee ID: "+ EmpID);
		System.out.println("Employee Name: "+ EmpName);
		System.out.println("Employee Salary: "+EmpSalary);
	}
}
