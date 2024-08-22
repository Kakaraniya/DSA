package Arrays;

public class Floor {
    public static void main(String[] args){
        int[] arr = {5,7,9,10,17,20,26,45,70,388};
        int target = 2;

        System.out.println(findFloor(arr, target));
    }

    static int findFloor(int[] arr, int t){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        if(t<arr[start])
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
        return arr[end];
    }
}
