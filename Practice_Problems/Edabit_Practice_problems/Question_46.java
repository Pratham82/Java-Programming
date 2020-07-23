package Practice_Problems.Edabit_Practice_problems;
/*
Write a function that accepts base (decimal), height (decimal) and shape ("triangle", "parallelogram") as input and calculates the area of that shape.

 */
public class Question_46 {
    public static void main(String[] args) {
        System.out.println(areaShape(2, 3, "triangle"));
        System.out.println(areaShape(8, 6, "parallelogram"));
        System.out.println(areaShape(2.9, 1.3, "parallelogram"));
    }
    public static double areaShape(double base,double height, String shape){
        return shape.equals("triangle")? Math.floor(base*height*0.5): base*height;
    }
}
