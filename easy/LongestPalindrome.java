package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/9/17.
 * Wu Di
 * viseator@gmail.com
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("adasdsa"));
    }

    public static int longestPalindrome(String s) {
        int[] chars = new int[128];
        for (char c : s.toCharArray()) {
            chars[c]++;
        }
        int result = 0;
        int plus = 0;
        for (int i = 0; i < 128 ; i++) {
            if (chars[i] % 2 == 0) {
                result += chars[i];
            } else {
                result += chars[i] - 1;
                plus = 1;
            }
        }
        return result + plus;
    }
}
