package Headfirst_Book;

public class ElectricGuitar{
    public static void main(String [] args){
    ElectricGuitar1 e1 = new ElectricGuitar1();
    //e1.getBrandName();
    //Printing value of getter which is null or 0 because we have'nt declared it
    System.out.println(e1.getBrandName());
    System.out.println(e1.getNumberOfPickups());
    System.out.println(e1.getRockStarUsesIt());

    //Setting the values
    System.out.println();
    System.out.println("Printing the values after setting values: ");
    e1.setBrandName("Adidas");
    e1.setRockStarUsesIt(true);
    e1.setNumberOfPickups(52);

    System.out.println(e1.getBrandName());
    System.out.println(e1.getNumberOfPickups());
    System.out.println(e1.getRockStarUsesIt());



    }
}

class ElectricGuitar1 {


    String BrandName ;
    int NumberOfPickups;
    boolean RockStarUsesIt;

    String getBrandName() {
        return BrandName;
    }

    void setBrandName(String brand1) {
        BrandName = brand1;
    }

    int getNumberOfPickups() {
        return NumberOfPickups;
    }
    void setNumberOfPickups(int numOfP){
        NumberOfPickups = numOfP;
    }

    boolean getRockStarUsesIt(){
        return RockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo){
        RockStarUsesIt = yesOrNo;
    }

}


