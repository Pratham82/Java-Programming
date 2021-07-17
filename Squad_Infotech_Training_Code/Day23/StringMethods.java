package Day23;

public class StringMethods {
    public static void main(String[] args) {
        String s0 = "java";
        String s1 = "Java";
        String s2 = "JAVA";
        String s3 = "roses are red";
        String s4 = "roses are red, violets are not red";
        String s5 = new String("Python");
        String s6 = "Python";

        System.out.println("Methods in string\n");

        //chartAt()
        System.out.println(s0.charAt(2));

        //concat
        System.out.println(s1.concat(s3));

        //startsWith
        System.out.println(s3.startsWith("roses"));

        //endsWith
        System.out.println(s3.endsWith("red"));

        //length
        System.out.println(s2.length());

        //replace
        System.out.println(s4.replace('r','n'));
        System.out.println(s4.replaceAll("red","blue"));
        System.out.println(s4.replaceFirst("red","white"));

        //toLowerCase
        System.out.println(s2.toLowerCase());

        //toUpperCase
        System.out.println(s0.toUpperCase());

        //substring
        System.out.println(s4.substring(4));
        System.out.println(s4.substring(4,16));
        System.out.println(s4.subSequence(4,16));

        //compareTo
        System.out.println(s0.compareTo(s1));

        //intern
        String s7 = s5.intern();
        System.out.println(s7==s6);

        //contentEqualsTo
        System.out.println(s5.contentEquals(s6));

        //copyOfValue
        char [] c = {'m','a','t','h','e','m','a','t','i','c','s'};
        String s8 = String.copyValueOf(c,5,5);
        System.out.println(s8);

        String s9 = "";
        s9 = s9.copyValueOf(c);
        System.out.println("Returned string: "+s9);



    }
}
