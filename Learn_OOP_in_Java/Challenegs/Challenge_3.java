package Learn_OOP_in_Java.Challenegs;

public class Challenge_3 {
    public static void main(String[] args) {
        Student student = new Student("Jack", 60, 70);
        System.out.println(student.calcTotal());
    }
}

class Student {

    // Define private fields here
    private double mark1, mark2;
    private String name;

    public Student() {
        // Write definition here
    }

    public Student(String name, double mark1, double mark2) {
        // Write definition here
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public double getMarks(int markNumber) {
        // Write definition here
        return markNumber == 1 ? mark1 : markNumber == 2 ? mark2 : 0;
    }

    public double calcTotal() {
        // Write definition here
        return mark1 + mark2;
    }

}


