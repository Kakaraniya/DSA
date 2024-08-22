package leetcode;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5}; int k = 2;
        int i = splitArray(nums,k);
        System.out.println(i);
    }
    static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start,nums[i] );
            end += nums[i];
        }

        while(start<end){
            int mid = start + (end-start)/2;
            int pieces = 1;
            int sum = 0;
            for(int num: nums){
                if(sum+num>mid){
                    sum = num;
                    pieces ++;
                }
                else
                    sum += num;
            }

            if(pieces>k){
                start = mid+1;
            }
            else
                end = mid;
        }


        return end;
    }
}
