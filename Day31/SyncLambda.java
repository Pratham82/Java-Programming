package Day31;

public class SyncLambda {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Statement 1");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
                System.out.println("Statement 2");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
