package Day30;

public class SleepMethod extends  Thread{
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
        sm2.start();
        /*We cannot start same thread with same reference variable twice
        eg.
        sm1.start();
        sm1.start();

        What if we call run() method directly instead start() method?
        1. Each thread starts in a separate call stack.
        2. Invoking the run() method from main thread, the run() method goes onto the
           current call stack rather than at the beginning of a new call stack.

        that there is no context-switching because here sm1 and sm2
        will be treated as normal object not thread object.

        OP of start:
        Statement 1
        Statement 1
        Statement 2
        Statement 2

        OP of run :
        Statement 1
        Statement 2
        Statement 1
        Statement 2
         */

    }
}

