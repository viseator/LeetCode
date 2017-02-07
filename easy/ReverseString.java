package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class ReverseString {
    public static void main(String[] args) {

    }
    public static String reverseString(String s) {
        char[] string = new char[s.length()];
        int j = 0;
        for(int i=s.length()-1;i>=0;i--) {
            string[j++] = s.charAt(i);
        }
        return new String(string);
    }
}
