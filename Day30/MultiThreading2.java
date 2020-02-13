package Day30;

//We can extend a thread as well as implement simultaneously
class ThreadExt extends Thread implements Runnable{
    String message;
    @Override
    public void run() {
        System.out.print("[ "+ message);
        try{
            Thread.sleep(500);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println(" ]");
    }
}

public class MultiThreading2 {
    public static void main(String[] args) {
        ThreadExt te1 = new ThreadExt();
        ThreadExt te2 = new ThreadExt();
        ThreadExt te3 = new ThreadExt();

        //Setting priority
        te1.setPriority(Thread.MAX_PRIORITY);
        te2.setPriority(Thread.NORM_PRIORITY);
        te3.setPriority(Thread.MIN_PRIORITY);

        te1.message= "Hi";
        te2.message= "I am";
        te3.message= "Prathamesh";

        te1.start();
        try{
            te1.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

        te2.start();
        try{
            te2.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

        te3.start();
        try{
            te3.join();
        }catch(InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}
