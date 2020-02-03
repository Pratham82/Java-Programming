package Day23;

public class StringOperator {
    public static void main(String[] args) {
        String s0 = new String("CODER");
        String s1 = new String("Coder");
        String s2 = new String("coder");
        String s3 = "coder";
        String s4 = "coder";
        String s5 = s0;

        System.out.println("\nComparing memory location: \n");
        System.out.println("CODER == Coder: "+(s0==s1));
        System.out.println("Coder == coder: "+(s1==s2));
        System.out.println("coder == coder: "+(s2==s3));
        System.out.println("coder == coder: "+(s3==s4));
        System.out.println("coder == CODER: "+(s4==s5));
        System.out.println("CODER == CODER: "+(s5==s0));

        System.out.println("\nComparing String using methods" );
        System.out.println("--------------------------------");
        //Compares two strings
        System.out.println("\nequals method");
        System.out.println("------------------");
        System.out.println("CODER.equals(Coder): "+ (s0.equals(s1)));
        System.out.println("Coder.equals(coder): "+ (s1.equals(s2)));
        System.out.println("coder.equals(coder): "+ (s2.equals(s3)));
        System.out.println("coder.equals(coder): "+ (s3.equals(s4)));
        System.out.println("coder.equals(CODER): "+ (s4.equals(s5)));
        System.out.println("CODER.equals(CODER): "+ (s5.equals(s0)));

        System.out.println("--------------------------------");
        //Compares the string regardless of the its case(Uppercase or lowercase)
        System.out.println("\nequalsIgnoreCase method");
        System.out.println("------------------");
        System.out.println("CODER.equalsIgnoreCase(Coder): "+ (s0.equalsIgnoreCase(s1)));
        System.out.println("Coder.equalsIgnoreCase(coder): "+ (s1.equalsIgnoreCase(s2)));
        System.out.println("coder.equalsIgnoreCase(coder): "+ (s2.equalsIgnoreCase(s3)));
        System.out.println("coder.equalsIgnoreCase(coder): "+ (s3.equalsIgnoreCase(s4)));
        System.out.println("coder.equalsIgnoreCase(CODER): "+ (s4.equalsIgnoreCase(s5)));
        System.out.println("CODER.equalsIgnoreCase(CODER): "+ (s5.equalsIgnoreCase(s0)));

        System.out.println("--------------------------------");
        //Compares the string lexicographically
        // Each character of both the strings is converted into a Unicode value for comparison.
        System.out.println("\ncompareTo method");
        System.out.println("------------------");
        System.out.println("CODER.compareTo(Coder): "+ (s0.compareTo(s1)));
        System.out.println("Coder.compareTo(coder): "+ (s1.compareTo(s2)));
        System.out.println("coder.compareTo(coder): "+ (s2.compareTo(s3)));
        System.out.println("coder.compareTo(coder): "+ (s3.compareTo(s4)));
        System.out.println("coder.compareTo(CODER): "+ (s4.compareTo(s5)));
        System.out.println("CODER.compareTo(CODER): "+ (s5.compareTo(s0)));

        System.out.println("--------------------------------");
        //Compares the string lexicographically
        // Each character of both the strings is converted into a Unicode value for comparison.
        System.out.println("\ncompareToIgnoreCase method");
        System.out.println("------------------");
        System.out.println("CODER.compareToIgnoreCase(Coder): "+ (s0.compareToIgnoreCase(s1)));
        System.out.println("Coder.compareToIgnoreCase(coder): "+ (s1.compareToIgnoreCase(s2)));
        System.out.println("coder.compareToIgnoreCase(coder): "+ (s2.compareToIgnoreCase(s3)));
        System.out.println("coder.compareToIgnoreCase(coder): "+ (s3.compareToIgnoreCase(s4)));
        System.out.println("coder.compareToIgnoreCase(CODER): "+ (s4.compareToIgnoreCase(s5)));
        System.out.println("CODER.compareToIgnoreCase(CODER): "+ (s5.compareToIgnoreCase(s0)));


    }
}
