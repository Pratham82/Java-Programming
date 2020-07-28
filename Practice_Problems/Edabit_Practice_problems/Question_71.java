package Practice_Problems.Edabit_Practice_problems;
// take the number find its square root and return the cube of that number
public class Question_71 {
    public static void main(String[] args) {
        System.out.println(cubeSquare(9));
    }

    public static int cubeSquare(int num){
        return (int) Math.pow(Math.sqrt(num),3);
    }
}
