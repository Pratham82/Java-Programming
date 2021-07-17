package Assignment_6;
/*Make pattern
C
Co
Cod
Code
Coder
 */
public class Question4 {
    public static void main(String[] args) {
        String s1 = "Coder";
        for(int i=0; i<=s1.length();i++){
            for(int j =0 ;j<i;j++){
                System.out.print(s1.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
