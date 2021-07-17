package Day30;

public class JoinMethod extends  Thread{
    public void run(){
        for(int i =1; i<=3; i++) {
            System.out.println(i);
            try {
                sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        JoinMethod jm1 = new JoinMethod();
        JoinMethod jm2 = new JoinMethod();

        //The join() method waits for a thread to die. In other words,it causes the currently running
          //threads to stop executing until the thread it joins with completes its task.

        //jm1.start();
        //jm2.start();

        jm1.start();
        try{
            jm1.join();
        }catch (InterruptedException e){
            System.out.println("InterruptedException "+e);
        }

        jm2.start();

        /*

        Without join method our both threads will execute simultaneously and output will be:
        1
        1
        2
        2
        3
        3

        After joining thread 1(jm1) will get executed and after completing it "thread 2(jm2)" will bw executed
        1
        2
        3
        1
        2
        3
        */


    }
}

