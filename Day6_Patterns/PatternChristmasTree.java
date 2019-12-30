package Day6_Patterns;

public class PatternChristmasTree {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=10;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                if(i%2==0){
                    System.out.print("  * ");
                }else {
                    System.out.print("  $ ");
                }
            }
            System.out.println();
        }
        for(int l=1;l<=4;l++){
            System.out.println("                     ||    ");
        }
    }
}

/*
                      *
                    $   $
                  *   *   *
                $   $   $   $
              *   *   *   *   *
            $   $   $   $   $   $
          *   *   *   *   *   *   *
        $   $   $   $   $   $   $   $
      *   *   *   *   *   *   *   *   *
    $   $   $   $   $   $   $   $   $   $
                     ||
                     ||
                     ||
                     ||

                      $
                    *   *
                  $   $   $
                *   *   *   *
              $   $   $   $   $
            *   *   *   *   *   *
          $   $   $   $   $   $   $
        *   *   *   *   *   *   *   *
      $   $   $   $   $   $   $   $   $
    *   *   *   *   *   *   *   *   *   *
                     ||
                     ||
                     ||
                     ||

 */