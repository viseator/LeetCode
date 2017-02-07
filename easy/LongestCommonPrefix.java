package xyz.viseator.leetcode.easy;

import java.util.Objects;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
/*Bad
        if(strs.length==0) return "";

        int i = 0;
        for (; ; ) {
            if(Objects.equals(strs[0], "")) return "";
            char nowChar;
            if (strs[0].length() > i) {
                nowChar = strs[0].charAt(i);
            } else {
                return strs[0].substring(0, i);
            }
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].equals("")) {
                    return "";
                }
                if (i >= strs[j].length() || strs[j].charAt(i) != nowChar) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }*/
        if (strs == null || strs.length == 0) {
            return "";
        }
        int i = 0;
        String prefix = strs[0];
        while (i < strs.length) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            i++;
        }
        return prefix;
    }
}
