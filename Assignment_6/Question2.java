package Assignment_6;
//Change string from  "Sachin Ramesh Tendulkar"> "Tendulkar Ramesh Sachin"

public class Question2 {
    public static void main(String[] args) {
        String s1 =  "Sachin Ramesh Tendulkar";
        String [] s2 = s1.split(" ");
        for(int i = s2.length-1; i>=0; i--){
            System.out.print(s2[i]+" ");
        }
    }
}
