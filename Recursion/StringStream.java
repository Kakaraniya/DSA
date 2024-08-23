package Recursion;

public class StringStream {
    public static void main(String[] args) {
        //skip("", "aagaaya");
        //System.out.println(skip1("aagaaya"));
        System.out.println(skipApple("bcapplede"));
        System.out.println(skipAppNotApple("appledeappzzz"));
    }
    static void skip(String processed, String unprocessed){
        if(unprocessed == ""){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a')
            skip(processed,unprocessed.substring(1));
        else
            skip(processed + ch, unprocessed.substring(1));
    }

    static String skip1(String up){
        if(up == "")
            return "";
        char ch = up.charAt(0);
        if(ch == 'a')
            return skip1(up.substring(1));
        else
            return ch + skip1(up.substring(1));
    }

    static String skipApple(String up){
        if(up == "")
            return "";
        if(up.startsWith("apple"))
            return (up.substring(5));
        else
            return up.charAt(0) + skipApple(up.substring(1));
    }
    static String skipAppNotApple(String up){
        if(up == "")
            return "";
        if(up.startsWith("app") && !up.startsWith("apple"))
            return skipAppNotApple(up.substring(3));
        else
            return up.charAt(0) + skipAppNotApple(up.substring(1));
    }
}
