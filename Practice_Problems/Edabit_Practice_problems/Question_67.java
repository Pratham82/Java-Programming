package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;

// Create a function that converts a date formatted as MM/DD/YYYY to YYYYDDMM.
// formatDate("11/12/2019") ➞ "20191211"
public class Question_67 {
    public static void main(String[] args) {
        System.out.println(formatDate("11/12/2019"));
    }

    public static String formatDate(String date){
        String [] newDateArr = date.split("/");
        String []finDate = new String[newDateArr.length];
        //String fin ="";
        // Reverse date
        int j =0;
        for(int i= newDateArr.length-1; i >= 0; i--){
            finDate[j] =  newDateArr[i];
            j++;
        }

        return String.join("",finDate);


    }
}
