package Day30;

class ThreadExtender extends Thread{
    public void run(){
        System.out.println("Thread is running"+Thread.currentThread());
    }
}

public class ThreadCreationClass2 {
    public static void main(String[] args) {
        ThreadExtender te = new ThreadExtender();
        te.setPriority(8);
        te.setName("A new thread created by class");
        te.start();
    }
}
