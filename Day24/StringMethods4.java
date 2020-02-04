package Day24;

public class StringMethods4 {
    public static void main(String[] args) {
        String s1 = "roses are red";
        String s2 = "roses are red and cherries are red";
        String s3 = "   This is String with whitespace ";

        //indexOf
        System.out.println(s1.indexOf('r'));
        System.out.println(s2.indexOf('r'));
        //This will find anf prints out r after index
        System.out.println(s2.indexOf('r',8));

        //lastIndexOf
        //This will find character  r which is present at the last
        System.out.println(s1.lastIndexOf('r'));
        //This will find 'r' before index 8 and prints it
        System.out.println(s1.lastIndexOf('r',8));

        //Split
        //Split will actually split the string at the places of white spaces
        String []s4 = s2.split(" ");
        for(String s: s4){
            System.out.println(s);
        }

        System.out.println("-------------------------");
        //Split with limit
        //This will split the string in 4 parts and stores it in s5
        String[] s5 = s2.split(" ",5);
        for(String i : s5){
            System.out.println(i);
        }

        //trim
        //This will removes(trims) the white spaces which, except the white spaces between two characters
        System.out.println(s3.trim());
    }
}
