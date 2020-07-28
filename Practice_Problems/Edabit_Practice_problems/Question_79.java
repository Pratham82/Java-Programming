package Practice_Problems.Edabit_Practice_problems;
// Create a function that takes an integer and returns it as an ordinal number.
// An Ordinal Number is a number that tells the position of something in a list, such as 1st, 2nd, 3rd, 4th, 5th, etc.
public class Question_79 {
    public static void main(String[] args) {
        System.out.println(returnTheEndOfNumber(412));
    }
    public static String returnTheEndOfNumber(int num) {
        return String.valueOf(num).endsWith("11")? String.valueOf(num)+
                "-TH ":String.valueOf(num).endsWith("12")? String.valueOf(num)+
                "-TH":String.valueOf(num).endsWith("13")? String.valueOf(num)+
                "-TH":String.valueOf(num).endsWith("14")? String.valueOf(num)+
                "-TH":String.valueOf(num).endsWith("15")? String.valueOf(num)+
                "-TH" :String.valueOf(num).endsWith("1")? String.valueOf(num)+
                "-ST":String.valueOf(num).endsWith("2")?String.valueOf(num)+
                "-ND":String.valueOf(num).endsWith("3")?String.valueOf(num)+
                "-RD":String.valueOf(num).endsWith("4")?String.valueOf(num)+
                "-TH":"0";
    }

}
