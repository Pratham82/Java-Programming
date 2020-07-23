package Practice_Problems.Edabit_Practice_problems;
// Create a function that removes the first and last characters from a string.
// If the string is 2 or fewer characters long, return the string itself (See example #4).
public class Question_52 {
    public static void main(String[] args) {
        System.out.println(removeFirstLast("hello"));
    }
    public static String removeFirstLast(String str){
//        if(str.length() <=2){
//            return str;
//        }
//        String newString ="";
//        for( char i =1; i < str.length()-1; i++){
//            newString+= str.charAt(i);
//        }
//
//        return newString;
        return str.length()<=2?str:str.substring(1,str.length()-1);

    }
}
