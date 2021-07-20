package Learn_OOP_in_Java.Constructors;

public class Date {
    private int Day, Week, Month, Year;
    private String event;

    // Creating a constructor to initialize the values
    public Date() {
        this.Day = 1;
        this.Week = 1;
        this.Month = 1;
        this.Year = 1;
    }

    // Parameterized constructor
    //  "this" refers to the class object itself.
    public Date(int d, int w, int m, int y) {
        this.Day = d;
        this.Week = w;
        this.Month = m;
        this.Year = y;
        System.out.println("Called 2nd Constructor");
    }

    // Calling a constructor from another constructor
    public Date(int d, int w, int m, int y, String event) {
        this(d, w, m, y);// Calling constructor
        this.event = event;
        System.out.println("Called 3rd Constructor");

    }

    // Function to print all the values in Class
    public void printDate() {
        System.out.printf("Day: %s\nWeek: %s\nMonth: %s\nYear: %s%nEvent: %s\n", Day, Week, Month, Year, event);
    }

}

class DateRunner {
    public static void main(String[] args) {
        System.out.println("Date runner called");

        // Instantiating Date
        Date d1 = new Date();
        d1.printDate();

        // Instantiating from a parameterized constructor
        // We are basically overloading the default constructor to accommodate our preferred values for the data members.
        Date d2 = new Date(2, 3, 3, 2001);
        d2.printDate();

        // Calling the 3rd constructor
        Date d3 = new Date(31, 3, 12, 2020, "New Year!!");
        d3.printDate();
    }
}

// The default constructor does not need to be explicitly defined. Even if we don’t create it, the JVM will call a default constructor and set data members to null or 0.


// If you don’t define any constructor, the Java compiler will insert a default constructor for you. Thus, once the class is compiled it will always at least have a no-argument constructor.:w
