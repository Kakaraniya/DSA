package leetcode;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedBS {
    public static void main(String[] args) {
        int[] nums = {3,3,4,1,1,2,2,2,3,3};
        int target = 4;
        System.out.println(search(nums,target));
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1])
                return mid;
            else if (start<mid && nums[mid-1]> nums[mid]) {
                return (mid-1);
            }
            else if (nums[start] >= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    static int findPivotinDuplicateVals(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (start < mid && nums[mid - 1] > nums[mid]) {
                return (mid - 1);
            }

            if(nums[start] == nums[mid] && nums[start] == nums[end]){
                if(start < end &&nums[start]> nums[start+1])
                    return start;
                start ++;
                if(end > start && nums[end]< nums[end-1])
                    return end-1;
                end --;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid]> nums[end])){
                start = mid + 1;
            }
            else
                end = mid - 1;

        }
        return -1;
    }

    static int binarySearch(int[] arr, int t, int start, int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (t < arr[mid]) {
                end = mid - 1;
            } else if (t > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
    }
        return -1;
    }
    static int search(int[] nums, int target) {
       // int pivotIndex = findPivot(nums);
        int pivotIndex = findPivotinDuplicateVals(nums);
        int targetIndex;
        if (pivotIndex==-1) {
            targetIndex = binarySearch(nums, target, 0, nums.length - 1);
            return targetIndex;
        }

        if(target == nums[pivotIndex])
            return pivotIndex;

        else if(target< nums[0])
            targetIndex = binarySearch(nums,target, pivotIndex+1, nums.length-1);

        else
            targetIndex = binarySearch(nums,target, 0, pivotIndex-1);

        return targetIndex;
    }
}
