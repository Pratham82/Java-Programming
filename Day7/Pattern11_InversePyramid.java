package Day7;

public class Pattern11_InversePyramid {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=10;k>=i;k--){
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
 */