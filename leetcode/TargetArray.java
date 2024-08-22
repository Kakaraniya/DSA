package leetcode;
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i= 0 ; i< nums.length; i++){
            for(int j = nums.length-1; j>=index[i]; j--){

            }
        }
        return target;
    }
}
