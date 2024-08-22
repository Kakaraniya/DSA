package Arrays;

import java.sql.Array;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for ( int i = 0; i< nums.length; i++){
            int count = 0;
            for(int j = 0 ; j< nums.length; j++){
                if(nums[i]> nums[j] && j != i)
                    count ++;
            }
            arr[i] = count;
        }
        return arr;
    }
}
