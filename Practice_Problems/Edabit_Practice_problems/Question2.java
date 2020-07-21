// Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.

package Practice_Problems.Edabit_Practice_problems;

class Question_2{
    public static void main(String[] args){
        // Calling method using object reference of the class
        Question_2 q2 = new Question_2();
        System.out.println(q2.lessThan100(100,500));

        // Calling method directly using className because the method is static
        System.out.println(Question_2.lessThan100(40,50));
    }

    public static boolean lessThan100(int n1 , int n2){
        return n1+n2 <100;
    }
}