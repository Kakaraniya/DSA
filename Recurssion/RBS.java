package Recurssion;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {40,50,60,70,80,1,2};
        int t = 2;
        System.out.println(search(arr,0,arr.length,t));
    }
    static int search(int[] arr, int s, int e, int target){
        int m = s+(e-s)/2;
        if(target==arr[m])
            return m;
        if(s<=m){
            if(target<=arr[m]&&target>=arr[s]){
                return search(arr,s,m-1,target);
            }
            else{
                return search(arr,m+1,e,target);
            }
        }
        if(target>arr[m]&&target<arr[e])
            return search(arr,m+1,e,target);

        return search(arr,s,m-1,target);
    }
}
