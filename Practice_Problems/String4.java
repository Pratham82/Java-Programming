package Practice_Problems;
/*
Convert the following string:
John Fitzgerald Kennedy > J. F. Kennedy
 */
public class String4 {
    public static void main(String[]args){
        String s1 = "John Fitzgerald Kennedy";
        //Step 1: split the string and store it in an array
        String [] s2 = s1.split(" ");
        System.out.println("Original String: "+s1);
        System.out.println("New String: ");
        //Step 2: Iterate though 1st 2 elements in an array.
        //And add '.' after it
        //Step 3: Print remaining strings in an array after the character.
        for(int i=0;i<s2.length-1;i++){
                System.out.print(s2[i].charAt(0)+".");
        }
        System.out.println(s2[2]);
    }
}

