package leetcode;

//https://leetcode.com/problems/find-peak-element/description/
public class PeakInMountain {
    public static void main(String[] args){
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {  // Changed to start < end
            mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;  // Returning the index of the peak
    }
}
