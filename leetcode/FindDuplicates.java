//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nos = {5,4,6,7,9,3,10,9,5,6};
        System.out.println(findDuplicates(nos));
    }
    static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            if(nums[i]!= i+1){
                int correctIndex = nums[i]-1;
                if(nums[i]!= nums[correctIndex])
                    swap(nums, i, correctIndex);
                else{
                    list.add(nums[i]);
                    i++;
                }
            }
            else
                i++;
        }

        return list;
    }

    static void swap(int[] nums, int i, int correctIndex ){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
