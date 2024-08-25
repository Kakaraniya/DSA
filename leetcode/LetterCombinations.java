//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/1367939034/
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        String[] letterMapping = {
                "",    // 0
                "",    // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs",// 7
                "tuv", // 8
                "wxyz" // 9
        };
        if(digits.isEmpty())
            return combinations;
        combinations = phonePadRet("", digits, letterMapping);

        return combinations;

    }


    static ArrayList phonePadRet(String p, String up, String[] letterMapping){

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
       String str = letterMapping[digit];
        for (int i = 0; i< str.length(); i++) {
            ans.addAll(phonePadRet(p + str.charAt(i), up.substring(1), letterMapping));
        }
        return ans;
    }
}
