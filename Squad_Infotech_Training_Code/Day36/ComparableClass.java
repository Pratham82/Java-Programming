package Day36;

public class ComparableClass implements Comparable<ComparableClass>{
    private int StudentID;
    private String StudentName;
    private int StudentMarks;


    public ComparableClass(int studentID, String studentName, int studentMarks) {
        StudentID = studentID;
        StudentName = studentName;
        StudentMarks = studentMarks;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentMarks() {
        return StudentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        StudentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "ComparableClass{" +
                "StudentID=" + StudentID +
                ", StudentName='" + StudentName + '\'' +
                ", StudentMarks=" + StudentMarks +
                '}';
    }

    @Override
    public int compareTo(ComparableClass c) {
        //Sorting on the basis of Student ID
        //return getStudentID()-c.getStudentID();

        //Soring on the basis of StudentMarks
        //return getStudentMarks()-c.getStudentMarks();

        //Sorting on the basis of StudentName
        return getStudentName().compareTo(c.getStudentName());
    }
}
