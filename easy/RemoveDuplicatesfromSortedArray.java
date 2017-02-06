package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println("Nums:" + removeDuplicates(nums));
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int goodPos = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length - 1 &&nums[i] == nums[i + 1]) {
                i++;
            }
            nums[goodPos++] = nums[i];
        }
        return goodPos;
    }
}
