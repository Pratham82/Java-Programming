package Day5;
import java.util.Scanner;
public class FactorFor  {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Number to get its Factors: ");
        int num=scan.nextInt();
        for(int i=1; i<=num;i++){
            if(num%i==0){
                System.out.print(i);
            }
        }
    }
}
