package Practice_Problems.Edabit_Practice_problems;
/*
* On/Off Switches
Create a function that returns how many possible outcomes can come from a certain number of switches (on / off).
* */
public class Question_80 {
    public static void main(String [] args){
        System.out.println(posCom(10)); //1024
    }

    public static int posCom(int n){
        return (int)Math.pow(2, n);
    }
}
