package Practice_Problems;
/*
Convert the following string:
John Fitzgerald Kennedy > John F.
 */
public class String3 {
    public static void main(String[]args){
        String s1 = "John Fitzgerald Kennedy";
        //Step 1: split the string and store it in an array
        String [] s2 = s1.split(" ");
        System.out.println("Original String: "+s1);
        System.out.println("New String: ");
        System.out.print(s2[0]+" ");
        //Step 2: Print only first character of the name that we needed
        //And add '.' after it
        //Step 3: Print remaining strings in an array before and after the character.
        for(int i=0;i<s2.length;i++){
            if(s2[i].equals("Fitzgerald")){
                System.out.print(s2[i].charAt(0)+".");
            }
        }
        System.out.println(s2[2]);
    }
}

