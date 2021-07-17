package Day20;

class StaticCustom{
    static int Add(int A, int B){
        System.out.println("A + B: "+(A+B));
        return 0;
    }

    static int Multiply(int A, int B){
        System.out.println("A * B: "+(A*B));
        return 0;
    }

    static int Square(int A){
        System.out.println(A+"^2: "+(A*A));
        return 0;
    }

    //Non static method 1
    String Show1(String S){
        System.out.println("String entered: "+S);
        return null;
    }

    String  Show2(String P, String Q){
        System.out.println("String 1 + String 2 :"+(P+Q));
       return null;
    }


}