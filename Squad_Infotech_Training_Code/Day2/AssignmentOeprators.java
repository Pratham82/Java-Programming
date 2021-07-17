package Day2;

public class AssignmentOeprators {
    public static void main(String [] args){
        int Num_1 = 20;
        int Num_2 = 0;
        Num_2= Num_1++;
        System.out.println("Applying post increment");
        System.out.println("Value of Num_1 = "+Num_1);
        System.out.println("Value of Num_2 = "+Num_2);

        System.out.println();

        int Num_3 = 30;
        int Num_4 = 0;
        Num_4 = ++Num_3;
        System.out.println("Applying pre increment");
        System.out.println("Value of Num_3 = "+Num_3);
        System.out.println("Value of Num_4 = "+Num_4);

        System.out.println();

        int Num_5 = 40;
        int Num_6 = 20;
        System.out.println("Value of Num_5 = 20\nValue of Num_6 = 40\n");
        System.out.println("Num_5 += Num_6 = "+(Num_5 += Num_6));
        System.out.println("Num_5 -= Num_6 = "+(Num_5 -= Num_6));
        System.out.println("Num_5 *= Num_6 = "+(Num_5 *= Num_6));
        System.out.println("Num_5 /= Num_6 = "+(Num_5 /= Num_6));
        System.out.println("Num_5 += Num_6 = "+(Num_5 %= Num_6));



    }
}
