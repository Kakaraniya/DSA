//https://leetcode.com/problems/set-mismatch/submissions/1311470301/
package leetcode;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int nums[] = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] -1;
            if(nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else
                i++;
        }
        for(i = 0; i<nums.length; i++){
            if(nums[i]!= i+1)
                return new int[]{nums[i], i+1};
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] nums, int i, int correctIndex ){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
