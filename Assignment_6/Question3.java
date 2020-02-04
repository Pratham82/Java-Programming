package Assignment_6;
//Change string from  "Sachin Ramesh Tendulkar" > "S. R. Tendulkar"

public class Question3 {
    public static void main(String[] args) {
        String s1 =  "Sachin Ramesh Tendulkar";
        String [] s2 = s1.split(" ");
        for(int i = 0; i<=s2.length-2; i++){
            System.out.print(s2[i].charAt(0)+".");
        }
        //System.out.println(s2[s2.length-1]);
        System.out.println(s2[2]);
    }
}
