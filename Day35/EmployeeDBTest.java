package Day35;

import java.util.*;

public class EmployeeDBTest {
    public static void main(String[] args) {
        EmployeeDB2 ed1 = new EmployeeDB2(101,"Employee 1",54543);
        EmployeeDB2 ed2 = new EmployeeDB2(102,"Employee 2",56463);
        EmployeeDB2 ed3 = new EmployeeDB2(103,"Employee 3",97454);

        List<EmployeeDB2> edb = new ArrayList<EmployeeDB2>();
        edb.add(ed1);
        edb.add(ed2);
        edb.add(ed3);

        for(EmployeeDB2 e: edb){
            System.out.println(e);
        }
    }
}
