package Practice_Problems;
//Write a java program to find number of white spaces
public class String2 {
    public static void main(String []args){
        String statement = "This is testing statement1, and it is stored in String statement";
        System.out.println("Original Statement: "+statement);

        int count = 0;
       for(int  i =0; i<statement.length(); i++){
           if(statement.charAt(i)==' '){
                count++;
           }
       }
        System.out.println("Number of spaces found: "+count);
    }
}
