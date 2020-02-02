package Day21;

public class EncapsulationDemo{
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setEmpID(234);
        System.out.println(e1.getEmpID());
        e1.setEmpName("1st Employee");
        System.out.println(e1.getEmpName());
    }
}

class Encapsulation{

    //Private variables for encapsulation
    private int EmpID;
    private String EmpName;

    //Creating getters setters
    public int getEmpID() {
        return EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    void setEmpID(int empId){
        EmpID = empId;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    //ToString methods:
    public String toString(){
        return "Employee Details: \n1. Employee ID: "+EmpID+"\n2. Employee Name: "+EmpName;
    }
}

