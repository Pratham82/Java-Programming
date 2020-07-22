package Practice_Problems.Edabit_Practice_problems;

// Create a function that takes a number (from 1 to 12) and returns its corresponding month name as a string. For example, if you're given 3 as input, your function should return "March", because March is the 3rd month.
public class Question_28 {
    public static void main(String[] args) {
        System.out.println(monthName(12));
        System.out.println(monthName(5));
    }

    public static String monthName(int num) {
        String month = "";
        switch (num) {

            case 1:
                month =  "January";
            break;
            case 2:
                month =  "February";
            break;
            case 3:
                month =  "March";
            break;
            case 4:
                month =  "April";
            break;
            case 5:
                month =  "May";
            break;

            case 6:
                month =  "June";
            break;
            case 7:
                month =  "July";
            break;
            case 8:
                month =  "August";
            break;
            case 9:
                month =  "September";
            break;
            case 10:
                month =  "October";
            break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;

        }
        return month;
    }

}
