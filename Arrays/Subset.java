//package Arrays;
//import java.util.*;
//public class Subset {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30};
//
//        List<List<Integer>> ans = subset(arr);
//        for (List<Integer> list : ans) {
//            System.out.println(list);
//        }
//    }
//    static List<List<Integer>> subset(int[] arr) {
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        for (int num : arr) {
//            int n = outer.size();
//            for (int i = 0; i < n; i++) {
//                List<Integer> internal = new ArrayList<>(outer.get(i));
//                internal.add(num);
//                outer.add(internal);
//            }
//        }
//        return outer;
//    }
//    static List<List<Integer>> subset1(int[] arr){
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//    }
//
//}
