//https://leetcode.com/problems/find-the-duplicate-number/submissions/1311274165/
package leetcode;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nos = {1,3,4,2,2};
        System.out.println((findDuplicate(nos)));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]!= i+1){
                int correctIndex = nums[i]-1;
                if(nums[i]!= nums[correctIndex])
                    swap(nums, i, correctIndex);
                else
                    return nums[i];
            }
            else
                i++;
        }

        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
