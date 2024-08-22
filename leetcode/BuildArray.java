package leetcode;
//https://leetcode.com/problems/build-array-from-permutation/description/
import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    static int[] buildArray(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        for(int i = 0; i<l; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}