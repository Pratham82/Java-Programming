package Practice_Problems;
//15. Write a Java program to find the common elements between two arrays of integers.
public class Array3 {
    public static void main(String []args){
        int []Arr1 ={54,456,41,1,474,1321,874,};
        int []Arr2= {41,1321,65,4654,365,64};
        int count=0;
        for (int i : Arr1) {
            for (int j : Arr2) {
                if (i == j) {
                    System.out.println("Common value between two arrays: " + j);
                    count++;
                }
            }
        }
        System.out.println("Number of common elements in two arrays: "+count);
    }
}
