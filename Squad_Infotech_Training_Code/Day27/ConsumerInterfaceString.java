package Day27;

import java.util.function.Consumer;

class ChildClass234 implements Consumer<String >{

    @Override
    public void accept(String Qual) {
        if(Qual.equals("B.E.")||Qual.equals("B.E")||Qual.equals("BE")){
            System.out.println("You are qualified for the M.Tech");
        }else{
            System.out.println("You are not qualified for the M.Tech");
        }
    }
}

public class ConsumerInterfaceString {
    public static void main(String[] args) {
        //String method using class
        ChildClass234 c2 = new ChildClass234();
        c2.accept("BE");

        //Implementing directly
        Consumer<String> ci1 = Qualification ->{
            if(Qualification.equals("B.E.")||Qualification.equals("B.E")||Qualification.equals("BE")){
                System.out.println("You are qualified for the M.Tech");
            }else{
                System.out.println("You are not qualified for the M.Tech");
            }
        };
        ci1.accept("BE");
    }
}
