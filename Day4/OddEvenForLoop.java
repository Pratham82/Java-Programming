package Day4;

public class OddEvenForLoop {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        int count1 = 0;
        int total1 = 0;
        System.out.println("Even numbers form 1 to 100: ");
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i);
                System.out.print("\t");
                count++;
                total += i;
            }
        }
        System.out.println("\nOdd numbers from 1 to 100: ");
        for(int j=1;j<=100;j++){
            if(j%2!=0){
                System.out.print(j);
                System.out.print("\t");
                count1++;
                total1 += j;
            }
        }
        System.out.println("\nCount of Even numbers from 0 to 100: "+ count);
        System.out.println("Total of Even numbers from 0 to 100: "+ total);
        System.out.println("Count of Odd numbers from 0 to 100: "+ count1);
        System.out.println("Total of Odd numbers from 0 to 100: "+ total1);
    }
}
