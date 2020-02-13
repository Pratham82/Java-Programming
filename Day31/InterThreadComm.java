package Day31;

import org.w3c.dom.ls.LSOutput;

class BankTransactions {
    int amount = 1000;
    public synchronized void Withdraw(int amount){
        System.out.println("Getting ready for withdrawal");
        if(this.amount<amount){
            System.out.println("Low balance in the machine please wait");
            try{
                wait(100);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println(amount+ " withdrawn");
    }

    public synchronized void Deposit(int amount){
        System.out.println("Getting ready for deposit");
        this.amount+= amount;
        System.out.println(amount +" deposited");
        //Notify wil notify other threads that it's work has been done now other threads cn access resources
        notify();
    }
    public synchronized void  DisplayBalance(){
        System.out.println("Balance remaining: "+amount);
    }
}

public class InterThreadComm {
    public static void main(String[] args) {
        BankTransactions bt = new BankTransactions();
        Thread t1 = new Thread(){
            public void run(){
                bt.Withdraw(1500);
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                bt.Deposit(500);
            }
        };
        t2.start();

        Thread t3 = new Thread(){
            public void run() {
                bt.DisplayBalance();
            }
        };
        t3.start();

    }
}
