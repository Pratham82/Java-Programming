package Day7;

public class Pattern13HollowSquare {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                if(i>=2&&i<=9&&j>=2&&j<=9){   //In this condition value
                    System.out.print("   ");  // " " will  be printed when the value of i and j is greater than and equal to 2 and 9 (2>=i&&<=9)
                }else  {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
/*  In this condition value " " will  be printed when the value of i and j is
    greater than and equal to 2 and lesser than equal to 9 i>=2&& i<=9 also j>=2 && j<=9
                 if(i>=2&&i<=9&&j>=2&&j<=9){   //
                    System.out.print("   ");


                }
                else  {
                    System.out.print(" * ");
                }
 */