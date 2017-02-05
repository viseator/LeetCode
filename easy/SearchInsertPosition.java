package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/5/17.
 * Wu Di
 * viseator@gmail.com
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 7};
        System.out.println(searchInsert(nums, 8));
    }

    public static int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private static int search(int[] nums, int start, int end, int target) {
        if (start == end) {
            if (nums[start] >= target) return start;
            else return start + 1;
        } else {
            int middle = (start + end) / 2;
            if (target == nums[middle]) return middle;
            else if (target > nums[middle]) {
                return search(nums, middle + 1, end, target);
            } else {
                return search(nums, start, middle, target);
            }
        }
    }
}
