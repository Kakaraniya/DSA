package Arrays;

import java.util.Arrays;

public class Cycle {
    public static void main(String[] args){
        int nums[] = {3,4,2,1,6,5};
        System.out.println(Arrays.toString(cycle(nums)));
    }
    static int[] cycle(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] -1;
            if(nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else
                i++;
        }
       return nums;
    }
    static void swap(int[] nums, int i, int correctIndex ){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
