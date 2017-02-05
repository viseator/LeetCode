package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/5/17.
 * Wu Di
 * viseator@gmail.com
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        rotate(nums, 2);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - k) {
                temp[i + k] = nums[i];
            } else {
                temp[i - nums.length + k] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++)
            nums[i]=temp[i];

    }
}
