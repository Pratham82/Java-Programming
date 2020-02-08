package Day27;

import java.util.function.Consumer;

class ChildClass22 implements Consumer<Integer> {

    @Override
    public void accept(Integer LocalInt1) {
        if (LocalInt1 >= 18) {
            System.out.println("You are eligible for voting");

        } else {
            System.out.println("You are not eligible for voting");
        }
    }
}

public class ConsumerInterfaceLogical {
    public static void main(String[] args) {
        //Implementing using class
        ChildClass22 cc2 = new ChildClass22();
        cc2.accept(18);

        //Implementing method directly
        Consumer<Integer> cref1 = LocalInt ->{
            if (LocalInt>= 18) {
                System.out.println("You are eligible for voting");

            } else {
                System.out.println("You are not eligible for voting");
            }
        };
        cref1.accept(45);
    }
}
