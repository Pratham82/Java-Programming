package Practice_Problems.Edabit_Practice_problems.Wam_up.How_much_is_true;

public class Solution {
    public static void main(String[] args) {
        boolean[] arr = new boolean[] { true, false, false, true, false };

        // Calling a method without instantiating an object, by declaring a method as static
        System.out.println(Solution.countTrue(arr));

        // Calling method with instantiating an object
        Solution s1 = new Solution();
        System.out.println("Count true normal");
        System.out.println(s1.countTrueNormal(arr));

        Count_Interface ci = () ->{
            System.out.println("Called lambda method");
            int count = 0;
            for(boolean bool : arr)
                if(bool) count += 1;
            System.out.println(count);
        };

        ci.count_true_I_method();

    }
    public static int countTrue(boolean[] arr) {
        int count = 0;
        // Using normal for loop
//        for(int i = 0; i< arr.length;i++){
//            if (arr[i] == true){
//                count += 1;
//            }
//        }
//        return count;
        // Using for of loop
        for(boolean bool : arr){
            if(bool) count += 1;
        }
        return count;
    }

    public  int countTrueNormal(boolean[] arr) {
        int count = 0;

        // Using enhanced for of loop
        for(boolean bool : arr)
            if(bool) count += 1;
        return count;
    }

    interface  Count_Interface{
        public void count_true_I_method();
    }

}
