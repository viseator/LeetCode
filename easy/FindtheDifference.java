package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/8/17.
 * Wu Di
 * viseator@gmail.com
 */
public class FindtheDifference {
    public static void main(String[] args) {

    }

    public static char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (int c : chars) {
            c = 0;
        }
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if(--chars[c - 'a']<0) return c;
        }
        return 1;
    }
}