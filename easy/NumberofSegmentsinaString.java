package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class NumberofSegmentsinaString {
    public static void main(String[] args) {

    }
    public static int countSegments(String s) {
        String[] segments = s.split(" ");
        int count = 0;
        for (String word : segments) {
            if (!word.equals("")) count++;
        }
        return count;
    }
}
