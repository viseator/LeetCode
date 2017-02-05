package xyz.viseator.leetcode.easy;

import java.util.*;

/**
 * Created by viseator on 2/5/17.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3, 3}, 6);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
/*Solution one
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
*/
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (map.containsKey(com) && map.get(com) != i) {
                return new int[]{map.get(com), i};
            }
            map.put(nums[i], i);
        }
        return null;

    }

}
