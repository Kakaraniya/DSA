package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutationRet("","abc"));
        System.out.println(permutationCount("","abc"));
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutation(first+ch+second, up.substring(1));
        }
    }
    static ArrayList permutationRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> l = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
           l.addAll(permutationRet(first+ch+second, up.substring(1)));
        }
        return l;
    }
    static int permutationCount(String p, String up){
        if(up.isEmpty()){

            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count = count + permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}
