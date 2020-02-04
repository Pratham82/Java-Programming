package Assignment_6;
//Write a program for reversing a string
public class Question5 {
    public static void main(String[] args) {
        String s1 = "Language";
        System.out.println("Original String: "+s1);
        System.out.print("Reversed String: ");
        for(int i=s1.length()-1;i>=0;i-- ){
            System.out.print(s1.charAt(i));
        }
        //System.out.println("Reversed String: "+s1);
    }
}
