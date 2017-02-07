package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class RansomNote {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf('a'));

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chas = new int[26];
        for (int i = 0; i < 26; i++) {
            chas[i] = 0;
        }

        for (int i = 0; i < magazine.length(); i++) {
            chas[magazine.charAt(i) - 97]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--chas[ransomNote.charAt(i) - 97] < 0) return false;
        }
        return true;
    }
}
