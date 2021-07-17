package Day26;

interface Interface3{
    void InMethod1();
}

interface Interface4{
    void InMethod2(int d, int e);
}

class Employee{
    public static void StaticMethod(){
        System.out.println("This is static method");
    }
    public static void StaticMethod2(int f,int g){
        System.out.println("This is static method with 2 parameters");
        System.out.println("Addition of local variables: "+(f+g));
    }
}

public class MethodReferenceStatic {
    public static void main(String[] args) {
        //similar to calling static method in class
        //Eg. Calling static method: Employee.StaticMethod();
        //Static method reference: Interface4 i4 = Employee::StaticMethod;
        // Instead of . we use :: to call static method of Employee class.
        Interface3 i3 = Employee::StaticMethod;
        i3.InMethod1();

        Interface4 i4 = Employee::StaticMethod2;
        i4.InMethod2(40,50);
    }
}
