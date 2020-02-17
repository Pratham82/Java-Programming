package Day33;

import java.io.Serializable;

public class EmployeeDB implements Serializable {
    int EmpID;
    String EmpName;
    //transient keyword hides value in console and file
    transient String EmpPass;

    EmployeeDB(int EmpID, String EmpName, String EmpPass){
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpPass = EmpPass;
    }

    public String toString(){
        return "Employee details: \nEmployee ID: "+EmpID+"\nEmployee name: "+EmpName+"\nEmployee password: "+EmpPass;
    }
}
