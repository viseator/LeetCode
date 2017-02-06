package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class TwoSum2 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) return new int[]{i + 1, j + 1};
            else if (numbers[i] + numbers[j] > target) j--;
            else i++;
        }
        return null;
    }
}
