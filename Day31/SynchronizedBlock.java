package Day31;

class Transactions {
    String tranNo;

    public void TransactionsNew(String tranNo) {
        //This will be unsynchronized
        /*for (int i = 1; i <= 3; i++) {
            System.out.println("Transaction no." + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }*/

        //This will be unsynchronized and follow multithreading.
        System.out.print("[ "+tranNo);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println(" ]");

        //These transactions will be synchronized and in order
        synchronized (this) {
            System.out.print("[ "+tranNo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(" ]");
        }
    }
}

class TransactionRunner extends Thread{
    Transactions t1;
    String tranNo;
    TransactionRunner(Transactions t1Local, String tranNo){
        this.t1 =t1Local;
        this.tranNo = tranNo;
        start();
    }

    public void run(){
        t1.TransactionsNew(tranNo);
    }
}

public class SynchronizedBlock {
    public static void main(String []args){
        Transactions TObj = new Transactions();
        TransactionRunner tr1 = new TransactionRunner(TObj, "Tran_1");
        TransactionRunner tr2 = new TransactionRunner(TObj, "Tran_2");
        TransactionRunner tr3 = new TransactionRunner(TObj, "Tran_3");


    }
}
