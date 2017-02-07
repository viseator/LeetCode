package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class ReverseVowelsofaString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        String vowel = "aeiouAEIOU";
        int i = 0, j = s.length() - 1;
        while (i <j) {
            while (!vowel.contains(s.charAt(i)+"") && i < j) {
                i++;
            }
            while (!vowel.contains(s.charAt(j)+"") && i < j) {
                j--;
            }
            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, s.charAt(i));
            i++;
            j--;
        }
        return sb.toString();
    }
}
