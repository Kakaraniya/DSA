//package leetcode;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LetterCombinations {
//    public static void main(String[] args) {
//        System.out.println(letterCombinations("23"));
//    }
//    public static List<String> letterCombinations(String digits) {
//        List<String> combinations = new ArrayList<>();
//        String[] letterMapping = {
//                "",    // 0
//                "",    // 1
//                "abc", // 2
//                "def", // 3
//                "ghi", // 4
//                "jkl", // 5
//                "mno", // 6
//                "pqrs",// 7
//                "tuv", // 8
//                "wxyz" // 9
//        };
//
//        backtracking(0,letterMapping,digits,combinations, new StringBuilder());
//
//        return combinations;
//
//    }
//
//    private static void backtracking(int index, String[] letterMapping, String digits, List<String> combinations, StringBuilder path){
//        if (path.length()==digits.length()){
//            combinations.add(path.toString());
//            return;
//        }
//
//        String possibleLetters = letterMapping[digits.charAt(index) - '0'];
//        if (possibleLetters != null) {
//            for (int i = 0; i < possibleLetters.length(); i++) {
//                path.append(possibleLetters.charAt(i));
//                if (path.length() <= digits.length()) {
//                    backtracking(index + 1, letterMapping, digits, combinations, path);
//                }
//            }
//        }
//    }
//}
