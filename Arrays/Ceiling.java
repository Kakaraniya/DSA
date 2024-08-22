package Arrays;

public class Ceiling {
    public static void main(String[] args){
        int[] arr = {5,7,9,10,17,20,26,45,70,388};
        int target = 21;

        System.out.println(findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int t){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        if(t>arr[end])
            return -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(t<arr[mid])
                end = mid-1;
            else if (t>arr[mid]) {
                start = mid + 1;
            }
            else
                return arr[mid];
        }
        return arr[start];
    }
}
