package Assignment_6;
//Check if the entered string is palindrome or not?
public class Question6 {
    public static void main(String[] args) {

        String s1 = "ABCDCBA";
        String OriginalString = s1;
        String ReversedString = "";

        for(int i =s1.length()-1; i>=0; i--){
            ReversedString = ReversedString + s1.charAt(i);

        }

        if(OriginalString.equalsIgnoreCase(ReversedString)){
            System.out.println("Entered string is Palindrome");
        }
        else{
            System.out.println("Entered string is not palindrome");
        }
    }
}
