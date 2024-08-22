//https://leetcode.com/problems/count-items-matching-a-rule/description/
package leetcode;

import java.util.Arrays;
import java.util.List;

public class MatchingRule {
    public static void main(String[] args) {
//        String[][] str = {
//                {"phone","blue","pixel"},
//                {"computer","silver","lenovo"},
//                {"phone","gold","iphone"}
//        };
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result =0;

        for(int i = 0; i<items.size();i++){
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0)))
                result ++;
            if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1)))
                result ++;
            if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2)))
                result ++;

        }
        return result;

    }
}
