package Day12;

public class Customer{
	int CustomerID = 109;
	String CustomerName = "Instance Customer" ;
        String Email = "instance@gamil.com";
        String Pass = "instance@pass";
	
	Customer(){
		System.out.println("This is Non Parameterized constructor");
	}

	Customer(int CustomerID, String CustomerName, String Email, String Pass){
		System.out.println("This is Parameterized Variable");	
		this.CustomerID = CustomerID;
		this.CustomerName = CustomerName;
		this.Email = Email;
		this.Pass = Pass;
	}

	//Creating toStirng method to return all customer details it converts all the values to string and by printing the object of this customer class
	public String toString(){
		return "Customer details: [Customer ID="+CustomerID+",Customer Name= "+CustomerName+",Email ID= "+Email+",Password= "+Pass+" ]";

	}

	//Creating Getter that will get the variable from the current class	
 	//This is Getter method which shows CustomerID value
	public int getCustomerID(){
		return CustomerID;
	}
	
	//This is Setter method, any value which is entered in the parameter will be replaced with customerID
	public void setCustomerID(int CustomerID){
		this.CustomerID = CustomerID;
	}
}	

