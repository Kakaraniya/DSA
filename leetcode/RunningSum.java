package leetcode;
//https://leetcode.com/problems/running-sum-of-1d-array/description/
import java.util.Arrays;

public class RunningSum {
    public static void main(String args[]){
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = nums[0];
        runningSum[0]=sum;
        if(nums.length == 0)
            return runningSum;
        for(int i = 1; i<nums.length;i++){
            runningSum[i] = sum + nums[i];
            sum=runningSum[i];
        }
        return runningSum;
    }

}
