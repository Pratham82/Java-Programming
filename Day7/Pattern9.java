package Day7;

public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=9;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
/*
Step 1
1
22
333
4444
55555
666666
7777777
88888888
999999999

Step 2:Add value of * on the empty place by using another variable
and initial value of k will be 9 and decrement till value of i
1*********
22********
333*******
4444******
55555*****
666666****
7777777***
88888888**
999999999*

Step 3:Replace value of i with "  " empty spaces and also add
one empty space in the like this "* "

  * * * * * * * * *
    * * * * * * * *
      * * * * * * *
        * * * * * *
          * * * * *
            * * * *
              * * *
                * *
                  *

* */
