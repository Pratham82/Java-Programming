package Day31;

class Design{
    String message;
    public synchronized void print(String message){
        this.message = message;
        System.out.print("[ "+message);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println(" ]");
    }
}
class Color extends Thread{
    Design d;
    String message;
    Color(Design dLocal ,String message ){
        this.d = dLocal;
        this.message =message;
        start();
    }
    public void run(){
        d.print(message);
    }
}
public class SynchronizedMethod {
    public static void main(String[] args) {
        Design ObjD = new Design();
        Color c1 = new Color(ObjD, "Red");
        Color c2 = new Color(ObjD, "Green");
        Color c3 = new Color(ObjD, "Blue");


    }
}

/*
OP Without sync method:

[ Green[ Red[ Blue ]
 ]
 ]

OP with sync method:
[ Red ]
[ Blue ]
[ Green ]


* */
