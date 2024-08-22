package Recurssion;

public class Subsequence {
    public static void main(String[] args) {
        subsequence("", "abc");
    }
    static void subsequence(String p, String up){
        if(up == ""){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p+ch, up.substring(1));
        subsequence(p,up.substring(1));
    }
}
