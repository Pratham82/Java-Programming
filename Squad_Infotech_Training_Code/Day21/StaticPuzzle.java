package Day21;

public class StaticPuzzle {
    public static void main(String[] args) {
    Puzzle p = new Puzzle();
    Puzzle p1 = new Puzzle();
    p.DisplayValues();
    p1.DisplayValues();

    }
}

class Puzzle{

           int A = 0;
    static int B = 0;

    Puzzle(){
        A++;
        B++;
    }

    public void DisplayValues(){
        System.out.println("A: "+A);
        System.out.println("B: "+B);
    }
}

/*Output:
A: 1
B: 2
A: 1
B: 2
* */