package Practice_Problems;
//5. rite a Java program to test if an array contains a specific value.
public class Array1 {
    public void ArrayContains(int[] Arr,int num1){
        int count =0;
        for(int n: Arr){
            //int i=0;
            if(num1==n){
                count++;
            }
        }
        if(count>=1){
            System.out.println("Entered number is present in Array, and it appears "+count+ " times.");
        }else{
            System.out.println("Entered number is not present in Array");
        }
    }
    public static void main(String []args){
        int [] Array1 = {45,564,521,87,1454,2115,1214};
        Array1 a1 = new Array1();
        a1.ArrayContains(Array1,1214);

    }
}
