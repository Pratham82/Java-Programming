package Day12;



class ThisMethod{
	public static void main(String [] args){
        ThisMethod tm = new ThisMethod(234,"Rock",3244555);
	tm.showDetails();

	}

	int EmpID;
	String EmpName;
	double EmpSalary;

	ThisMethod(int ID, String Name, double Salary){
		EmpID= ID;
		EmpName= Name;
		EmpSalary= Salary;
	}

	public void printDetails(){
		System.out.println("Employee ID: "+ EmpID);
		System.out.println("Employee Name: "+ EmpName);
	        System.out.println("EMployee Salary: "+EmpSalary);
	}

	public void showDetails(){
		this.printDetails();  //Calling printDetails method
	}
}

