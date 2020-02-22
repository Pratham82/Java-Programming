package Practice_Problems;

import java.util.Scanner;

public class Array2 {
    public void TakeInput(int ArrPos, int newNo){

    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int []TestArr ={54,3212,4533,6545,21241,321};
        System.out.print("Current array: ");
        for(int i:TestArr){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("Enter the position you want to change: ");
        int ArrPos = scan.nextInt();

        if(ArrPos<=TestArr.length){
            System.out.print("Enter new number for this position: ");
            int NewNo = scan.nextInt();

            for (int i = 0; i <= ArrPos; i++) {
                TestArr[ArrPos] = NewNo;
            }
            System.out.println("Number successfully added to Array at "+ArrPos);
            System.out.print("New Array: ");
            for (int i : TestArr) {
                System.out.print(i + " ");
            }
        }else{
            System.out.println("Please enter correct position");
        }
    }
}
