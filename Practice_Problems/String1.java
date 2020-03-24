package Practice_Problems;
//Write a java program to remove white spaces from a sentence.
public class String1 {
    public static void main(String[] args) {
        String St1 ="This is a Testing sentence, which contains multiple spaces";
        System.out.println("Original statement: "+St1);

        System.out.println("After removing whitespaces");
        St1 =St1.replaceAll(" ","");
        System.out.println("New Sentence: "+St1);
    }
}

/*
Output:

Original statement: This is a Testing sentence, which contains multiple spaces
After removing whitespaces
New Sentence: ThisisaTestingsentence,whichcontainsmultiplespaces

 */