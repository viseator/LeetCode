package xyz.viseator.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by viseator on 2/9/17.
 * Wu Di
 * viseator@gmail.com
 */
public class FindAllAnagramsinaString {
    public static void main(String[] args) {
    }

    public List<Integer> findAnagrams(String s, String p) {
        int[] chas = new int[26];
        List<Integer> result = new ArrayList<>();
        for (char c : p.toCharArray())
            chas[c - 'a']++;
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            int[] copy = chas.clone();
            boolean found = true;
            for (int j = i; j < i+p.length(); j++) {
                if (--copy[s.charAt(j) - 'a'] < 0) {
                    found = false;
                    break;
                }
            }
            if (found) result.add(i);
        }
        return result;
    }
}
