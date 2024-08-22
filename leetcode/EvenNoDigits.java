//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
package leetcode;

public class EvenNoDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if (even(num))
                count ++;
        }
        return count;

    }

    static boolean even(int num){
        if(noOfDigits(num)%2 == 0 )
            return true;
        return false;
    }

    static int noOfDigits(int num){
        if (num<0)
            num = num*-1;
        return ((int)(Math.log10(num))+1);
    }
}
