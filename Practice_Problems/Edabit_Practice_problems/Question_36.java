package Practice_Problems.Edabit_Practice_problems;
/*
You are given 2 out of 3 angles in a triangle, in degrees.

Write a function that classifies the missing angle as either "acute", "right", or "obtuse" based on its degrees.

An acute angle is less than 90 degrees.
A right angle is exactly 90 degrees.
An obtuse angle is greater than 90 degrees (but less than 180 degrees).
For example: missingAngle(11, 20) should return "obtuse", since the missing angle would be 149 degrees, which makes it obtuse.
 */
public class Question_36 {
    public static void main(String[] args) {
        System.out.println(missingAngle(27, 59));
    }

    public static String missingAngle(int angle1, int angle2){
//        int  angleSum =angle1+angle2;
//        if(angleSum==90){
//            return "right";
//        }else if(angleSum >90){
//            return "obtuse";
//        }else {
//            return "acute";
//        }

        return angle1+angle2==90?"right":angle1+angle2<90?"obtuse":angle1+angle2>90?"acute":"none";
    }
}
