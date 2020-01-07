package Day12;

public class MainClass{
	public static void main(String [] args){
	Customer c= new Customer();
	System.out.println(c); 	    //This will the Customer details
	int ID = c.getCustomerID(); //Storing the value of getCustomer ID in ID variable
	System.out.println(ID);     //This will print the value of Customer ID 	

	c.setCustomerID(3001);     //Here the value of customer ID will be replaced with latest customer ID i.e(3001)
	System.out.println(c.getCustomerID());    //This will print the value of replaced customer ID which is set in above method

	}
}   
