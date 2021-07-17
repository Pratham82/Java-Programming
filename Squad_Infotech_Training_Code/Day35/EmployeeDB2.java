package Day35;

public class EmployeeDB2 {
    private int EmpID;
    private String EmpName;
    private int EmpSalary;

    EmployeeDB2(int EmpID,String EmpName, int EmpSalary){
        this.EmpID= EmpID;
        this.EmpName= EmpName;
        this.EmpSalary= EmpSalary;
    }

    public String toString(){
        return "Employee details: \nEmployee ID: "+EmpID+"\nEmployee Name: "+EmpName+"\nEmployee Salary: "+EmpSalary+"\n-------------------------------";
    }

    public int getEmpID(){
        return EmpID;
    }

    public void setEmpID(int EmpID){
         this.EmpID= EmpID;
    }
    public int getEmpSalary(){
        return EmpSalary;
    }

    public void setEmpSalary(int EmpSalary){
        this.EmpSalary= EmpSalary;
    }

    public String getEmpName(){
        return EmpName;
    }

    public void setEmpName(String EmpName){
        this.EmpName = EmpName;
    }
}
