package leetcode;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
import java.util.ArrayList;
import java.util.List;

public class KidsCandies {
    public static void main(String[] args){
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        kidsWithCandies(candies,extraCandies);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> listss = new ArrayList<>(3);
        int kid;
        for(int i = 0 ; i < candies.length ; i++){
            kid = extraCandies+candies[i];
            if (kid >= findMax(candies))
                  listss.add(true);
            else
                listss.add(false);
        }

        for(int i = 0 ; i<candies.length; i++){
            System.out.print(listss.get(i)+" ");
        }

        return listss;
    }
    static int findMax(int[] arr){

        int max = 0;
        for(int j = 0;j<arr.length; j++){
            if (arr[j]> max)
                max = arr[j];
        }
        return max;
    }
}
