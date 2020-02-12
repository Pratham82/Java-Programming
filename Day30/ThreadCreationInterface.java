package Day30;
/*Extend runnable interface(functional interface) which is present in java.lang package
  After extending override run method
  Create object of our child class which is extending Thread class
  And then invoke start method to execute run method
 */
public class ThreadCreationInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Overriding rn method of runnable interface");
    }
    //main method represents main thread
    //Thread executes the jobs in a sequence. It is an execution context.
    //Threads written in main thread will run concurrently at the same time.
    public static void main(String[] args) {
        ThreadCreationInterface tcr = new ThreadCreationInterface();
        tcr.run();
    }
}

