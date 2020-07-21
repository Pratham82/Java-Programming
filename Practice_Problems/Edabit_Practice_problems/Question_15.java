package Practice_Problems.Edabit_Practice_problems;
/*
Create a function that determines whether or not it's possible to split a pie fairly given these three parameters:

Total number of slices.
Number of recipients.
How many slices each person gets.
The function will be in this form:

equalSlices(total slices, no. recipients, slices each)

* */
public class Question_15 {
    public static void main(String args[]){
        System.out.println(Question_15.equalSlices(11,5,2));
        System.out.println(Question_15.equalSlices(11,3,3));
        System.out.println(Question_15.equalSlices(5,5,2));
    }

    public static boolean equalSlices(int total, int people,int each){
        return people * each <= total;
    }
}
