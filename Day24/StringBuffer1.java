package Day24;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        //length
        System.out.println(sb.length());

        //capacity
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("NewObject");

        //length
        System.out.println(sb1.length());

        //capacity
        System.out.println(sb1.capacity());

        //append
        //When the appended value exceeds 16 capacity will be changed
        //old value * 2 +2   Eg. 25 * 2+2 =52
        System.out.println(sb1.append("12345"));
        System.out.println(sb1.capacity());
        sb1 = sb1.append("123456789123456789");
        System.out.println(sb1);
        System.out.println(sb1.capacity());

        //insert
        StringBuffer sb2 = new StringBuffer("JustATest");
        //This will insert NotA in sb2 before index 1 which is u
        System.out.println(sb2.insert(1,"NotA"));

         //delete
        StringBuffer sb3 = new StringBuffer("012345678");
        //This will delete the characters between index 0 and 5
        System.out.println(sb3.delete(0,5));

        //replace
        StringBuffer sb4 = new StringBuffer("C++ Programming");
        System.out.println(sb4);
        //This will replace char between 0 and 3 with Java
        System.out.println(sb4.replace(0,3,"Java"));

        //charAt()
        StringBuffer sb5 = new StringBuffer("0123456");
        System.out.println(sb5.charAt(2));

        //charAtSet
        StringBuffer sb6 = new StringBuffer("Motion");
        //This will replace the char at 0th index with L
        sb6.setCharAt(0,'L');
        System.out.println(sb6);
    }
}
