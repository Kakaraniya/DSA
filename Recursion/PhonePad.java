package Recursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        //phonePad("", "23");
        System.out.println(phonePadRet("", "23"));
    }

    static void phonePad(String p, String up){

            if (up.isEmpty()) {
                System.out.println(p);
                return;
            }
            int digit = up.charAt(0) - '0'; // this will convert '2' into 2
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                phonePad(p + ch, up.substring(1));
            }

    }

    static ArrayList phonePadRet(String p, String up){

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(phonePadRet(p + ch, up.substring(1)));
        }
        return ans;
    }


}
