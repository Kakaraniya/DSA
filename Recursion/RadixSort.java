package Recursion;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {70,30,50,100,298,35};
        radixSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void radixSort(int[] arr, int low, int hi){
        if(low>=hi)
            return;
        int s = low, e = hi;
        int m = s + (e-s)/2;
        int pivot = arr[m];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e--;
                s++;
            }
        }
        radixSort(arr, low, e);
        radixSort(arr, s, hi);
    }
}
