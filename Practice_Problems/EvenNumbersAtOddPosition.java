package Practice_Problems;
//Finding even numbers at odd positions
import java.util.Scanner;

public class EvenNumbersAtOddPosition {
    /* public static int Reverse(int num){
        int rev = 0;
        while(num>0){
            rev = num*10 + num%10;
            num = num/10;
        }
        return rev;
    }*/
    public static void main(String[] args) {
    int num;
    int EvenCounter =0;
    int remainder = 0;
    int index =1;
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = scan.nextInt();
        //num = Reverse(num);
    while(num!=0){
        remainder = num%10;
        if(remainder%2==0&&index%2!=0){
            System.out.println();
            EvenCounter++;
        }
        num = num/10;
        index++;

    }

        System.out.println("Even numbers at odd position: "+EvenCounter);
        scan.close();
    }
}
