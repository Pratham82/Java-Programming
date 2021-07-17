package Day36;

import java.util.Comparator;

public class ComparatorClass {
    private int CustomerID;
    private String CustomerName;
    private int CustomerBalance;


    public ComparatorClass(int customerID, String customerName, int customerBalance) {
        CustomerID = customerID;
        CustomerName = customerName;
        CustomerBalance = customerBalance;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getCustomerBalance() {
        return CustomerBalance;
    }

    public void setCustomerBalance(int customerBalance) {
        CustomerBalance = customerBalance;
    }

    @Override
    public String toString() {
        return "ComparatorClass{" +
                "CustomerID=" + CustomerID +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerBalance=" + CustomerBalance +
                '}';
    }
}

class CompareID implements Comparator<ComparatorClass>{
    @Override
    public int compare(ComparatorClass c1, ComparatorClass c2) {
        return c1.getCustomerID() -c2.getCustomerID();
    }
}

class CompareName implements Comparator<ComparatorClass>{
    @Override
    public int compare(ComparatorClass c1, ComparatorClass c2) {
        return c1.getCustomerName().compareTo(c2.getCustomerName());
    }
}




