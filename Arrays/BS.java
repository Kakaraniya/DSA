package Arrays;

import java.util.Arrays;

public class BS {
    public static void main(String[] args) {
        int[] arr = {0,1,40,50,60,70};
        int target = 7000;
        System.out.println(bS(arr,target));
    }
    static int bS(int[] arr, int target){
      int start = 0;
      int end = arr.length-1;
      while(start<=end){
          int mid = start + (end-start)/2;
          if(target>arr[mid]){
              start = mid+1;
          }
          else if(target<arr[mid]){
              end = mid - 1;
          }
          else{
              return mid;
          }
      }
      return -1;
    }
}
