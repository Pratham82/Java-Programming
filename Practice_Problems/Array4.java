package Practice_Problems;
//12. Write a Java program to find the duplicate values of an array of integer values.
public class Array4 {
    public static void main(String[] args) {
        int []Arr1 = {454,1454,123,545,44,5654,6545,454,1454};

        for(int i=0;i<Arr1.length;i++){
            for(int j=i+1;j<Arr1.length;j++){
                if(Arr1[i]==Arr1[j]){
                    System.out.println("Duplicate element: "+Arr1[i]);
                }
            }
        }
    }
}
