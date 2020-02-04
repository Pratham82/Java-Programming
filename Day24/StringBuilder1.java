package Day24;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();

        int a1 = sb1.length();

        StringBuffer sb2 = new StringBuffer("NewObject");

        //length
        int a2 = sb2.length();

        //capacity
        int a3 = sb2.capacity();

        //append
        sb2.append("New Text");
        System.out.println(sb2);
    }

}
