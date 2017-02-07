package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class CountandSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        for (int i = 1; i < n; i++) {
            String s = sb.toString();
            sb = new StringBuilder();
            int j = 0;
            while (j < s.length()) {
                int count = 1;
                while (j < s.length() - 1 && s.charAt(j + 1) == s.charAt(j)) {
                    count++;
                    j++;
                }
                sb.append(String.valueOf(count));
                sb.append(s.charAt(j++));
            }
        }
        return sb.toString();
    }

}
