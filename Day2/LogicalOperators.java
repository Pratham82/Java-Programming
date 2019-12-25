package Day2;

public class LogicalOperators {
    public static void main(String[]args){
        System.out.println("Logical operators using numbers:\n");

        int Num_1= 35;
        int Num_2= 15;

        System.out.println("Initial value of \nNum_1 = 35\nNum_2 = 15\n ");
        System.out.println("35 && 15 : "+((Num_1 == 35) && (Num_2==15)));
        System.out.println("45 && 15 : "+((Num_1 == 45) && (Num_2==15)));
        System.out.println("35 || 15 : "+((Num_1 == 35) || (Num_2==15)));
        System.out.println("45 || 15 : "+((Num_1 == 45) && (Num_2==15)));
        System.out.println("48 || 18 : "+((Num_1 == 48) && (Num_2==18)));
        System.out.println("35 ! 15 : "+!((Num_1== 35) && (Num_2==15)));

        System.out.println();
        System.out.println("Logical operators using True and False:\n");
        boolean True = true;
        boolean False = false;

        System.out.println("True && True = "+(True && True));
        System.out.println("True && False = "+(True && False));
        System.out.println("True || True = "+(True || True));
        System.out.println("True || False = "+(True || False));
        System.out.println("False || False = "+(False && False));
        System.out.println("!(True) = "+!(True));
        System.out.println("!(False) = "+!(False));

    }
}
