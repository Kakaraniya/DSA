package Recurssion;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {40,50,60,70,80};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr, int index){
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }
}
