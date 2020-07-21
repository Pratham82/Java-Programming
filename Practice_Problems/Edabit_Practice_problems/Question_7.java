package Practice_Problems.Edabit_Practice_problems;
// Create a function that takes length and width and finds the perimeter of a rectangle.
public class Question_7 {
    public static void main(String []args){
        System.out.println(findPerimeter(20,10));
    }
    public static int findPerimeter(int length, int width ){
        return (length+width) *2;
    }
}
