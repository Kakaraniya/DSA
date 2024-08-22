//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNosArray {
    public static void main(String[] args) {
        int[] nos = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nos));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] -1;
            if(nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else
                i++;
        }

        for( i = 0 ; i<nums.length; i++){

                if(i != nums[i]-1)
                    list.add(i+1);
        }
        return list;
    }

    static void swap(int[] nums, int i, int correctIndex ){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
