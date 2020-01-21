package Practice_Problems;
//Finding the number between 33 and 99 which square = 1st 2 digits + 2nd 2 digits
//Eg. 45*45 = 2025 = 20 + 25 = 45
public class SpecialNumber {
    public static void main(String[] args) {
        int SquareOfNum =0;
        int div1;
        int div2;
        int SumOfDivs=0;
        for(int i=33; i<=99;i++){
            SquareOfNum = i*i;
            div1 = SquareOfNum%100;
            div2 = SquareOfNum/100;

            SumOfDivs = div1 + div2;
            if(SumOfDivs==i){
                System.out.println(i);
            }
        }
    }
}
