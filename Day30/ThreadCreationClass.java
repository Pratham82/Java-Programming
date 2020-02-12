package Day30;

/*Extend thread class which is present in java.lang package
After extending override run method
Create object of our child class which is extending Thread class
And then invoke start method to execute run method
 */
public class ThreadCreationClass  extends  Thread{
    public void run(){
        System.out.println("Thread creation using thread class");
    }

    public static void main(String[] args) {
        ThreadCreationClass tcc = new ThreadCreationClass();
        tcc.start();
    }
}

