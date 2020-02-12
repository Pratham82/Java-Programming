package Day30;

public class IsAliveMethod extends Thread{
    public void run(){
        System.out.println("Statement 1");


        try {
            //The sleep() method of Thread class is used to sleep a thread
            // for the specified amount of time.
            //Arguments in milliseconds 1 second = 1000 milliseconds
            sleep(1000);
            System.out.println("");

        } catch (InterruptedException e) {
            e.printStackTrace();
            //The statement 2 will be printed after 1 second of printing Statement 1
        }System.out.println("Statement 2");
    }
    public static void main(String[] args) {
        SleepMethod sm1 = new SleepMethod();
        SleepMethod sm2 = new SleepMethod();
        sm1.start();
        /*The isAlive() method of thread class tests if the thread is alive.
        A thread is considered alive when the start() method of thread class has been called and the thread is not yet dead.
        This method returns true if the thread is still running and not finished.
        */
        //As soon as the thread is started is alive method will give output(in boolean)
        System.out.println("Thread is running: "+sm1.isAlive());
    }

}
