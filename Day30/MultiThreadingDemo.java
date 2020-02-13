package Day30;

class ThreadRunner extends  Thread{
    public void run(){
        for(int i=1 ;i<=5;i++) {
            System.out.println("Statement " + i);

            try {
                sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        ThreadRunner tr1 = new ThreadRunner();
        ThreadRunner tr2 = new ThreadRunner();
        ThreadRunner tr3 = new ThreadRunner();
        tr1.start();
        try{
            tr1.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        tr2.start();
        tr3.start();

    }
}
