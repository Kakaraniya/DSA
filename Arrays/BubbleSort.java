package Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {33,51,62,13,52,333,7};
        boolean swapped = false;
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if(!(swapped)){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
