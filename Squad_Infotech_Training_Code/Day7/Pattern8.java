package Day7;

public class Pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                if(i%2==0){
                    System.out.print("# " );
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}


/*
* */



/*

Steps for solving:
Desired output:
        *
      # #
    * * *
  # # # #
* * * * *

Step 1:
for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789

So now we want out triangle to be mirrored so for doing that first
we will try to print the inverse triangle of current triangle by
taking the initial value of j =9 and then decrementing it to i
for(int i=1;i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }

Output:

987654321
98765432
9876543
987654
98765
9876
987
98
9

Now we have to take another variable for showing mirrored triangle
and initial value of k =1 and we will increment till value of i
We will write this loop just after our Inner loop of j
for(int i=1;i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print(j);
            }
            for(int k=1;k<=i;k++){
                System.out.print("*" );
            }
            System.out.println();
        }

output:
987654321*
98765432**
9876543***
987654****
98765*****
9876******
987*******
98********
9*********


Now we got our mirrored triangle but the value iof i is still there
so to remove that we will replace value of i with "  " blank spaces
and for better spacing add one space to "* "

output:
for(int i=1;i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

output:
                  *
                * *
              * * *
            * * * *
          * * * * *
        * * * * * *
      * * * * * * *
    * * * * * * * *
  * * * * * * * * *

  But still out pattern is not similar to the given pattern because there is hash tag
  on the alternating line and * on remaining so for this we take print the values of i and then we wil check if else condition
  if the value of i is and odd number we will print as " * " and if even values we will print as " # "
for(int i=1;i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                if(i%2==0){
                    System.out.print("# " );
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

Output:
                  *
                # #
              * * *
            # # # #
          * * * * *
        # # # # # #
      * * * * * * *
    # # # # # # # #
  * * * * * * * * *

* */