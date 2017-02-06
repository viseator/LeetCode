package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class MaximumSubarray {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
/*Best
        int sum = 0;
        int maxSum = nums[0];
        for (int num : nums) {
            sum += num;
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;*/

//Divide And Conquer
       return findMax(nums, 0, nums.length - 1);
    }

    public static int findMax(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        int middle = (left + right) / 2;
        int tempSum = 0, maxSumOfLeft = nums[middle];
        for (int i = middle; i >= left; i--) {
            tempSum += nums[i];
            if (tempSum > maxSumOfLeft) maxSumOfLeft = tempSum;
        }

        int maxSumOfRight = nums[middle + 1];
        tempSum = 0;
        for (int i = middle + 1; i <= right; i++) {
            tempSum += nums[i];
            if (tempSum > maxSumOfRight) maxSumOfRight = tempSum;
        }

        return Math.max(Math.max(findMax(nums, left, middle), findMax(nums, middle + 1, right)),
                maxSumOfLeft + maxSumOfRight);

    }
}
