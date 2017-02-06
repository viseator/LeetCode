package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int maxLength = 0;
        while (i < nums.length && maxLength < nums.length - i) {
            while (i < nums.length && nums[i] == 0) {
                i++;
            }
            int length = 0;
            while (i < nums.length && nums[i] == 1) {
                if (++length > maxLength) maxLength = length;
                i++;
            }
        }
        return maxLength;
    }
}