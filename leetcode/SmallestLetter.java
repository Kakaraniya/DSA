package leetcode;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {

        public static void main(String[] args){
            char[] arr = {'c','f','j'};
            int target = 'g';

            System.out.println(findFloor(arr, target));
        }

        static char findFloor(char[] letters, int t){
            int start = 0;
            int end = letters.length - 1;
            int mid;

            while(start<=end){
                mid = start + (end-start)/2;
                if(t<letters[mid])
                    end = mid-1;
                else   {
                    start = mid + 1;
                }
            }

            return letters[start% (letters.length)];
        }


}
