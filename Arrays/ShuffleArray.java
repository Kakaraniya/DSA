package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//omit
public class ShuffleArray {
    public static void main(String args[]){
        int[] nums = {2,5,1,3,4,7};
        int n=nums.length/2;

        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        System.out.println(ans.length);
        int j = n-1;
        for(int i = 1; i<2*n; i++){
            //int[] nums = {2,5,1,3,4,7};

            ans[i]= nums[j];
            ans[i-1] = nums[1];
            j++;
        }
        return ans;
    }

    public static class ArrayForm {
        public static void main(String[] args){
            int[] num = {2,1,5};
            int k = 806;
            System.out.println(addToArrayForm(num,k));
        }

        static List<Integer> addToArrayForm(int[] num, int k) {
            ArrayList<Integer> list = new ArrayList<>();
            int add = num[0];
            for(int i = 1; i<num.length; i++){
                add = add*10 + num[i];
            }
            System.out.println(add);
            int sum = add + k;
            while(sum>0){
                list.addFirst(sum%10);
                sum = sum/10;
            }
            return list;
        }
    }
}
