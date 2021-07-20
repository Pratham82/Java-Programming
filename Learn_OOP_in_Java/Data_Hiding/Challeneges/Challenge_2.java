package Learn_OOP_in_Java.Data_Hiding.Challeneges;

// Student Class
class Student {

    // Declare Fields Here
    private String name, rollNumber;


    // Write Getters/Setters here
    public String getName(){
        return "Name: "+this.name;
    }

    public String getRollNumber(){
        return "RollNumber: "+this.rollNumber;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setRollNumber(String newRollNo){
        this.rollNumber = newRollNo;
    }

}


public class Challenge_2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        s1.setName("Prathamesh");
        s1.setRollNumber("100");
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());

    }
}
