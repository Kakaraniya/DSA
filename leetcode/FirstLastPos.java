package leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstLastPos {
    public static void main(String[] args){
        int[] arr = {};
        int target = 6;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] nums, int target) {

        int firstIndex = search(nums,target,true);
        int lastIndex = -1;
        if(firstIndex!=-1)
            lastIndex= search(nums,target,false);
        int[] ans = new int[]{firstIndex, lastIndex};
        return ans;
    }
    static int search(int[] nums, int target, Boolean isFirst){
        int start = 0;
        int end = nums.length-1;
        int mid,ans=-1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]>target){
                end = mid - 1;
            }
            else if(nums[mid]<target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(isFirst){
                    end = mid -1 ;
                }
                else
                    start = mid + 1;
            }

        }
        return ans;
}
}
