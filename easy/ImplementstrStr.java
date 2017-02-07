package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class ImplementstrStr {
    public static void main(String[] args) {

    }

    public static int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle); Joke
        if(needle.equals("")) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean found = true;
            for (int j = i; j < i + needle.length(); j++) {
                if (haystack.charAt(j) != needle.charAt(j - i)) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }
        return -1;
    }
}