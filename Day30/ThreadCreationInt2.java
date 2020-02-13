package Day30;

class ThreadImplementer implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running"+Thread.currentThread());
    }
}

public class ThreadCreationInt2 {
    public static void main(String[] args) {
        ThreadImplementer ti = new ThreadImplementer();
        Thread t1 = new Thread(ti);
        t1.setPriority(8);
        t1.setName("A new thread created by interface");
        t1.start();
        System.out.println("Thread is running: "+t1.isAlive());
    }
}
