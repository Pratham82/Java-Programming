package Day7;

public class Pattern15RightAngleTriRegRev {
    public static void main(String[] args) {
        for(int i=10;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=10;i>=1;i--){
            for(int j=10;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
        * * * * * * * * * *
        * * * * * * * * *
        * * * * * * * *
        * * * * * * *
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
*/