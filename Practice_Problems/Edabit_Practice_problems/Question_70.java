package Practice_Problems.Edabit_Practice_problems;

/*
* Create a function that takes in an array (slot machine outcome) and returns
* true if all elements in the array are identical, and false otherwise. The array will contain 4 elements.
* testJackpot(["SS", "SS", "SS", "SS"]) ➞ true

testJackpot(["&&", "&", "&&&", "&&&&"]) ➞ false

testJackpot(["SS", "SS", "SS", "Ss"]) ➞ false
* */
public class Question_70 {
    public static void main(String[] args) {
//        String s1[] = new String[]{"one", "two"};
        String[] s1 = new String[] {"&&", "&", "&&&", "&&&&"};
        String[] s2 = {"abc", "abc", "abc", "abc"};
        System.out.println(testJackpot(s1));
        System.out.println(testJackpot(s2));
    }

    public static boolean testJackpot(String[] result) {
        int notCorrect = 0;
        for (int i = 0; i < result.length; i++) {
            if (!result[0].equals(result[i])) {
                notCorrect++;
            }
        }
        return notCorrect==0;
    }

    /*
    * public static boolean testJackpot(String[] result) {
		return 1 == Arrays.stream(result)
			.distinct()
			.count();
	}
    * */
}
