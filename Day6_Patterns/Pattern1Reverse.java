package Day6_Patterns;

public class Pattern1Reverse {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=10;j>=i;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}


/*for(int i=10;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
10 10 10 10 10 10 10 10 10 10
9 9 9 9 9 9 9 9 9
8 8 8 8 8 8 8 8
7 7 7 7 7 7 7
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
for(int i=1;i<=10;i++){
            for(int j=10;j>=i;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
10 9 8 7 6 5 4 3 2 1
10 9 8 7 6 5 4 3 2
10 9 8 7 6 5 4 3
10 9 8 7 6 5 4
10 9 8 7 6 5
10 9 8 7 6
10 9 8 7
10 9 8
10 9
10
 */