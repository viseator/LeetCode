package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class RemoveElement {
    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        int goodPos = 0;
        for(int i =0 ;i<nums.length;i++) {
            if (nums[i] != val) {
                nums[goodPos++] = nums[i];
            }
        }
        return goodPos;
    }
}
