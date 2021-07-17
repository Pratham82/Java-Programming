package Day4;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Printing numbers from 0 to 50: ");
        for(int i=1;i<=50;i++){
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println("\n\nPrinting alphabets from A to Z:");
        for(char c='A'; c<='Z';c++){
            System.out.print(c);
            System.out.print("\t");
        }
    }
}
