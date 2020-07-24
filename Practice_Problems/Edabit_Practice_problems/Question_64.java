package Practice_Problems.Edabit_Practice_problems;
// Find difference between the circumcircles
public class Question_64 {
    public static void main(String[] args) {
        System.out.println(squareAreasDifference(5));
    }

    public static int squareAreasDifference(int r) {
//        double areaOfCircle = Math.pow(3.14 * r, 2);
//        double diagonal = Math.pow(r, 2) + Math.pow(r, 2) / 2;

        return (int) ((Math.pow(r,2) / 2) * 4);
    }
}
