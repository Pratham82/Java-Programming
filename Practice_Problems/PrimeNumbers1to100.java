package Practice_Problems;

public class PrimeNumbers1to100 {
	public static void main(String[] args) {
		
		int count = 0;

		//This loop will traverse through 2-100(1 is not a prime so we will start from 2)
		for(int i=2 ; i<=100; i++) {
			//j will traverse through 2 to i-1(i.e if i=3 then it will run till 3-1 =2)
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					//if the number is completely divisible from any number
					//Then count's value will be increased
					count = count + 1;
				}
			}
			if (count == 0) {
				//If the number is not divisible by any number
				// then count's value will be zero
				System.out.println(i);
			} else {
				//Re-initiate the count variable to 0 if the number is not prime
				//Count's value will be again start from 0
				count=0;
			}
		}

	}
}




