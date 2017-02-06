package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/5/17.
 * Wu Di
 * viseator@gmail.com
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void moveZeroes(int[] nums) {
        int zeros = (nums[0] == 0) ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else if (zeros != 0) {
                nums[i - zeros] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
