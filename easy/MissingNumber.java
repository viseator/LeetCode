package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        int numsSum = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum += i;
            numsSum += nums[i - 1];
        }
        return sum - numsSum;
    }
}
