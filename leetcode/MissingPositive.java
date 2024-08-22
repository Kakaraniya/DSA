//https://leetcode.com/problems/first-missing-positive/description/
package leetcode;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int nums[] = {3,4,-1,1};
        System.out.println((firstMissingPositive(nums)));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] -1;
            if(nums[i]>0 && nums[i]<=nums.length &&nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else
                i++;
        }
        for(i = 0; i<nums.length; i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length+1;
    }

    static void swap(int[] nums, int i, int correctIndex ){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
