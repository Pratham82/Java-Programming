package Day7;

public class Pattern13_HollowSquareAnotherWay {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                if((i==1||i==10)||(j==1||j==10)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
            In this condition i and j's value will be printed if value i is equal to 1 or 5,
            value of j is equal to 1 or 5, or value of i is equal to j

                if((i==1||i==10)||(j==1||j==10)||(i==j)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

**/
