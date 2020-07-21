package Practice_Problems;

public class TableForNum {
    public static void main(String[] args) {
        TableForNum.returnTable(5);
    }

    public static String returnTable(int num){
        for(int i =1; i<= 10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
        return "hello";
    }
}
