package Day15;

import java.util.Scanner;

public class HierarchicalInheritance {
    public static void main(String[] args) {
    Student s= new Student();
    Employee e = new Employee();
    System.out.println("----------------------");
    System.out.println("Enter Student details: ");
    s.EnterBasicDetails();
    s.EnterStudentDetails();
    s.printBasicDetails();
    s.printStudentDetails();
    System.out.println("----------------------");
    System.out.println("Enter Employee details");
    e.EnterBasicDetails();
    e.EnterEmpDetails();
    e.printBasicDetails();
    e.printEmpDetails();
    }
}
class Person{
    Scanner scan = new Scanner(System.in);
    String Name;
    int Age;
    String Gender;

    public void EnterBasicDetails(){
        System.out.print("Enter your Name: ");
        Name = scan.next();
        System.out.print("Enter your Age: ");
        Age = scan.nextInt();
        System.out.print("Enter your Gender: ");
        Gender = scan.next();
    }
    public void printBasicDetails(){
        System.out.println("Name : "+Name );
        System.out.println("Age: "+Age);
        System.out.println("Gender: "+Gender);
    }
}

//Student class is extending Person(Parent class)
class Student extends Person{
    Scanner scan = new Scanner(System.in);
    int StudentID;
    String ClassName;

    public void EnterStudentDetails(){
        System.out.print("Enter Student ID: ");
        StudentID = scan.nextInt();
        System.out.print("Enter Class name and Major: ");
        ClassName = scan.next();
    }

    public void printStudentDetails(){
        System.out.println("Student ID: "+StudentID);
        System.out.println("Student class and major: "+ClassName);
    }
}

//Employee class extends Parent(Parent class)
class Employee extends Person{
    Scanner  scan = new Scanner(System.in);
    int EmpID;
    String EmpDept;
    String EmpDesignation;

    public void EnterEmpDetails(){
        System.out.print("Enter Employee ID: ");
        EmpID = scan.nextInt();
        System.out.print("Enter Department: ");
        EmpDept = scan.next();
        System.out.print("Enter Designation: ");
        EmpDesignation = scan.next();
    }
    public void printEmpDetails(){
        System.out.println("Employee ID: "+EmpID);
        System.out.println("Department: "+EmpDept);
        System.out.println("Designation: "+EmpDesignation);
    }
}




