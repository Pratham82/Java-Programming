package Day6;

public class PatternHollowSquare {
    public static void main(String[] args) {
        for(int i=1; i<=10;i++){
            for(int j=1;j<=10;j++){
                if(i>=2&&j>=2&&i<=9&&j<=9){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}

/*

 *  *  *  *  *  *  *  *  *  *
 *                          *
 *                          *
 *                          *
 *                          *
 *                          *
 *                          *
 *                          *
 *                          *
 *  *  *  *  *  *  *  *  *  *




 */