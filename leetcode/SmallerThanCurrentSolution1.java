package leetcode;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
import java.util.Arrays;

public class SmallerThanCurrentSolution1 {

    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        return res;
    }

}
