package Day13;

public class DemoMain{
	public static void main(String [] args){
		Demo d = new Demo();
		d.print();

		Demo d1 = new Demo();
		d1.print();

	}
}

	class Demo{
		static int Var_A = 1;
		       int Var_B = 1;

		       Demo(){
			      Var_A++;
			      Var_B++;
		       }

		       public void print(){
			       System.out.println("Value of Var_A = "+ Var_A);
			       System.out.println("Value of Var_B = "+ Var_B);
		       }
	}
