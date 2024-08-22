package Arrays;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int rotationCount = findPivotinDuplicateVals(nums);
        System.out.println(rotationCount+1);
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
}
