package DSA.Data_structures;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        /*
        Stack: A sequential access data structure in which we use the LIFO principle to add and remove elements
        from.
        LIFO
        We add elements to the back(tail) and remove them from the back(tail)
        Applications of stacks: Backpaging, undo-redo, recursion.
         */

        /*
        Stack methods
        ----------------
         push(Object<Type>)
         pop
         peek
         contains
         */

        /*
        Time complexity of an Arraylist
        -------------------------------
        Accessing: O(n)
        Searching: O(n)
        Inserting: O(1)
        Deleting: O(1)
         */
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i <= 10; i++) {
            stack1.push(i);
        }

        printStack(stack1);

        stack1.pop();

        printStack(stack1);

        System.out.println(stack1.peek());

        System.out.println(stack1.contains(8));
        System.out.println(stack1.contains(18));

    }

    static void printStack(Stack<Integer> s1) {
        System.out.println(s1);
    }
}
